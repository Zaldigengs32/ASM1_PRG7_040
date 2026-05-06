package id.co.asm1_prg7_040.model;

import jakarta.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "asm_traksesmodul")
@IdClass(AksesModulPK.class)
public class AksesModul {

    @Id
    @Column(name = "id_karyawan")
    private String idKaryawan;

    @Id
    @Column(name = "id_modul")
    private Integer idModul;

    @Column(name = "tanggal_akses")
    private Date tanggalAkses;

    @Column(name = "jam_login")
    private Time jamLogin;

    @Column(name = "status_akses")
    private String statusAkses;

    public AksesModul() {
    }

    public AksesModul(String idKaryawan, Integer idModul, Date tanggalAkses, Time jamLogin, String statusAkses) {
        this.idKaryawan = idKaryawan;
        this.idModul = idModul;
        this.tanggalAkses = tanggalAkses;
        this.jamLogin = jamLogin;
        this.statusAkses = statusAkses;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public Integer getIdModul() {
        return idModul;
    }

    public void setIdModul(Integer idModul) {
        this.idModul = idModul;
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
