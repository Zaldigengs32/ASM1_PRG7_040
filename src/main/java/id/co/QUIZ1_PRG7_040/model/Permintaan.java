package id.co.QUIZ1_PRG7_040.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "quiz_trpermintaan")
@IdClass(PermintaanPK.class)
public class Permintaan {

    @Id
    @Column(name = "id_departemen")
    private Integer idDepartemen;

    @Id
    @Column(name = "id_atk")
    private Integer idAtk;

    @Column(name = "jumlah")
    private Integer jumlah;

    @Column(name = "tanggal")
    private Date tanggal;

    @Column(name = "keterangan")
    private String keterangan;

    public Permintaan() {
    }

    public Permintaan(Integer idDepartemen, Integer idAtk, Integer jumlah, Date tanggal, String keterangan) {
        this.idDepartemen = idDepartemen;
        this.idAtk = idAtk;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
        this.keterangan = keterangan;
    }

    public Integer getIdDepartemen() {
        return idDepartemen;
    }

    public void setIdDepartemen(Integer idDepartemen) {
        this.idDepartemen = idDepartemen;
    }

    public Integer getIdAtk() {
        return idAtk;
    }

    public void setIdAtk(Integer idAtk) {
        this.idAtk = idAtk;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
