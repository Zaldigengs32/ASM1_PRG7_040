package id.co.asm1_prg7_040.dao.impl;

import id.co.asm1_prg7_040.dao.AksesModulDao;
import id.co.asm1_prg7_040.model.AksesModul;
import id.co.asm1_prg7_040.model.AksesModulPK;
import id.co.asm1_prg7_040.repository.AksesModulRepository;
import id.co.asm1_prg7_040.repository.KaryawanRepository;
import id.co.asm1_prg7_040.repository.ModulRepository;
import id.co.asm1_prg7_040.vo.AksesModulVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AksesModulDaoImpl implements AksesModulDao {

    @Autowired
    private AksesModulRepository aksesModulRepository;

    @Autowired
    private KaryawanRepository karyawanRepository;

    @Autowired
    private ModulRepository modulRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<AksesModulVo> getAllDataAksesModul() {
        // Hanya tampilkan data akses modul yang status_modul = 1 (Aktif)
        String sql = "SELECT k.nama_karyawan, m.nama AS nama_modul, " +
                     "a.tanggal_akses, a.jam_login, a.status_akses " +
                     "FROM asm_traksesmodul a " +
                     "INNER JOIN asm_mskaryawan k ON a.id_karyawan = k.id_karyawan " +
                     "INNER JOIN asm_msmodul m ON a.id_modul = m.id_modul " +
                     "WHERE m.status_modul = 1 " +
                     "ORDER BY a.tanggal_akses DESC";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            AksesModulVo vo = new AksesModulVo();
            vo.setNamaKaryawan(rs.getString("nama_karyawan"));
            vo.setNamaModul(rs.getString("nama_modul"));
            vo.setTanggalAkses(rs.getDate("tanggal_akses"));
            vo.setJamLogin(rs.getTime("jam_login"));
            vo.setStatusAkses(rs.getString("status_akses"));
            return vo;
        });
    }

    @Override
    public boolean existsKaryawan(String idKaryawan) {
        return karyawanRepository.existsById(idKaryawan);
    }

    @Override
    public boolean existsModul(int idModul) {
        return modulRepository.existsById(idModul);
    }

    @Override
    public boolean existsAksesModul(String idKaryawan, int idModul) {
        return aksesModulRepository.existsById(new AksesModulPK(idKaryawan, idModul));
    }

    @Override
    public void saveAksesModul(AksesModul aksesModul) {
        aksesModulRepository.save(aksesModul);
    }
}
