package id.co.asm1_prg7_040.service;

import id.co.asm1_prg7_040.model.Karyawan;
import id.co.asm1_prg7_040.vo.KaryawanVo;

import java.util.List;

public interface KaryawanService {

    List<KaryawanVo> getAllDataKaryawan();

    void saveKaryawan(Karyawan karyawan);
}
