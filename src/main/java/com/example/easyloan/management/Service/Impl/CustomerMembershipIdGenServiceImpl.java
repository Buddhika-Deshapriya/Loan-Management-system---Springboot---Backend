package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.Customer;
import com.example.easyloan.management.Repository.CustomerRepository;
import com.example.easyloan.management.Service.CustomerMembershipIdGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerMembershipIdGenServiceImpl implements CustomerMembershipIdGenService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerMembershipIdGenServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> CusList() {
        return customerRepository.findLastQuery();
    }
}