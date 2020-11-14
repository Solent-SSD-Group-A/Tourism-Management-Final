package com.restapi.groupwork.demo.service.impl;

import com.restapi.groupwork.demo.dao.CustomerRepository;
import com.restapi.groupwork.demo.model.Customer;
import com.restapi.groupwork.demo.service.CustomerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerServiceI {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public int addCustomer(Customer customer) {
        if (customer != null) {
            customerRepository.save(customer);
            return -1;
        }
        return -1;
    }

    @Override
    public int updateCustomer(Customer customer) {
        if (customer != null) {
            customerRepository.save(customer);
            return 1;
        }
        return -1;
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }
}
