package id.co.prg7_sertifikasi.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stf_trsertifikasi")
public class Trsertifikasi {

    @EmbeddedId
    private TrsertifikasiPK trsertifikasiPK;

    @Column(name = "tsk_status")
    private Integer tsk_status;

    @Column(name = "tsk_creaby")
    private Integer tsk_creaby;

    @Column(name = "tsk_creadate")
    private Date tsk_creadate;

    @Column(name = "tsk_modiby")
    private Integer tsk_modiby;

    @Column(name = "tsk_modidate")
    private Date tsk_modidate;

    public Trsertifikasi() {
    }

    public TrsertifikasiPK getTrsertifikasiPK() {
        return trsertifikasiPK;
    }

    public void setTrsertifikasiPK(TrsertifikasiPK trsertifikasiPK) {
        this.trsertifikasiPK = trsertifikasiPK;
    }

    public Integer getTsk_status() {
        return tsk_status;
    }

    public void setTsk_status(Integer tsk_status) {
        this.tsk_status = tsk_status;
    }

    public Integer getTsk_creaby() {
        return tsk_creaby;
    }

    public void setTsk_creaby(Integer tsk_creaby) {
        this.tsk_creaby = tsk_creaby;
    }

    public Date getTsk_creadate() {
        return tsk_creadate;
    }

    public void setTsk_creadate(Date tsk_creadate) {
        this.tsk_creadate = tsk_creadate;
    }

    public Integer getTsk_modiby() {
        return tsk_modiby;
    }

    public void setTsk_modiby(Integer tsk_modiby) {
        this.tsk_modiby = tsk_modiby;
    }

    public Date getTsk_modidate() {
        return tsk_modidate;
    }

    public void setTsk_modidate(Date tsk_modidate) {
        this.tsk_modidate = tsk_modidate;
    }
}
