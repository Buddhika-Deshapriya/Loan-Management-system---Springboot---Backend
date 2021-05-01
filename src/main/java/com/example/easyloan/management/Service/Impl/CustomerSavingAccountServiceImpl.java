package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.CustomerSavingAccount;
import com.example.easyloan.management.Repository.CustomerSavingAccountRepository;
import com.example.easyloan.management.Service.CustomerSavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * Service implementation for customer saving account service
 */
@Service
public class CustomerSavingAccountServiceImpl implements CustomerSavingAccountService {

    private CustomerSavingAccountRepository customerSavingAccountRepository;

    @Autowired
    public  CustomerSavingAccountServiceImpl(CustomerSavingAccountRepository customerSavingAccountRepository) {

        this.customerSavingAccountRepository = customerSavingAccountRepository;
    }

    @Override
    public List<CustomerSavingAccount> customerSavingAccountList() {
        return customerSavingAccountRepository.findAll();
    }

    @Override
    public Optional<CustomerSavingAccount> findById(Integer id) {
        return customerSavingAccountRepository.findById(id);
    }

    @Override
    public CustomerSavingAccount addCustomerSavingAccount(CustomerSavingAccount customerSavingAccount) {
        return customerSavingAccountRepository.save(customerSavingAccount);
    }

    @Override
    public String deleteCustomerSavingAccount(Integer id) {
        customerSavingAccountRepository.deleteById(id);
        return "{'Message' : 'Customer Saving Account Deleted Successfully!'}";
    }
}
