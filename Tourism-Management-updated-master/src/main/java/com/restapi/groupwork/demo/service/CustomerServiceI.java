package com.restapi.groupwork.demo.service;

import com.restapi.groupwork.demo.model.Customer;

public interface CustomerServiceI {

    public Iterable<Customer> getAll();

    public Customer getCustomerById(int id);

    public int addCustomer(Customer customer);

    public int updateCustomer(Customer customer);

    public void deleteCustomer(int id);

}
