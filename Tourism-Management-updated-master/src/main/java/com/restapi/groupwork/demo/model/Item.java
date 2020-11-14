package com.restapi.groupwork.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//It used to specify the class is an entity and map to a database table
@Entity(name = "tbl_item")
public class Item {
    //It used to specify primary key of an entity
    @Id
    //It used to generate the primary key of an entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int item_id;
    private String item_name;
    private double unit_price;
    private int qty;

    public Item() {

    }

    public Item(int item_id, String item_name, double unit_price, int qty) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.unit_price = unit_price;
        this.qty = qty;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
