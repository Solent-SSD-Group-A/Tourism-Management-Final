package com.restapi.groupwork.demo.service;

import com.restapi.groupwork.demo.dao.UserRepository;
import com.restapi.groupwork.demo.model.Item;
import com.restapi.groupwork.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(int id){
       return userRepository.findById(id).get();
    }
    public void addUser(User user){
        userRepository.save(user);
    }

    public String updateUser(User user){
        if(user != null){
            userRepository.save(user);
            return "updated";
        }
        return "not updated";
    }

    public void deleteUser(int id){
        userRepository.deleteById(id);
    }
}
