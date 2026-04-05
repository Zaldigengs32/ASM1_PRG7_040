package id.co.prg7_sertifikasi.vo;

import id.co.prg7_sertifikasi.model.Skema;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.util.Date;

@JsonPropertyOrder({
        "id", "nama", "deskripsi", "prasyarat", "kontak", "biaya", "status",
        "creaby", "creadate", "modiby", "modidate"
})
public class SkemaVo {
    private Integer id;
    private String nama;
    private String deskripsi;
    private String prasyarat;
    private String kontak;
    private BigDecimal biaya;
    private Integer status;
    private Integer creaby;
    private Date creadate;
    private Integer modiby;
    private Date modidate;

    public SkemaVo() {
    }

    public SkemaVo(Skema skema) {
        this.id = skema.getSkm_id();
        this.nama = skema.getSkm_nama();
        this.deskripsi = skema.getSkm_deskripsi();
        this.prasyarat = skema.getSkm_prasyarat();
        this.kontak = skema.getSkm_kontak();
        this.biaya = skema.getSkm_biaya();
        this.status = skema.getSkm_status();
        this.creaby = skema.getSkm_creaby();
        this.creadate = skema.getSkm_creadate();
        this.modiby = skema.getSkm_modiby();
        this.modidate = skema.getSkm_modidate();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getPrasyarat() {
        return prasyarat;
    }

    public void setPrasyarat(String prasyarat) {
        this.prasyarat = prasyarat;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public BigDecimal getBiaya() {
        return biaya;
    }

    public void setBiaya(BigDecimal biaya) {
        this.biaya = biaya;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
