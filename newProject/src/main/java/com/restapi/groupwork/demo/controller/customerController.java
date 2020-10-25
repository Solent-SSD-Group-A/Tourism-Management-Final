package com.restapi.groupwork.demo.controller;

import com.restapi.groupwork.demo.dao.FakeCustomerDao;
import com.restapi.groupwork.demo.model.Customer;
import com.restapi.groupwork.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class customerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public Iterable<Customer> getAllCustomers(){
        return customerService.getAll();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") int id){
       return customerService.getCustomerById(id);
    }

    @PostMapping
    public int addCustomer(@RequestBody Customer customer){
       return customerService.addCustomer(customer);
    }

    @PutMapping
    public int updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
    }

    /*@DeleteMapping("/{id}")
    public Customer deletecustomer(@PathVariable("id") int id){
        return customerService.deleteCustomer(id);
    }*/
    /*@Autowired
    private FakeCustomerDao fakeCustomerDao; //loose coupling

    @GetMapping
    public List<Customer> getAllCustomers(){
        return  fakeCustomerDao.getAllCustomers();
    }*/
}
