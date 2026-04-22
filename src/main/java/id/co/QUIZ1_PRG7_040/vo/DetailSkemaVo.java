package id.co.QUIZ1_PRG7_040.vo;

import id.co.QUIZ1_PRG7_040.model.DetailSkema;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"skm_id", "pro_id", "skm_nama", "pro_prodi"})
public class DetailSkemaVo {

    private Integer skm_id;
    private Integer pro_id;
    private String skm_nama;
    private String pro_prodi;

    public DetailSkemaVo() {
    }

    public DetailSkemaVo(DetailSkema detailSkema, String skm_nama, String pro_prodi) {
        this.skm_id = detailSkema.getSkm_id();
        this.pro_id = detailSkema.getPro_id();
        this.skm_nama = skm_nama;
        this.pro_prodi = pro_prodi;
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

    public String getSkm_nama() {
        return skm_nama;
    }

    public void setSkm_nama(String skm_nama) {
        this.skm_nama = skm_nama;
    }

    public String getPro_prodi() {
        return pro_prodi;
    }

    public void setPro_prodi(String pro_prodi) {
        this.pro_prodi = pro_prodi;
    }
}
