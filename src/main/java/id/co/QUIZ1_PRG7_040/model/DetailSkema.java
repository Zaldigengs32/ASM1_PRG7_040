package id.co.QUIZ1_PRG7_040.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "stf_trdetailskema")
@IdClass(DetailSkemaPK.class)
public class DetailSkema {

    @Id
    @Column(name = "skm_id")
    private Integer skm_id;

    @Id
    @Column(name = "pro_id")
    private Integer pro_id;

    @Column(name = "dsk_creaby")
    private Integer dsk_creaby;

    @Column(name = "dsk_creadate")
    private Date dsk_creadate;

    @Column(name = "dsk_modiby")
    private Integer dsk_modiby;

    @Column(name = "dsk_modidate")
    private Date dsk_modidate;

    public DetailSkema() {
    }

    public DetailSkema(Integer skm_id, Integer pro_id) {
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

    public Integer getDsk_creaby() {
        return dsk_creaby;
    }

    public void setDsk_creaby(Integer dsk_creaby) {
        this.dsk_creaby = dsk_creaby;
    }

    public Date getDsk_creadate() {
        return dsk_creadate;
    }

    public void setDsk_creadate(Date dsk_creadate) {
        this.dsk_creadate = dsk_creadate;
    }

    public Integer getDsk_modiby() {
        return dsk_modiby;
    }

    public void setDsk_modiby(Integer dsk_modiby) {
        this.dsk_modiby = dsk_modiby;
    }

    public Date getDsk_modidate() {
        return dsk_modidate;
    }

    public void setDsk_modidate(Date dsk_modidate) {
        this.dsk_modidate = dsk_modidate;
    }
}
