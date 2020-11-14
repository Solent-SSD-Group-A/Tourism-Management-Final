package com.restapi.groupwork.demo.service;

import com.restapi.groupwork.demo.model.User;

public interface UserServiceI {

    public Iterable<User> getAllUsers();

    public User getUserById(int id);

    public void addUser(User user);

    public String updateUser(User user);

    public void deleteUser(int id);
}
