package id.co.prg7_sertifikasi.model;

public class Prodi {

    private Integer id;
    private String prodi;
    private String singkatan;
    private String jurusan;
    private Integer status;

    public Prodi() {
    }

    public Prodi(Integer id, String prodi, String singkatan, String jurusan, Integer status) {
        this.id = id;
        this.prodi = prodi;
        this.singkatan = singkatan;
        this.jurusan = jurusan;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getSingkatan() {
        return singkatan;
    }

    public void setSingkatan(String singkatan) {
        this.singkatan = singkatan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
