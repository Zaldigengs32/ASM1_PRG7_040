package id.co.asm1_prg7_040.vo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import id.co.asm1_prg7_040.model.Karyawan;

@JsonPropertyOrder({"idKaryawan", "namaKaryawan", "jabatan", "divisi"})
public class KaryawanVo {

    private String idKaryawan;
    private String namaKaryawan;
    private String jabatan;
    private String divisi;

    public KaryawanVo() {
    }

    public KaryawanVo(Karyawan karyawan) {
        this.idKaryawan = karyawan.getIdKaryawan();
        this.namaKaryawan = karyawan.getNamaKaryawan();
        this.jabatan = karyawan.getJabatan();
        this.divisi = karyawan.getDivisi();
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
