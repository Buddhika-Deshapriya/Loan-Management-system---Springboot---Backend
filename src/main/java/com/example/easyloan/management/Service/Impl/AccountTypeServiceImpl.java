package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.AccountType;
import com.example.easyloan.management.Repository.AccountTypeRepository;
import com.example.easyloan.management.Service.AccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* Service implementation for account type service
*/
@Service
public class AccountTypeServiceImpl implements AccountTypeService {
    private AccountTypeRepository accountTypeRepository;

    @Autowired
    public AccountTypeServiceImpl(AccountTypeRepository accountTypeRepository) {
        this.accountTypeRepository = accountTypeRepository;
    }
    @Override
    public List<AccountType> accountTypeList() {
        return accountTypeRepository.findAll();
    }
}
