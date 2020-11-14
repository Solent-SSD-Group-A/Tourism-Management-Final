package com.restapi.groupwork.demo.service.impl;

import com.restapi.groupwork.demo.dao.ItemRepository;
import com.restapi.groupwork.demo.model.Item;
import com.restapi.groupwork.demo.service.ItemServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemServiceImpl implements ItemServiceI {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public Iterable<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(int id) {
        return itemRepository.findById(id).get();
    }

    @Override
    public void addItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public int updateItem(Item item) {
        if (item != null) {
            itemRepository.save(item);
            return -1;
        }

        return -1;
    }

    @Override
    public void deleteItem(int id) {
        itemRepository.deleteById(id);
    }
}
