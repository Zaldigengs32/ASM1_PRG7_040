package id.co.asm1_prg7_040.model;

import jakarta.persistence.*;

@Entity
@Table(name = "asm_msmodul")
public class Modul {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modul")
    private Integer idModul;

    @Column(name = "nama")
    private String nama;

    @Column(name = "kategori_modul")
    private String kategoriModul;

    @Column(name = "versi_modul")
    private String versiModul;

    @Column(name = "status_modul")
    private Integer statusModul;

    public Modul() {
    }

    public Modul(Integer idModul, String nama, String kategoriModul, String versiModul, Integer statusModul) {
        this.idModul = idModul;
        this.nama = nama;
        this.kategoriModul = kategoriModul;
        this.versiModul = versiModul;
        this.statusModul = statusModul;
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
