package id.co.QUIZ1_PRG7_040.dao.impl;

import id.co.QUIZ1_PRG7_040.dao.PermintaanDao;
import id.co.QUIZ1_PRG7_040.model.Permintaan;
import id.co.QUIZ1_PRG7_040.repository.PermintaanRepository;
import id.co.QUIZ1_PRG7_040.vo.PermintaanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PermintaanDaoImpl implements PermintaanDao {

    @Autowired
    private PermintaanRepository permintaanRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<PermintaanVo> getAllPermintaan() {
        String sql = "SELECT a.atk AS namaAtk, d.nama AS namaDepartemen, " +
                     "p.jumlah, p.tanggal, p.keterangan " +
                     "FROM quiz_trpermintaan p " +
                     "INNER JOIN quiz_msatk a ON p.id_atk = a.id_atk " +
                     "INNER JOIN quiz_msdepartemen d ON p.id_departemen = d.id_departemen " +
                     "ORDER BY p.tanggal DESC";
        
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            PermintaanVo vo = new PermintaanVo();
            vo.setNamaAtk(rs.getString("namaAtk"));
            vo.setNamaDepartemen(rs.getString("namaDepartemen"));
            vo.setJumlah(rs.getInt("jumlah"));
            vo.setTanggal(rs.getDate("tanggal"));
            vo.setKeterangan(rs.getString("keterangan"));
            return vo;
        });
    }

    @Override
    public void savePermintaan(Permintaan permintaan) {
        permintaanRepository.save(permintaan);
    }
}
