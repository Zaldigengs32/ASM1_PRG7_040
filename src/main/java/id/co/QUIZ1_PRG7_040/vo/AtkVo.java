package id.co.QUIZ1_PRG7_040.vo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import id.co.QUIZ1_PRG7_040.model.Atk;

@JsonPropertyOrder({"idAtk", "atk", "stok", "status"})
public class AtkVo {

    private Integer idAtk;
    private String atk;
    private String stok;
    private String status;

    public AtkVo() {
    }

    public AtkVo(Atk atk) {
        this.idAtk = atk.getIdAtk();
        this.atk = atk.getAtk();
        this.stok = atk.getStok();
        this.status = atk.getStatus();
    }

    public Integer getIdAtk() {
        return idAtk;
    }

    public void setIdAtk(Integer idAtk) {
        this.idAtk = idAtk;
    }

    public String getAtk() {
        return atk;
    }

    public void setAtk(String atk) {
        this.atk = atk;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
