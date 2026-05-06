package id.co.asm1_prg7_040.vo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.sql.Time;
import java.util.Date;

@JsonPropertyOrder({"namaKaryawan", "namaModul", "tanggalAkses", "jamLogin", "statusAkses"})
public class AksesModulVo {

    private String namaKaryawan;
    private String namaModul;
    private Date tanggalAkses;
    private Time jamLogin;
    private String statusAkses;

    public AksesModulVo() {
    }

    public AksesModulVo(String namaKaryawan, String namaModul, Date tanggalAkses, Time jamLogin, String statusAkses) {
        this.namaKaryawan = namaKaryawan;
        this.namaModul = namaModul;
        this.tanggalAkses = tanggalAkses;
        this.jamLogin = jamLogin;
        this.statusAkses = statusAkses;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getNamaModul() {
        return namaModul;
    }

    public void setNamaModul(String namaModul) {
        this.namaModul = namaModul;
    }

    public Date getTanggalAkses() {
        return tanggalAkses;
    }

    public void setTanggalAkses(Date tanggalAkses) {
        this.tanggalAkses = tanggalAkses;
    }

    public Time getJamLogin() {
        return jamLogin;
    }

    public void setJamLogin(Time jamLogin) {
        this.jamLogin = jamLogin;
    }

    public String getStatusAkses() {
        return statusAkses;
    }

    public void setStatusAkses(String statusAkses) {
        this.statusAkses = statusAkses;
    }
}
