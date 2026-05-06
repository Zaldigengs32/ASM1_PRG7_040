package id.co.asm1_prg7_040.service.impl;

import id.co.asm1_prg7_040.dao.AksesModulDao;
import id.co.asm1_prg7_040.model.AksesModul;
import id.co.asm1_prg7_040.service.AksesModulService;
import id.co.asm1_prg7_040.vo.AksesModulVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AksesModulServiceImpl implements AksesModulService {

    private final AksesModulDao aksesModulDao;

    public AksesModulServiceImpl(AksesModulDao aksesModulDao) {
        this.aksesModulDao = aksesModulDao;
    }

    @Override
    public List<AksesModulVo> getAllDataAksesModul() {
        return aksesModulDao.getAllDataAksesModul();
    }

    @Override
    public String validateAksesModul(String idKaryawan, int idModul) {
        if (!aksesModulDao.existsKaryawan(idKaryawan)) {
            return "ID Karyawan tidak terdaftar";
        }
        if (!aksesModulDao.existsModul(idModul)) {
            return "ID Modul tidak terdaftar";
        }
        if (aksesModulDao.existsAksesModul(idKaryawan, idModul)) {
            return "Data sudah ada";
        }
        return null;
    }

    @Override
    public void saveAksesModul(AksesModul aksesModul) {
        aksesModulDao.saveAksesModul(aksesModul);
    }
}
