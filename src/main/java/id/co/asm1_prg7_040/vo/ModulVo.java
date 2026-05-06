package id.co.asm1_prg7_040.vo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import id.co.asm1_prg7_040.model.Modul;

@JsonPropertyOrder({"idModul", "nama", "kategoriModul", "versiModul", "statusModul"})
public class ModulVo {

    private Integer idModul;
    private String nama;
    private String kategoriModul;
    private String versiModul;
    private Integer statusModul;

    public ModulVo() {
    }

    public ModulVo(Modul modul) {
        this.idModul = modul.getIdModul();
        this.nama = modul.getNama();
        this.kategoriModul = modul.getKategoriModul();
        this.versiModul = modul.getVersiModul();
        this.statusModul = modul.getStatusModul();
    }

    public Integer getIdModul() {
        return idModul;
    }

    public void setIdModul(Integer idModul) {
        this.idModul = idModul;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategoriModul() {
        return kategoriModul;
    }

    public void setKategoriModul(String kategoriModul) {
        this.kategoriModul = kategoriModul;
    }

    public String getVersiModul() {
        return versiModul;
    }

    public void setVersiModul(String versiModul) {
        this.versiModul = versiModul;
    }

    public Integer getStatusModul() {
        return statusModul;
    }

    public void setStatusModul(Integer statusModul) {
        this.statusModul = statusModul;
    }
}
