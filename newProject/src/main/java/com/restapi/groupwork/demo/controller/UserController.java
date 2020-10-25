package com.restapi.groupwork.demo.controller;

import com.restapi.groupwork.demo.model.User;
import com.restapi.groupwork.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public Iterable<User> getAllusers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getuserById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }
    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
    @PutMapping
    public String updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }
}
