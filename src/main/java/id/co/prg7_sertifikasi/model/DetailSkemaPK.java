package id.co.prg7_sertifikasi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DetailSkemaPK implements Serializable {

    @Column(name = "dsk_id")
    private Integer dsk_id;

    @Column(name = "skm_id")
    private Integer skm_id;

    @Column(name = "pro_id")
    private Integer pro_id;

    public DetailSkemaPK() {}

    public DetailSkemaPK(Integer dsk_id, Integer skm_id, Integer pro_id) {
        this.dsk_id = dsk_id;
        this.skm_id = skm_id;
        this.pro_id = pro_id;
    }

    public Integer getDsk_id() {
        return dsk_id;
    }

    public void setDsk_id(Integer dsk_id) {
        this.dsk_id = dsk_id;
    }

    public Integer getSkm_id() {
        return skm_id;
    }

    public void setSkm_id(Integer skm_id) {
        this.skm_id = skm_id;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetailSkemaPK that = (DetailSkemaPK) o;
        return Objects.equals(dsk_id, that.dsk_id) && Objects.equals(skm_id, that.skm_id) && Objects.equals(pro_id, that.pro_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dsk_id, skm_id, pro_id);
    }
}
