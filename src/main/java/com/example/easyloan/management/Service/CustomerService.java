package com.example.easyloan.management.Service;

import com.example.easyloan.management.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> customerList();

    Optional<Customer> findById(Integer id);

    Customer addCustomer(Customer customer);

    String deleteCustomer(Integer id);

}
