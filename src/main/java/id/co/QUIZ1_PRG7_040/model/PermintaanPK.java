package id.co.QUIZ1_PRG7_040.model;

import java.io.Serializable;
import java.util.Objects;

public class PermintaanPK implements Serializable {

    private Integer idDepartemen;
    private Integer idAtk;

    public PermintaanPK() {
    }

    public PermintaanPK(Integer idDepartemen, Integer idAtk) {
        this.idDepartemen = idDepartemen;
        this.idAtk = idAtk;
    }

    public Integer getIdDepartemen() {
        return idDepartemen;
    }

    public void setIdDepartemen(Integer idDepartemen) {
        this.idDepartemen = idDepartemen;
    }

    public Integer getIdAtk() {
        return idAtk;
    }

    public void setIdAtk(Integer idAtk) {
        this.idAtk = idAtk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PermintaanPK that = (PermintaanPK) o;
        return Objects.equals(idDepartemen, that.idDepartemen) && Objects.equals(idAtk, that.idAtk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDepartemen, idAtk);
    }
}
