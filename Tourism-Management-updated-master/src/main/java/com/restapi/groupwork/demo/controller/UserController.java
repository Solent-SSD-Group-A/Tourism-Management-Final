package com.restapi.groupwork.demo.controller;

import com.restapi.groupwork.demo.model.Item;
import com.restapi.groupwork.demo.model.User;
import com.restapi.groupwork.demo.service.UserService;
import com.restapi.groupwork.demo.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3004")
@RestController//It marks the class as a controller where every method returns a domain object instead of a view
@RequestMapping("/users")//handle the request
public class UserController {

    @Autowired
    private UserServiceI userService;

    @GetMapping  //It used to handle the HTTP get request
    public Iterable<User> getAllusers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getuserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @PostMapping  //It used to handle the HTTP post request
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PutMapping  //It used handle the HTTP put request
    public String updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")  //It used to handle the HTTP delete request
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}
