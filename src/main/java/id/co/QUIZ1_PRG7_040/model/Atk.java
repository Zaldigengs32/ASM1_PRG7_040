package id.co.QUIZ1_PRG7_040.model;

import jakarta.persistence.*;

@Entity
@Table(name = "quiz_msatk")
public class Atk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atk")
    private Integer idAtk;

    @Column(name = "atk")
    private String atk;

    @Column(name = "stok")
    private String stok;

    @Column(name = "status")
    private String status;

    public Atk() {
    }

    public Atk(Integer idAtk, String atk, String stok, String status) {
        this.idAtk = idAtk;
        this.atk = atk;
        this.stok = stok;
        this.status = status;
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
