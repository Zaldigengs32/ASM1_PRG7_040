package id.co.asm1_prg7_040.service.impl;

import id.co.asm1_prg7_040.dao.KaryawanDao;
import id.co.asm1_prg7_040.model.Karyawan;
import id.co.asm1_prg7_040.service.KaryawanService;
import id.co.asm1_prg7_040.vo.KaryawanVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaryawanServiceImpl implements KaryawanService {

    private final KaryawanDao karyawanDao;

    public KaryawanServiceImpl(KaryawanDao karyawanDao) {
        this.karyawanDao = karyawanDao;
    }

    @Override
    public List<KaryawanVo> getAllDataKaryawan() {
        return karyawanDao.getAllDataKaryawan();
    }

    @Override
    public void saveKaryawan(Karyawan karyawan) {
        karyawanDao.saveKaryawan(karyawan);
    }
}
