package com.example.easyloan.management.Service;

import com.example.easyloan.management.Model.CustomerLoanAccount;

import java.util.List;
import java.util.Optional;

public interface CustomerLoanAccountService {

    List<CustomerLoanAccount> customerLoanAccountList();

    Optional<CustomerLoanAccount> findById(Integer id);

    CustomerLoanAccount addCustomerLoanAccount(CustomerLoanAccount customerLoanAccount);

    String deleteCustomerLoanAccount(Integer id);
}
