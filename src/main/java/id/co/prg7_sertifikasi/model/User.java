package id.co.prg7_sertifikasi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stf_msuser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_id")
    private Integer id;

    @Column(name = "usr_nama")
    private String name;

    @Column(name = "usr_username")
    private String username;

    @Column(name = "usr_password")
    private String password;

    @Column(name = "usr_email")
    private String email;

    @Column(name = "usr_role")
    private String role;

    @Column(name = "usr_status")
    private Integer status;

    @Column(name = "pro_id")
    private Integer pro_id;

    @Column(name = "usr_creaby")
    private Integer usr_creaby;

    @Column(name = "usr_creadate")
    private Date usr_creadate;

    @Column(name = "usr_modiby")
    private Integer usr_modiby;

    @Column(name = "usr_modidate")
    private Date usr_modidate;

    public User() {
    }

    public User(Integer id, String name, String username, String password, String email, String role, Integer status) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.status = status;
    }

    // GETTER SETTER
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPro_id() { return pro_id; }
    public void setPro_id(Integer pro_id) { this.pro_id = pro_id; }

    public Integer getUsr_creaby() { return usr_creaby; }
    public void setUsr_creaby(Integer usr_creaby) { this.usr_creaby = usr_creaby; }

    public Date getUsr_creadate() { return usr_creadate; }
    public void setUsr_creadate(Date usr_creadate) { this.usr_creadate = usr_creadate; }

    public Integer getUsr_modiby() { return usr_modiby; }
    public void setUsr_modiby(Integer usr_modiby) { this.usr_modiby = usr_modiby; }

    public Date getUsr_modidate() { return usr_modidate; }
    public void setUsr_modidate(Date usr_modidate) { this.usr_modidate = usr_modidate; }
}
