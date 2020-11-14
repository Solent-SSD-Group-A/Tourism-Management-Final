package com.restapi.groupwork.demo.dao;

import com.restapi.groupwork.demo.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FakeCustomerDao {
    public List<Customer> getAllCustomers() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(3, "Peter", "peter@gmail.com", 2727277));
        customerList.add(new Customer(4, "john", "john@gmail.com", 585858));
        customerList.add(new Customer(5, "Rosi", "rosi@gmail.com", 8828));

        return customerList;
    }
}
