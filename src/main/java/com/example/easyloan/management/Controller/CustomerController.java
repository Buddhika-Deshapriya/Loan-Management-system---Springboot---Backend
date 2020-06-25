package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.Customer;
import com.example.easyloan.management.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }


    @RequestMapping("/add")
    public Customer addBook(@RequestBody Customer customer) throws Exception {
        return customerService.addCustomer(customer);
    }

    @RequestMapping("/list/{id}")
    public Optional<Customer> findById(@PathVariable Integer id){
        return customerService.findById(id);
    }

    @RequestMapping("/list")
    public List<Customer> customerList(){
        return customerService.customerList();

    }

    @RequestMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Integer id) {
        return customerService.deleteCustomer(id);
    }
}
