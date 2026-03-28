package id.co.prg7_sertifikasi.dao.impl;

import id.co.prg7_sertifikasi.constant.UserConstant;
import id.co.prg7_sertifikasi.dao.UserDao;
import id.co.prg7_sertifikasi.model.User;
import id.co.prg7_sertifikasi.vo.UserVo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public UserVo getUserById(int id) {
        for (User user : UserConstant.users) {
            if (user.getId() == id) {
                UserVo userVo = new UserVo(user);
                return userVo;
            }
        }
        return null;
    }

    @Override
    public void saveUser(User user) {
        UserConstant.users.add(user);
    }

    @Override
    public void updateUser(User user) {
        for (User existingUser : UserConstant.users) {
            if (existingUser.getId() == user.getId()) {
                existingUser.setName(user.getName());
                existingUser.setUsername(user.getUsername());
                existingUser.setPassword(user.getPassword());
                existingUser.setEmail(user.getEmail());
                existingUser.setRole(user.getRole());
                existingUser.setStatus(user.getStatus());
                return;
            }
        }
    }

    @Override
    public void deleteUser(int id) {
        UserConstant.users.removeIf(user -> user.getId() == id);
    }

    @Override
    public List<UserVo> getAllUsers() {
        List<UserVo> userVos = new ArrayList<>();
        for (User user : UserConstant.users) {
            UserVo userVo = new UserVo(user);
            userVos.add(userVo);
        }
        return userVos;
    }

    @Override
    public UserVo getUserByUsername(String username) {
        for (User user : UserConstant.users) {
            if (user.getUsername().equals(username)) {
                return new UserVo(user);
            }
        }
        return null;
    }
}
