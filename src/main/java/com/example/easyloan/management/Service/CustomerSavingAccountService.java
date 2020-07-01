package com.example.easyloan.management.Service;

import com.example.easyloan.management.Model.CustomerAssets;
import com.example.easyloan.management.Model.CustomerSavingAccount;

import java.util.List;
import java.util.Optional;

public interface CustomerSavingAccountService {

    List<CustomerSavingAccount> customerSavingAccountList();

    Optional<CustomerSavingAccount> findById(Integer id);

    CustomerSavingAccount addCustomerSavingAccount(CustomerSavingAccount customerSavingAccount);

    String deleteCustomerSavingAccount(Integer id);
}
