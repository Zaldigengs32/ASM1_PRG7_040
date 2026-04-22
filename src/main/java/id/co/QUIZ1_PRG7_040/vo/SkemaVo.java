package id.co.QUIZ1_PRG7_040.vo;

import id.co.QUIZ1_PRG7_040.model.Skema;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id", "nama", "deskripsi", "status"})
public class SkemaVo {

    private int id;
    private String nama;
    private String deskripsi;
    private Integer status;

    public SkemaVo() {
    }

    public SkemaVo(Skema skema) {
        this.id = skema.getId();
        this.nama = skema.getNama();
        this.deskripsi = skema.getDeskripsi();
        this.status = skema.getStatus();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
