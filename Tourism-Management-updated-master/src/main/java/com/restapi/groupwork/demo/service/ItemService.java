package com.restapi.groupwork.demo.service;

import com.restapi.groupwork.demo.dao.ItemRepository;
import com.restapi.groupwork.demo.model.Booking;
import com.restapi.groupwork.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    /*

    @Autowired
    ItemRepository itemRepository;

    public Iterable<Item> getAllItems(){
        return itemRepository.findAll();
    }
    public Item getItemById(int id){
        return itemRepository.findById(id).get();
    }
    public void addItem(Item item){
        itemRepository.save(item);
    }
    public int updateItem(Item item){
        if(item != null){
            itemRepository.save(item);
            return -1;
        }

        return -1;
    }
    public void deleteItem(int id){
        itemRepository.deleteById(id);
    }

    */

}
