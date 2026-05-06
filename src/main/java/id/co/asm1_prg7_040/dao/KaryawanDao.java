package id.co.asm1_prg7_040.dao;

import id.co.asm1_prg7_040.model.Karyawan;
import id.co.asm1_prg7_040.vo.KaryawanVo;

import java.util.List;

public interface KaryawanDao {

    List<KaryawanVo> getAllDataKaryawan();

    void saveKaryawan(Karyawan karyawan);
}
