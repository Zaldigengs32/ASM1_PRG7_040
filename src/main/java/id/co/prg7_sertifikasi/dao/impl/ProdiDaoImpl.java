package id.co.prg7_sertifikasi.dao.impl;

import id.co.prg7_sertifikasi.dao.ProdiDao;
import id.co.prg7_sertifikasi.model.Prodi;
import id.co.prg7_sertifikasi.repository.ProdiRepository;
import id.co.prg7_sertifikasi.vo.ProdiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProdiDaoImpl implements ProdiDao {

    @Autowired
    private ProdiRepository prodiRepository;

    @Override
    public ProdiVo getProdiById(int id) {
        Optional<Prodi> prodiOpt = prodiRepository.findById(id);
        if (prodiOpt.isPresent()) {
            return new ProdiVo(prodiOpt.get());
        }
        return null;
    }

    @Override
    public void saveProdi(Prodi prodi) {
        prodiRepository.save(prodi);
    }

    @Override
    public void updateProdi(Prodi prodi) {
        Optional<Prodi> existingOpt = prodiRepository.findById(prodi.getId());
        if (existingOpt.isPresent()) {
            Prodi existing = existingOpt.get();
            if (prodi.getProdi() == null) prodi.setProdi(existing.getProdi());
            if (prodi.getSingkatan() == null) prodi.setSingkatan(existing.getSingkatan());
            if (prodi.getJurusan() == null) prodi.setJurusan(existing.getJurusan());
            if (prodi.getStatus() == null) prodi.setStatus(existing.getStatus());
            
            if (prodi.getPro_creaby() == null) {
                prodi.setPro_creaby(existing.getPro_creaby());
            }
            if (prodi.getPro_creadate() == null) {
                prodi.setPro_creadate(existing.getPro_creadate());
            }
            prodiRepository.save(prodi);
        } else {
            prodiRepository.save(prodi);
        }
    }

    @Override
    public void deleteProdi(int id) {
        prodiRepository.deleteById(id);
    }

    @Override
    public List<ProdiVo> getAllProdis() {
        List<Prodi> prodis = prodiRepository.findAll();
        List<ProdiVo> prodiVos = new ArrayList<>();
        for (Prodi prodi : prodis) {
            prodiVos.add(new ProdiVo(prodi));
        }
        return prodiVos;
    }
}
