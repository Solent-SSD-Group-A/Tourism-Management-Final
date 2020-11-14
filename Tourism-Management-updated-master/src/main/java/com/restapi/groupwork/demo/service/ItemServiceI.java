package com.restapi.groupwork.demo.service;

import com.restapi.groupwork.demo.model.Item;

public interface ItemServiceI {

    public Iterable<Item> getAllItems();

    public Item getItemById(int id);

    public void addItem(Item item);

    public int updateItem(Item item);

    public void deleteItem(int id);
}
