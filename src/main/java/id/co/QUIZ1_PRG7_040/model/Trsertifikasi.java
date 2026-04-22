package id.co.QUIZ1_PRG7_040.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stf_trsertifikasi")
@IdClass(TrsertifikasiPK.class)
public class Trsertifikasi {

    @Id
    @Column(name = "usr_id")
    private Integer usr_id;

    @Id
    @Column(name = "skm_id")
    private Integer skm_id;

    @Column(name = "trs_tanggal")
    private Date tanggal;

    @Column(name = "trs_creaby")
    private Integer trs_creaby;

    @Column(name = "trs_creadate")
    private Date trs_creadate;

    @Column(name = "trs_modiby")
    private Integer trs_modiby;

    @Column(name = "trs_modidate")
    private Date trs_modidate;

    public Trsertifikasi() {
    }

    public Trsertifikasi(Integer usr_id, Integer skm_id, Date tanggal) {
        this.usr_id = usr_id;
        this.skm_id = skm_id;
        this.tanggal = tanggal;
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

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Integer getTrs_creaby() {
        return trs_creaby;
    }

    public void setTrs_creaby(Integer trs_creaby) {
        this.trs_creaby = trs_creaby;
    }

    public Date getTrs_creadate() {
        return trs_creadate;
    }

    public void setTrs_creadate(Date trs_creadate) {
        this.trs_creadate = trs_creadate;
    }

    public Integer getTrs_modiby() {
        return trs_modiby;
    }

    public void setTrs_modiby(Integer trs_modiby) {
        this.trs_modiby = trs_modiby;
    }

    public Date getTrs_modidate() {
        return trs_modidate;
    }

    public void setTrs_modidate(Date trs_modidate) {
        this.trs_modidate = trs_modidate;
    }
}
