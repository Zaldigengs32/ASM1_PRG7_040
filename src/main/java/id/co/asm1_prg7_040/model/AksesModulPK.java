package id.co.asm1_prg7_040.model;

import java.io.Serializable;
import java.util.Objects;

public class AksesModulPK implements Serializable {

    private String idKaryawan;
    private Integer idModul;

    public AksesModulPK() {
    }

    public AksesModulPK(String idKaryawan, Integer idModul) {
        this.idKaryawan = idKaryawan;
        this.idModul = idModul;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public Integer getIdModul() {
        return idModul;
    }

    public void setIdModul(Integer idModul) {
        this.idModul = idModul;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AksesModulPK that = (AksesModulPK) o;
        return Objects.equals(idKaryawan, that.idKaryawan) && Objects.equals(idModul, that.idModul);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKaryawan, idModul);
    }
}
