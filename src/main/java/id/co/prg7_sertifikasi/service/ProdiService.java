package id.co.prg7_sertifikasi.service;

import id.co.prg7_sertifikasi.model.Prodi;
import id.co.prg7_sertifikasi.vo.ProdiVo;

import java.util.List;

public interface ProdiService {

    ProdiVo getProdiById(int id);

    void saveProdi(Prodi prodi);

    void updateProdi(Prodi prodi);

    void deleteProdi(int id);

    List<ProdiVo> getProdis();

    ProdiVo getProdiByUsername(String username);
}
