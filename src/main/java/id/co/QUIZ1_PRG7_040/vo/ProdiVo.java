package id.co.QUIZ1_PRG7_040.vo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import id.co.QUIZ1_PRG7_040.model.Prodi;

@JsonPropertyOrder({"id", "prodi", "singkatan", "jurusan", "status"})
public class ProdiVo {

    private int id;
    private String prodi;
    private String singkatan;
    private String jurusan;
    private Integer status;

    public ProdiVo() {
    }

    public ProdiVo(Prodi prodi) {
        this.id = prodi.getId();
        this.prodi = prodi.getProdi();
        this.singkatan = prodi.getSingkatan();
        this.jurusan = prodi.getJurusan();
        this.status = prodi.getStatus();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
