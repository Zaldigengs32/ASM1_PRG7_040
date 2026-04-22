package id.co.QUIZ1_PRG7_040.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stf_msprodi")
public class Prodi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id")
    private Integer id;

    @Column(name = "pro_prodi")
    private String prodi;

    @Column(name = "pro_singkatan")
    private String singkatan;

    @Column(name = "pro_jurusan")
    private String jurusan;

    @Column(name = "pro_status")
    private Integer status;

    @Column(name = "pro_creaby")
    private Integer pro_creaby;

    @Column(name = "pro_creadate")
    private Date pro_creadate;

    @Column(name = "pro_modiby")
    private Integer pro_modiby;

    @Column(name = "pro_modidate")
    private Date pro_modidate;

    public Prodi() {
    }

    public Prodi(Integer id, String prodi, String singkatan, String jurusan, Integer status) {
        this.id = id;
        this.prodi = prodi;
        this.singkatan = singkatan;
        this.jurusan = jurusan;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getSingkatan() {
        return singkatan;
    }

    public void setSingkatan(String singkatan) {
        this.singkatan = singkatan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPro_creaby() { return pro_creaby; }
    public void setPro_creaby(Integer pro_creaby) { this.pro_creaby = pro_creaby; }

    public Date getPro_creadate() { return pro_creadate; }
    public void setPro_creadate(Date pro_creadate) { this.pro_creadate = pro_creadate; }

    public Integer getPro_modiby() { return pro_modiby; }
    public void setPro_modiby(Integer pro_modiby) { this.pro_modiby = pro_modiby; }

    public Date getPro_modidate() { return pro_modidate; }
    public void setPro_modidate(Date pro_modidate) { this.pro_modidate = pro_modidate; }
}
