package id.co.QUIZ1_PRG7_040.model;

import jakarta.persistence.*;

@Entity
@Table(name = "quiz_msdepartemen")
public class Departemen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departemen")
    private Integer idDepartemen;

    @Column(name = "nama")
    private String nama;

    @Column(name = "kode_departemen")
    private String kodeDepartemen;

    @Column(name = "status")
    private String status;

    public Departemen() {
    }

    public Departemen(Integer idDepartemen, String nama, String kodeDepartemen, String status) {
        this.idDepartemen = idDepartemen;
        this.nama = nama;
        this.kodeDepartemen = kodeDepartemen;
        this.status = status;
    }

    public Integer getIdDepartemen() {
        return idDepartemen;
    }

    public void setIdDepartemen(Integer idDepartemen) {
        this.idDepartemen = idDepartemen;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKodeDepartemen() {
        return kodeDepartemen;
    }

    public void setKodeDepartemen(String kodeDepartemen) {
        this.kodeDepartemen = kodeDepartemen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
