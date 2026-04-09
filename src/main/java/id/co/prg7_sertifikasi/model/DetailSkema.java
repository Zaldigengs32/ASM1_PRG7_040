package id.co.prg7_sertifikasi.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "stf_msdetailskema")
public class DetailSkema {

    @EmbeddedId
    private DetailSkemaPK detailSkemaPK;

    @Column(name = "dsk_tanggal_mulai")
    private Date dsk_tanggal_mulai;

    @Column(name = "dsk_tanggal_berakhir")
    private Date dsk_tanggal_berakhir;

    @Column(name = "dsk_total_peserta")
    private Integer dsk_total_peserta;

    @Column(name = "dsk_kompeten")
    private Integer dsk_kompeten;

    @Column(name = "dsk_belum_kompeten")
    private Integer dsk_belum_kompeten;

    @Column(name = "dsk_tidak_hadir")
    private Integer dsk_tidak_hadir;

    @Column(name = "dsk_status")
    private Integer dsk_status;

    @Column(name = "dsk_creaby")
    private Integer dsk_creaby;

    @Column(name = "dsk_credate")
    private Date dsk_credate;

    @Column(name = "dsk_modiby")
    private Integer dsk_modiby;

    @Column(name = "dsk_modidate")
    private Date dsk_modidate;

    public DetailSkema() {
    }

    public DetailSkemaPK getDetailSkemaPK() {
        return detailSkemaPK;
    }

    public void setDetailSkemaPK(DetailSkemaPK detailSkemaPK) {
        this.detailSkemaPK = detailSkemaPK;
    }

    public Date getDsk_tanggal_mulai() {
        return dsk_tanggal_mulai;
    }

    public void setDsk_tanggal_mulai(Date dsk_tanggal_mulai) {
        this.dsk_tanggal_mulai = dsk_tanggal_mulai;
    }

    public Date getDsk_tanggal_berakhir() {
        return dsk_tanggal_berakhir;
    }

    public void setDsk_tanggal_berakhir(Date dsk_tanggal_berakhir) {
        this.dsk_tanggal_berakhir = dsk_tanggal_berakhir;
    }

    public Integer getDsk_total_peserta() {
        return dsk_total_peserta;
    }

    public void setDsk_total_peserta(Integer dsk_total_peserta) {
        this.dsk_total_peserta = dsk_total_peserta;
    }

    public Integer getDsk_kompeten() {
        return dsk_kompeten;
    }

    public void setDsk_kompeten(Integer dsk_kompeten) {
        this.dsk_kompeten = dsk_kompeten;
    }

    public Integer getDsk_belum_kompeten() {
        return dsk_belum_kompeten;
    }

    public void setDsk_belum_kompeten(Integer dsk_belum_kompeten) {
        this.dsk_belum_kompeten = dsk_belum_kompeten;
    }

    public Integer getDsk_tidak_hadir() {
        return dsk_tidak_hadir;
    }

    public void setDsk_tidak_hadir(Integer dsk_tidak_hadir) {
        this.dsk_tidak_hadir = dsk_tidak_hadir;
    }

    public Integer getDsk_status() {
        return dsk_status;
    }

    public void setDsk_status(Integer dsk_status) {
        this.dsk_status = dsk_status;
    }

    public Integer getDsk_creaby() {
        return dsk_creaby;
    }

    public void setDsk_creaby(Integer dsk_creaby) {
        this.dsk_creaby = dsk_creaby;
    }

    public Date getDsk_credate() {
        return dsk_credate;
    }

    public void setDsk_credate(Date dsk_credate) {
        this.dsk_credate = dsk_credate;
    }

    public Integer getDsk_modiby() {
        return dsk_modiby;
    }

    public void setDsk_modiby(Integer dsk_modiby) {
        this.dsk_modiby = dsk_modiby;
    }

    public Date getDsk_modidate() {
        return dsk_modidate;
    }

    public void setDsk_modidate(Date dsk_modidate) {
        this.dsk_modidate = dsk_modidate;
    }
}
