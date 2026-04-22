package id.co.QUIZ1_PRG7_040.vo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import id.co.QUIZ1_PRG7_040.model.User;

@JsonPropertyOrder({"id", "name", "username", "email", "role"})
public class UserVo {

    private int id;
    private String name;
    private String username;
    private String email;
    private String role;

    public UserVo() {
    }

    public UserVo(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.role = user.getRole();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
