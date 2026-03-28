package id.co.prg7_sertifikasi.dao.impl;

import id.co.prg7_sertifikasi.constant.ProdiConstant;
import id.co.prg7_sertifikasi.dao.ProdiDao;
import id.co.prg7_sertifikasi.model.Prodi;
import id.co.prg7_sertifikasi.vo.ProdiVo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdiDaoImpl implements ProdiDao {

    @Override
    public ProdiVo getProdiById(int id) {
        for (Prodi prodi : ProdiConstant.prodis) {
            if (prodi.getId() == id) {
                ProdiVo prodiVo = new ProdiVo(prodi);
                return prodiVo;
            }
        }
        return null;
    }

    @Override
    public void saveProdi(Prodi prodi) {
        ProdiConstant.prodis.add(prodi);
    }

    @Override
    public void updateProdi(Prodi prodi) {
        for (Prodi existingProdi : ProdiConstant.prodis) {
            if (existingProdi.getId().equals(prodi.getId())) {
                existingProdi.setProdi(prodi.getProdi());
                existingProdi.setSingkatan(prodi.getSingkatan());
                existingProdi.setJurusan(prodi.getJurusan());
                existingProdi.setStatus(prodi.getStatus());
                return;
            }
        }
    }

    @Override
    public void deleteProdi(int id) {
        ProdiConstant.prodis.removeIf(prodi -> prodi.getId() == id);
    }

    @Override
    public List<ProdiVo> getAllProdis() {
        List<ProdiVo> prodiVos = new ArrayList<>();
        for (Prodi prodi : ProdiConstant.prodis) {
            ProdiVo prodiVo = new ProdiVo(prodi);
            prodiVos.add(prodiVo);
        }
        return prodiVos;
    }
}
