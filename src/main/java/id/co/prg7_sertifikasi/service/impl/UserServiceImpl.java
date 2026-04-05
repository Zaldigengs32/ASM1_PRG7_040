package id.co.prg7_sertifikasi.service.impl;

import id.co.prg7_sertifikasi.dao.UserDao;
import id.co.prg7_sertifikasi.model.User;
import id.co.prg7_sertifikasi.service.UserService;
import id.co.prg7_sertifikasi.vo.UserVo;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserVo getUserById(int id) {
        return userDao.getUserById(id);
    }

    private String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return password;
        }
    }

    @Override
    public void saveUser(User user) {
        user.setUsr_creadate(new Date());
        if (user.getUsr_creaby() == null) {
            user.setUsr_creaby(1);
        }
        if (user.getPassword() != null && !user.getPassword().isEmpty()) {
            user.setPassword(encryptPassword(user.getPassword()));
        }
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        user.setUsr_modidate(new Date());
        if (user.getUsr_modiby() == null) {
            user.setUsr_modiby(1);
        }
        if (user.getPassword() != null && !user.getPassword().isEmpty()) {
            user.setPassword(encryptPassword(user.getPassword()));
        }
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public List<UserVo> getUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public UserVo getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }

    @Override
    public boolean isUsernameOrEmailExist(String username, String email) {
        return userDao.isUsernameOrEmailExist(username, email);
    }
}
