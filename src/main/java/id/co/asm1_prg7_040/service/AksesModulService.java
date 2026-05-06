package id.co.asm1_prg7_040.service;

import id.co.asm1_prg7_040.model.AksesModul;
import id.co.asm1_prg7_040.vo.AksesModulVo;

import java.util.List;

public interface AksesModulService {

    List<AksesModulVo> getAllDataAksesModul();

    // Mengembalikan pesan validasi, null jika lolos semua validasi
    String validateAksesModul(String idKaryawan, int idModul);

    void saveAksesModul(AksesModul aksesModul);
}
