package id.co.QUIZ1_PRG7_040.model;

import java.io.Serializable;
import java.util.Objects;

public class DetailSkemaPK implements Serializable {

    private Integer skm_id;
    private Integer pro_id;

    public DetailSkemaPK() {
    }

    public DetailSkemaPK(Integer skm_id, Integer pro_id) {
        this.skm_id = skm_id;
        this.pro_id = pro_id;
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
        return Objects.equals(skm_id, that.skm_id) && Objects.equals(pro_id, that.pro_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skm_id, pro_id);
    }
}
