package com.restapi.groupwork.demo.controller;

import com.restapi.groupwork.demo.model.Booking;
import com.restapi.groupwork.demo.model.Item;
import com.restapi.groupwork.demo.service.ItemService;
import com.restapi.groupwork.demo.service.ItemServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController //It marks the class as a controller where every method returns a domain object instead of a view
@RequestMapping("/item") //handle the request
public class ItemController {

    @Autowired
    private ItemServiceI itemService;

    @GetMapping  //It used to handle the HTTP get request
    public Iterable<Item> getAllItem() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable("id") int id) {
        return itemService.getItemById(id);
    }

    @PostMapping  //It used to handle the HTTP post request
    public void addItems(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @PutMapping //It used handle the HTTP put request
    public int updateBooking(@RequestBody Item item) {
        return itemService.updateItem(item);
    }

    @DeleteMapping("/{id}") //It used to handle the HTTP delete request
    public void deleteItem(@PathVariable int id) {
        itemService.deleteItem(id);
    }

}
