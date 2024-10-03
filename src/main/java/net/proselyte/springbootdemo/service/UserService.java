package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.module.User;
import net.proselyte.springbootdemo.repository.User.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final Repository userRepository;

    @Autowired
    private UserService(Repository userRepository) {
        this.userRepository = userRepository;
    }
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
