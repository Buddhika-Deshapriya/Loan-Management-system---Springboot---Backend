package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.CustomerSavingAccount;
import com.example.easyloan.management.Service.CustomerSavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customersavingaccount")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerSavingAccountController {

    private CustomerSavingAccountService customerSavingAccountService;

    @Autowired
    public CustomerSavingAccountController(CustomerSavingAccountService customerSavingAccountService){
        this.customerSavingAccountService = customerSavingAccountService;
    }


    @RequestMapping("/add")
    public CustomerSavingAccount addCustomerSavingAccount(@RequestBody CustomerSavingAccount customerSavingAccount) throws Exception {
        return customerSavingAccountService.addCustomerSavingAccount(customerSavingAccount);
    }

    @RequestMapping("/list/{id}")
    public Optional<CustomerSavingAccount> findById(@PathVariable Integer id){
        return customerSavingAccountService.findById(id);
    }

    @RequestMapping("/list")
    public List<CustomerSavingAccount> customerAssetsList(){
        return customerSavingAccountService.customerSavingAccountList();

    }

    @RequestMapping("/delete/{id}")
    public String deleteCustomerSavingAccount(@PathVariable Integer id) {
        return customerSavingAccountService.deleteCustomerSavingAccount(id);
    }
}
