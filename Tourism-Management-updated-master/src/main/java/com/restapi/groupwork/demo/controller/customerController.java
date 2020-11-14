package com.restapi.groupwork.demo.controller;

import com.restapi.groupwork.demo.dao.FakeCustomerDao;
import com.restapi.groupwork.demo.model.Customer;
import com.restapi.groupwork.demo.service.CustomerService;
import com.restapi.groupwork.demo.service.CustomerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController//It marks the class as a controller where every method returns a domain object instead of a view
@RequestMapping("/customer")//handle the request
public class customerController {

    @Autowired
    private CustomerServiceI customerServiceIe;

    //It used to handle the HTTP get request
    @GetMapping
    public Iterable<Customer> getAllCustomers() {
        return customerServiceIe.getAll();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") int id) {
        return customerServiceIe.getCustomerById(id);
    }
    //It used to handle the HTTP post request
    @PostMapping
    public int addCustomer(@RequestBody Customer customer) {
        return customerServiceIe.addCustomer(customer);
    }
    //It used handle the HTTP put request
    @PutMapping
    public int updateCustomer(@RequestBody Customer customer) {
        return customerServiceIe.updateCustomer(customer);
    }
    //It used to handle the HTTP delete request
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerServiceIe.deleteCustomer(id);
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
