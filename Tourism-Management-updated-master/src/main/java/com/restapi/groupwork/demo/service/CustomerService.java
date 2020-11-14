package com.restapi.groupwork.demo.service;

import com.restapi.groupwork.demo.dao.CustomerRepository;
import com.restapi.groupwork.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    /*

    @Autowired
    private CustomerRepository customerRepository;

    public Iterable<Customer> getAll(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(int id){
       return customerRepository.findById(id).get();
    }
    public int addCustomer(Customer customer){
        if(customer != null){
            customerRepository.save(customer);
            return -1;
        }
        return -1;
    }

    public int updateCustomer(Customer customer){
        if(customer != null){
            customerRepository.save(customer);
            return 1;
        }
        return -1;
    }
    public void deleteCustomer(int id){
        customerRepository.deleteById(id);
    }

    */
}
