package com.restapi.groupwork.demo.controller;

import com.restapi.groupwork.demo.model.Booking;
import com.restapi.groupwork.demo.model.Item;
import com.restapi.groupwork.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping
    public Iterable<Item> getAllItem(){
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable("id") int id){
        return itemService.getItemById(id);
    }
    @PostMapping
    public void addItems(@RequestBody Item item){
        itemService.addItem(item);
    }
    @PutMapping
    public int updateBooking(@RequestBody Item item){
        return itemService.updateItem(item);
    }
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id){
        itemService.deleteItem(id);
    }

}
