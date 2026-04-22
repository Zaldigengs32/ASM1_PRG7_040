package id.co.QUIZ1_PRG7_040.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stf_msskema")
public class Skema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skm_id")
    private Integer id;

    @Column(name = "skm_nama")
    private String nama;

    @Column(name = "skm_deskripsi")
    private String deskripsi;

    @Column(name = "skm_status")
    private Integer status;

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

    public Skema(Integer id, String nama, String deskripsi, Integer status) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.status = status;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSkm_creaby() { return skm_creaby; }
    public void setSkm_creaby(Integer skm_creaby) { this.skm_creaby = skm_creaby; }

    public Date getSkm_creadate() { return skm_creadate; }
    public void setSkm_creadate(Date skm_creadate) { this.skm_creadate = skm_creadate; }

    public Integer getSkm_modiby() { return skm_modiby; }
    public void setSkm_modiby(Integer skm_modiby) { this.skm_modiby = skm_modiby; }

    public Date getSkm_modidate() { return skm_modidate; }
    public void setSkm_modidate(Date skm_modidate) { this.skm_modidate = skm_modidate; }
}