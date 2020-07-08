package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.Customer;
import com.example.easyloan.management.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
    public Customer addCustomer(@RequestBody Customer customer) {

        //Validate membership number
 //       String membership_no = customer.getMembership_no();
        //System.out.println(enteredNumber);
//        if(membership_no !=  null){
//            Customer customerObj = customerService.fetchMemershipNo(membership_no);
//            if(customerObj != null){
//                throw new ApiRequestException("Membership number exists!");
//            }
//        }
        Customer  customerObj = null;
        customerObj = customerService.addCustomer(customer);
        return customerObj;

    }

    @RequestMapping("/list/{id}")
    @PreAuthorize("hasRole('DIR') or hasRole('ADMIN')")
    public Optional<Customer> findById(@PathVariable Integer id){
        return customerService.findById(id);
    }

    @RequestMapping("/list")
    @PreAuthorize("hasRole('DIR') or hasRole('ADMIN')")
    public List<Customer> customerList(){
        return customerService.customerList();
    }

    @RequestMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Integer id) {
        return customerService.deleteCustomer(id);
    }
}
