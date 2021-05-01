package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.CustomerLoanAccount;
import com.example.easyloan.management.Repository.CustomerLoanAccountRepository;
import com.example.easyloan.management.Service.CustomerLoanAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * Service implementation for customer loan account service
 */
@Service
public class CustomerLoanAccountServiceImpl implements CustomerLoanAccountService {

    private CustomerLoanAccountRepository customerLoanAccountRepository;

    @Autowired
    public  CustomerLoanAccountServiceImpl(CustomerLoanAccountRepository customerLoanAccountRepository) {

        this.customerLoanAccountRepository = customerLoanAccountRepository;
    }

    @Override
    public List<CustomerLoanAccount> customerLoanAccountList() {
        return customerLoanAccountRepository.findAll();
    }

    @Override
    public Optional<CustomerLoanAccount> findById(Integer id) {
        return customerLoanAccountRepository.findById(id);
    }

    @Override
    public CustomerLoanAccount addCustomerLoanAccount(CustomerLoanAccount customerLoanAccount) {
        return customerLoanAccountRepository.save(customerLoanAccount);
    }

    @Override
    public String deleteCustomerLoanAccount(Integer id) {
        customerLoanAccountRepository.deleteById(id);
        return "{'Message' : 'Customer Loan Account Deleted Successfully!'}";
    }
}
