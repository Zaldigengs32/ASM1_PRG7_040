package id.co.prg7_sertifikasi.service;

import id.co.prg7_sertifikasi.model.User;
import id.co.prg7_sertifikasi.vo.UserVo;

import java.util.List;

public interface UserService {

    UserVo getUserById(int id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    List<UserVo> getUsers();

    UserVo getUserByUsername(String username);

    boolean isUsernameOrEmailExist(String username, String email);
}
