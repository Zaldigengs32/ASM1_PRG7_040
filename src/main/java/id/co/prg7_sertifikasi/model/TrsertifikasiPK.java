package id.co.prg7_sertifikasi.model;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Embeddable;

@Embeddable
public class TrsertifikasiPK implements Serializable {

    private Integer tsk_id;
    private Integer usr_id;
    private Integer dsk_id;

    public TrsertifikasiPK() {
    }

    public TrsertifikasiPK(Integer tsk_id, Integer usr_id, Integer dsk_id) {
        this.tsk_id = tsk_id;
        this.usr_id = usr_id;
        this.dsk_id = dsk_id;
    }

    public Integer getTsk_id() {
        return tsk_id;
    }

    public void setTsk_id(Integer tsk_id) {
        this.tsk_id = tsk_id;
    }

    public Integer getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(Integer usr_id) {
        this.usr_id = usr_id;
    }

    public Integer getDsk_id() {
        return dsk_id;
    }

    public void setDsk_id(Integer dsk_id) {
        this.dsk_id = dsk_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrsertifikasiPK that = (TrsertifikasiPK) o;
        return Objects.equals(tsk_id, that.tsk_id) &&
               Objects.equals(usr_id, that.usr_id) &&
               Objects.equals(dsk_id, that.dsk_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tsk_id, usr_id, dsk_id);
    }
}
