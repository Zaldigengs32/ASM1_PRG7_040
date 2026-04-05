package id.co.prg7_sertifikasi.dao.impl;

import id.co.prg7_sertifikasi.dao.UserDao;
import id.co.prg7_sertifikasi.model.User;
import id.co.prg7_sertifikasi.repository.UserRepository;
import id.co.prg7_sertifikasi.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserVo getUserById(int id) {
        Optional<User> userOpt = userRepository.findById(id);
        if (userOpt.isPresent()) {
            return new UserVo(userOpt.get());
        }
        return null;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        Optional<User> existingOpt = userRepository.findById(user.getId());
        if (existingOpt.isPresent()) {
            User existing = existingOpt.get();
            if (user.getName() == null) user.setName(existing.getName());
            if (user.getUsername() == null) user.setUsername(existing.getUsername());
            if (user.getEmail() == null) user.setEmail(existing.getEmail());
            if (user.getRole() == null) user.setRole(existing.getRole());
            if (user.getStatus() == null) user.setStatus(existing.getStatus());
            
            if (user.getPassword() == null || user.getPassword().isEmpty()) {
                user.setPassword(existing.getPassword());
            }
            if (user.getPro_id() == null) {
                user.setPro_id(existing.getPro_id());
            }
            if (user.getUsr_creaby() == null) {
                user.setUsr_creaby(existing.getUsr_creaby());
            }
            if (user.getUsr_creadate() == null) {
                user.setUsr_creadate(existing.getUsr_creadate());
            }
            userRepository.save(user);
        } else {
            userRepository.save(user);
        }
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserVo> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserVo> userVos = new ArrayList<>();
        for (User user : users) {
            userVos.add(new UserVo(user));
        }
        return userVos;
    }

    @Override
    public UserVo getUserByUsername(String username) {
        Optional<User> userOpt = userRepository.findByUsername(username);
        if (userOpt.isPresent()) {
            return new UserVo(userOpt.get());
        }
        return null;
    }

    @Override
    public boolean isUsernameOrEmailExist(String username, String email) {
        Optional<User> userByUsername = userRepository.findByUsername(username);
        Optional<User> userByEmail = userRepository.findByEmail(email);
        return userByUsername.isPresent() || userByEmail.isPresent();
    }
}
