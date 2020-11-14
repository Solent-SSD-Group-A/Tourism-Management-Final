package com.restapi.groupwork.demo.dao;

import com.restapi.groupwork.demo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
