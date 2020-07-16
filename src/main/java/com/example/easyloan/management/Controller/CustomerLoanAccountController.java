package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.CustomerLoanAccount;
import com.example.easyloan.management.Service.CustomerLoanAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customerloanaccount")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerLoanAccountController {

    private CustomerLoanAccountService customerLoanAccountService;

    @Autowired
    public CustomerLoanAccountController(CustomerLoanAccountService customerLoanAccountService){
        this.customerLoanAccountService = customerLoanAccountService;
    }


    @RequestMapping("/add")
    public CustomerLoanAccount addCustomerLoanAccount(@RequestBody CustomerLoanAccount customerLoanAccount) throws Exception {
        return customerLoanAccountService.addCustomerLoanAccount(customerLoanAccount);
    }

    @RequestMapping("/list/{id}")
    public Optional<CustomerLoanAccount> findById(@PathVariable Integer id){
        return customerLoanAccountService.findById(id);
    }

    @RequestMapping("/list")
    public List<CustomerLoanAccount> customerLoanAccountList(){
        return customerLoanAccountService.customerLoanAccountList();

    }

    @RequestMapping("/delete/{id}")
    public String deleteCustomerLoanAccount(@PathVariable Integer id) {
        return customerLoanAccountService.deleteCustomerLoanAccount(id);
    }
}
