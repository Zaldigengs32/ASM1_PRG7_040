package id.co.QUIZ1_PRG7_040.vo;

import java.util.Date;

public class TrsertifikasiVoForm {

    private Integer usr_id;
    private Integer skm_id;
    private Date tanggal;

    public TrsertifikasiVoForm() {
    }

    public TrsertifikasiVoForm(Integer usr_id, Integer skm_id, Date tanggal) {
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
}
