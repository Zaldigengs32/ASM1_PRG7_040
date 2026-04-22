package id.co.QUIZ1_PRG7_040.model;

import java.io.Serializable;
import java.util.Objects;

public class TrsertifikasiPK implements Serializable {

    private Integer usr_id;
    private Integer skm_id;

    public TrsertifikasiPK() {
    }

    public TrsertifikasiPK(Integer usr_id, Integer skm_id) {
        this.usr_id = usr_id;
        this.skm_id = skm_id;
    }

    public Integer getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(Integer usr_id) {
        this.usr_id = usr_id;
    }

    public Integer getSkm_id() {
        return skm_id;
    }

    public void setSkm_id(Integer skm_id) {
        this.skm_id = skm_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrsertifikasiPK that = (TrsertifikasiPK) o;
        return Objects.equals(usr_id, that.usr_id) && Objects.equals(skm_id, that.skm_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usr_id, skm_id);
    }
}
