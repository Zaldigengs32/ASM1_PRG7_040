package id.co.asm1_prg7_040.model;

import jakarta.persistence.*;

@Entity
@Table(name = "asm_mskaryawan")
public class Karyawan {

    @Id
    @Column(name = "id_karyawan")
    private String idKaryawan;

    @Column(name = "nama_karyawan")
    private String namaKaryawan;

    @Column(name = "jabatan")
    private String jabatan;

    @Column(name = "divisi")
    private String divisi;

    public Karyawan() {
    }

    public Karyawan(String idKaryawan, String namaKaryawan, String jabatan, String divisi) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.jabatan = jabatan;
        this.divisi = divisi;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
}
