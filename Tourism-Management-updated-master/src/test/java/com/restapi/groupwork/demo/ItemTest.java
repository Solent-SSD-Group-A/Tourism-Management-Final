package com.restapi.groupwork.demo;

import com.restapi.groupwork.demo.model.Item;
import com.restapi.groupwork.demo.service.ItemServiceI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
public class ItemTest extends DemoApplicationTests {

    @Autowired
    private ItemServiceI itemServiceI;


    @Test
    public void testCreateItem(){

        Item item = new Item(1,"Item1", 200.00, 1);
        itemServiceI.addItem(item);
        System.out.println(itemServiceI);
    }

    @Test
    public void testUpdateItem(){

        Item item = new Item(1,"Item1", 275.00, 1);
        itemServiceI.updateItem(item);
        System.out.println(itemServiceI);
    }


    @Test
    public void testDeleteItem(){

        Integer id = 1;

        itemServiceI.deleteItem(id);

        System.out.println("Item Deleted Succesfully.");
    }

    @Test
    public void testGetAllItems(){

        List<Item> itemlist = (List<Item>) itemServiceI.getAllItems();

        for (Item i:itemlist
        ) {
            Item item = new Item();
            item.setItem_id(i.getItem_id());
            item.setItem_name(i.getItem_name());
            item.setUnit_price(i.getUnit_price());
            item.setQty(i.getQty());

            System.out.println("item is : "+ item);
        }
    }
}
