package com.restapi.groupwork.demo;

import com.restapi.groupwork.demo.controller.customerController;
import com.restapi.groupwork.demo.model.Customer;
import com.restapi.groupwork.demo.model.User;
import com.restapi.groupwork.demo.service.CustomerServiceI;
import org.assertj.core.api.Assertions;
import org.hibernate.sql.Select;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Id;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class CustomerTest extends DemoApplicationTests{




    @Autowired
    private CustomerServiceI customerServiceI;

    @Test
    public void testCreateCustomer(){

        Customer customer = new Customer(12,"cj","test@gmail.com", 1234);
        customerServiceI.addCustomer(customer);
    }

    @Test
    public void testUpdateCustomer(){

        Customer customerupdate = new Customer(12, "Chathura" ,"test2@gmail.com", 1245);
        customerServiceI.updateCustomer(customerupdate);
    }

    @Test
    public void testDeleteUCustomer(){

        Integer id = 1;

        customerServiceI.deleteCustomer(id);
        System.out.println("Deleted Customer");

    }

    @Test
    public void testGetAllCustomers(){

        List<Customer> customerlist = (List<Customer>) customerServiceI.getAll();
        for (Customer c:customerlist
        ) {

            Customer newcus = new Customer();
            newcus.setCustomer_id(c.getCustomer_id());
            newcus.setCustomer_name(c.getCustomer_name());
            newcus.setContact_number(c.getContact_number());
            newcus.setEmail_address(c.getEmail_address());

            System.out.println("Customer is : " + newcus.getCustomer_name());

        }

    }


}
