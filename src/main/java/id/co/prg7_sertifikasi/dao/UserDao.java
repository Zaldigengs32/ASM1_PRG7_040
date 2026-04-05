package id.co.prg7_sertifikasi.dao;

import id.co.prg7_sertifikasi.model.User;
import id.co.prg7_sertifikasi.vo.UserVo;

import java.util.List;

public interface UserDao {

    List<UserVo> getAllUsers();

    UserVo getUserById(int id);

    UserVo getUserByUsername(String username);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    boolean isUsernameOrEmailExist(String username, String email);
}
