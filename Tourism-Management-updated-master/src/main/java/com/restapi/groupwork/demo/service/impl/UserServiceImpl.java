package com.restapi.groupwork.demo.service.impl;

import com.restapi.groupwork.demo.dao.UserRepository;
import com.restapi.groupwork.demo.model.User;
import com.restapi.groupwork.demo.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserServiceI {

    @Autowired
    UserRepository userRepository;

    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);

    }

    @Override
    public String updateUser(User user) {
        if (user != null) {
            userRepository.save(user);
            return "updated";
        }
        return "not updated";
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
