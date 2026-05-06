package id.co.asm1_prg7_040.dao.impl;

import id.co.asm1_prg7_040.dao.KaryawanDao;
import id.co.asm1_prg7_040.model.Karyawan;
import id.co.asm1_prg7_040.repository.KaryawanRepository;
import id.co.asm1_prg7_040.vo.KaryawanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class KaryawanDaoImpl implements KaryawanDao {

    @Autowired
    private KaryawanRepository karyawanRepository;

    @Override
    public List<KaryawanVo> getAllDataKaryawan() {
        List<Karyawan> karyawanList = karyawanRepository.findAll();
        List<KaryawanVo> karyawanVos = new ArrayList<>();
        for (Karyawan karyawan : karyawanList) {
            karyawanVos.add(new KaryawanVo(karyawan));
        }
        return karyawanVos;
    }

    @Override
    public void saveKaryawan(Karyawan karyawan) {
        karyawanRepository.save(karyawan);
    }
}
