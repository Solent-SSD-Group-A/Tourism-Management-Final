package com.restapi.groupwork.demo.dao;

import com.restapi.groupwork.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
