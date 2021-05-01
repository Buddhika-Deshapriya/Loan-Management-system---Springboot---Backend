package com.example.easyloan.management.Service;

import com.example.easyloan.management.Model.Customer;

import java.util.List;
import java.util.Optional;

/*
 * Service for customer
 */
public interface CustomerService {
    List<Customer> customerList();

    Optional<Customer> findById(Integer id);

    Customer addCustomer(Customer customer);

    String deleteCustomer(Integer id);

}
