package com.restapi.groupwork.demo;

import com.restapi.groupwork.demo.model.User;
import com.restapi.groupwork.demo.service.UserServiceI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
public class UserTest {

    @Autowired
    private UserServiceI userServiceI;


    @Test
    public void testCreateUser(){

        User user = new User(1, "chathura", "rana", "10/10/1991", 12345, "Male", "test@gmail.com", "123");
        userServiceI.addUser(user);


    }

    @Test
    public void testUpdateUser(){

        User user = new User(1, "chathura", "rana", "10/10/1991", 12345, "Male", "test@gmail.com", "1234");
        userServiceI.updateUser(user);

    }

    @Test
    public void testDeleteUSer(){

        Integer id = 1;

        userServiceI.deleteUser(id);

        System.out.println("User deleted succesfully");

    }

    @Test
    public void testGetAllUsers(){

        List<User> userlist = (List<User>) userServiceI.getAllUsers();

        for (User user :userlist
        ) {

            User u = new User();

            u.setUser_id(user.getUser_id());
            u.setFirst_name(user.getFirst_name());
            u.setLast_name(user.getLast_name());
            u.setDate_of_birth(user.getDate_of_birth());
            u.setContact(user.getContact());
            u.setGender(user.getGender());
            u.setEmail_address(user.getEmail_address());
            u.setPassword(user.getPassword());

            System.out.println("User is : " + u);
        }
    }
}
