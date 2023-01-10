package org.sid.bankaccountservice.services;

import org.sid.bankaccountservice.entities.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "customer-service" )
public interface CustomerRestClient {


    @GetMapping("/customers")
    public List<Customer> getAllCustomers();

    @GetMapping("/getCustomer/{id}")
    public Customer getCustomer(@PathVariable Long id);

}
