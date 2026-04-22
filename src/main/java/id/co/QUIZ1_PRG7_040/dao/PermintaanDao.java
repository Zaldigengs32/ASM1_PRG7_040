package id.co.QUIZ1_PRG7_040.dao;

import id.co.QUIZ1_PRG7_040.model.Permintaan;
import id.co.QUIZ1_PRG7_040.vo.PermintaanVo;

import java.util.List;

public interface PermintaanDao {

    List<PermintaanVo> getAllPermintaan();

    void savePermintaan(Permintaan permintaan);
}
