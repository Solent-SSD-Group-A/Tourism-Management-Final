package com.restapi.groupwork.demo.controller;

import com.restapi.groupwork.demo.dao.CustomerRepository;
import com.restapi.groupwork.demo.model.Customer;
import com.restapi.groupwork.demo.service.impl.CustomerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@WebMvcTest(customerController.class)
public class customerControllerTest{

    @Autowired
    private MockMvc mvc;

    @MockBean
    private customerController customercon;

    @Test
    public void getArrivals() throws Exception{
       Customer customer = new Customer();
       customer.setEmail_address("chatura@gmail.com");

       List<Customer> allCustomers = singletonList(customer);
       given(customercon.getAllCustomers()).willReturn(allCustomers);

       mvc.perform(get( "http://localhost:8081/customer")
               .with(user("blaze").password("Q1w2e3r4"))
               .contentType(APPLICATION_JSON))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$", hasSize(1)))
               .andExpect(jsonPath("$[0].email", is(customer.getEmail_address())));


    }



}
