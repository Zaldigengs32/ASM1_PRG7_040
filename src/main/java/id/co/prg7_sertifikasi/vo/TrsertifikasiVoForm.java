package id.co.prg7_sertifikasi.vo;

import java.util.Date;

public class TrsertifikasiVoForm {

    private Integer tsk_id;
    private Integer usr_id;
    private Integer dsk_id;
    private Integer tsk_status;
    private Integer tsk_creaby;
    private Date tsk_creadate;
    private Integer tsk_modiby;
    private Date tsk_modidate;

    public TrsertifikasiVoForm() {
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
