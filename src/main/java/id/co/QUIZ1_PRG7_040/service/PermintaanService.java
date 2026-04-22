package id.co.QUIZ1_PRG7_040.service;

import id.co.QUIZ1_PRG7_040.model.Permintaan;
import id.co.QUIZ1_PRG7_040.vo.PermintaanVo;

import java.util.List;

public interface PermintaanService {

    List<PermintaanVo> getAllPermintaan();

    void savePermintaan(Permintaan permintaan);
}
