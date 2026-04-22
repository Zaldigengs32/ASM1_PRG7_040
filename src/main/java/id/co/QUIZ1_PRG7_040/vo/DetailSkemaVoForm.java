package id.co.QUIZ1_PRG7_040.vo;

import id.co.QUIZ1_PRG7_040.model.DetailSkema;

import java.util.Date;

public class DetailSkemaVoForm {

    private Integer skm_id;
    private Integer pro_id;
    private Integer creaby;
    private Date creadate;
    private Integer modiby;
    private Date modidate;

    public DetailSkemaVoForm() {
    }

    public DetailSkemaVoForm(DetailSkema detailSkema) {
        this.skm_id = detailSkema.getSkm_id();
        this.pro_id = detailSkema.getPro_id();
        this.creaby = detailSkema.getDsk_creaby();
        this.creadate = detailSkema.getDsk_creadate();
        this.modiby = detailSkema.getDsk_modiby();
        this.modidate = detailSkema.getDsk_modidate();
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

    public Integer getCreaby() {
        return creaby;
    }

    public void setCreaby(Integer creaby) {
        this.creaby = creaby;
    }

    public Date getCreadate() {
        return creadate;
    }

    public void setCreadate(Date creadate) {
        this.creadate = creadate;
    }

    public Integer getModiby() {
        return modiby;
    }

    public void setModiby(Integer modiby) {
        this.modiby = modiby;
    }

    public Date getModidate() {
        return modidate;
    }

    public void setModidate(Date modidate) {
        this.modidate = modidate;
    }
}
