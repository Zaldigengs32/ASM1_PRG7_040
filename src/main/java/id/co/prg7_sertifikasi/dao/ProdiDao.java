package id.co.prg7_sertifikasi.dao;

import id.co.prg7_sertifikasi.model.Prodi;
import id.co.prg7_sertifikasi.vo.ProdiVo;

import java.util.List;

public interface ProdiDao {

    List<ProdiVo> getAllProdis();

    ProdiVo getProdiById(int id);

    void saveProdi(Prodi prodi);

    void updateProdi(Prodi prodi);

    void deleteProdi(int id);
}
