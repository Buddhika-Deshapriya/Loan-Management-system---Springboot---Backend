package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.Customer;
import com.example.easyloan.management.Repository.CustomerRepository;
import com.example.easyloan.management.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public  CustomerServiceImpl(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> customerList() {

        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Integer id) {

        return customerRepository.findById(id);
    }

    @Override
    public Customer addCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public String deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
        return "{'Message' : 'Customer Deleted Successfully!'}";
    }

    @Override
    public Customer fetchMemershipNo(String enteredNumber) {
        return customerRepository.findByMembership_no(enteredNumber);
    }
}
