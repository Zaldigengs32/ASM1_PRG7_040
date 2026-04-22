package id.co.QUIZ1_PRG7_040.vo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Date;

@JsonPropertyOrder({"namaAtk", "namaDepartemen", "jumlah", "tanggal", "keterangan"})
public class PermintaanVo {

    private String namaAtk;
    private String namaDepartemen;
    private Integer jumlah;
    private Date tanggal;
    private String keterangan;

    public PermintaanVo() {
    }

    public PermintaanVo(String namaAtk, String namaDepartemen, Integer jumlah, Date tanggal, String keterangan) {
        this.namaAtk = namaAtk;
        this.namaDepartemen = namaDepartemen;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
        this.keterangan = keterangan;
    }

    public String getNamaAtk() {
        return namaAtk;
    }

    public void setNamaAtk(String namaAtk) {
        this.namaAtk = namaAtk;
    }

    public String getNamaDepartemen() {
        return namaDepartemen;
    }

    public void setNamaDepartemen(String namaDepartemen) {
        this.namaDepartemen = namaDepartemen;
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
