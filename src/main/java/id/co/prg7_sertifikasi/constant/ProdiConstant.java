package id.co.prg7_sertifikasi.constant;

import id.co.prg7_sertifikasi.model.Prodi;

import java.util.ArrayList;
import java.util.List;

public class ProdiConstant {

    public static List<Prodi> prodis;

    static {
        prodis = new ArrayList<>();
        prodis.add(new Prodi(1, "Manajemen Informatika", "MI", "Ilmu Teknologi", 1));
        prodis.add(new Prodi(2, "Teknologi Rekayasa Perangkat Lunak", "TRPL", "Ilmu Teknologi", 1));
        prodis.add(new Prodi(3, "Mekatronika", "MK", "Kelistrikan", 1));
    }

    public static final String mNotFound = "Prodi not found";
    public static final String mCreateSuccess = "Prodi created successfully";
    public static final String mUpdateSuccess = "Prodi updated successfully";
    public static final String mDeleteSuccess = "Prodi deleted successfully";
    public static final String mUsernameEmailRegistered = "Username or Email has been registered";
}
