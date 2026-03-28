package id.co.prg7_sertifikasi.service.impl;

import id.co.prg7_sertifikasi.dao.ProdiDao;
import id.co.prg7_sertifikasi.model.Prodi;
import id.co.prg7_sertifikasi.service.ProdiService;
import id.co.prg7_sertifikasi.vo.ProdiVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdiServiceImpl implements ProdiService {

    private final ProdiDao prodiDao;

    public ProdiServiceImpl(ProdiDao prodiDao) {
        this.prodiDao = prodiDao;
    }

    @Override
    public ProdiVo getProdiById(int id) {
        return prodiDao.getProdiById(id);
    }

    @Override
    public void saveProdi(Prodi prodi) {
        prodiDao.saveProdi(prodi);
    }

    @Override
    public void updateProdi(Prodi prodi) {
        prodiDao.updateProdi(prodi);
    }

    @Override
    public void deleteProdi(int id) {
        prodiDao.deleteProdi(id);
    }

    @Override
    public List<ProdiVo> getProdis() {
        return prodiDao.getAllProdis();
    }

    @Override
    public ProdiVo getProdiByUsername(String username) {
        // Implementation for getting prodi by username
        return null;
    }
}
