package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.Customer;
import com.example.easyloan.management.Service.CustomerMembershipIdGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Controller for customer generated membership no
 */
@RestController
@RequestMapping("/customergenmembershipno")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerMembershipIdGenController {
    CustomerMembershipIdGenService customerMembershipIdGenService;

    @Autowired
    public CustomerMembershipIdGenController(CustomerMembershipIdGenService customerMembershipIdGenService) {
        this.customerMembershipIdGenService = customerMembershipIdGenService;
    }

    @RequestMapping("/takememno")
    public List<Customer> custMemNoList(){

        String mem_no = customerMembershipIdGenService.CusList().get(0).getMembership_no();
        Integer id = customerMembershipIdGenService.CusList().get(0).getId();

        Integer uid = ++id;
        String final_mem_no = "CO-MEM"+"-"+ uid;
        customerMembershipIdGenService.CusList().get(0).setMembership_no(final_mem_no);
        return customerMembershipIdGenService.CusList();



    }
}
