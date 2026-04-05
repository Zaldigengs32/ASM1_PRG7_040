package id.co.prg7_sertifikasi.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "stf_msskema")
public class Skema {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skm_id")
    private Integer skm_id;

    @Column(name = "skm_nama")
    private String skm_nama;

    @Column(name = "skm_deskripsi")
    private String skm_deskripsi;

    @Column(name = "skm_prasyarat")
    private String skm_prasyarat;

    @Column(name = "skm_kontak")
    private String skm_kontak;

    @Column(name = "skm_biaya")
    private BigDecimal skm_biaya;

    @Column(name = "skm_status")
    private Integer skm_status;

    @Column(name = "skm_creaby")
    private Integer skm_creaby;

    @Column(name = "skm_creadate")
    private Date skm_creadate;

    @Column(name = "skm_modiby")
    private Integer skm_modiby;

    @Column(name = "skm_modidate")
    private Date skm_modidate;

    public Skema() {
    }

    public Integer getSkm_id() {
        return skm_id;
    }

    public void setSkm_id(Integer skm_id) {
        this.skm_id = skm_id;
    }

    public String getSkm_nama() {
        return skm_nama;
    }

    public void setSkm_nama(String skm_nama) {
        this.skm_nama = skm_nama;
    }

    public String getSkm_deskripsi() {
        return skm_deskripsi;
    }

    public void setSkm_deskripsi(String skm_deskripsi) {
        this.skm_deskripsi = skm_deskripsi;
    }

    public String getSkm_prasyarat() {
        return skm_prasyarat;
    }

    public void setSkm_prasyarat(String skm_prasyarat) {
        this.skm_prasyarat = skm_prasyarat;
    }

    public String getSkm_kontak() {
        return skm_kontak;
    }

    public void setSkm_kontak(String skm_kontak) {
        this.skm_kontak = skm_kontak;
    }

    public BigDecimal getSkm_biaya() {
        return skm_biaya;
    }

    public void setSkm_biaya(BigDecimal skm_biaya) {
        this.skm_biaya = skm_biaya;
    }

    public Integer getSkm_status() {
        return skm_status;
    }

    public void setSkm_status(Integer skm_status) {
        this.skm_status = skm_status;
    }

    public Integer getSkm_creaby() {
        return skm_creaby;
    }

    public void setSkm_creaby(Integer skm_creaby) {
        this.skm_creaby = skm_creaby;
    }

    public Date getSkm_creadate() {
        return skm_creadate;
    }

    public void setSkm_creadate(Date skm_creadate) {
        this.skm_creadate = skm_creadate;
    }

    public Integer getSkm_modiby() {
        return skm_modiby;
    }

    public void setSkm_modiby(Integer skm_modiby) {
        this.skm_modiby = skm_modiby;
    }

    public Date getSkm_modidate() {
        return skm_modidate;
    }

    public void setSkm_modidate(Date skm_modidate) {
        this.skm_modidate = skm_modidate;
    }
}
