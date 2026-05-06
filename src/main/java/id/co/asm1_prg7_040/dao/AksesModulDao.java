package id.co.asm1_prg7_040.dao;

import id.co.asm1_prg7_040.model.AksesModul;
import id.co.asm1_prg7_040.vo.AksesModulVo;

import java.util.List;

public interface AksesModulDao {

    List<AksesModulVo> getAllDataAksesModul();

    boolean existsKaryawan(String idKaryawan);

    boolean existsModul(int idModul);

    boolean existsAksesModul(String idKaryawan, int idModul);

    void saveAksesModul(AksesModul aksesModul);
}
