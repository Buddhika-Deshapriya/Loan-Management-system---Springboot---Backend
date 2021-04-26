package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.AccountType;
import com.example.easyloan.management.Service.AccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounttype")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AccountTypeController {
    private AccountTypeService accountTypeService;

    @Autowired
    public AccountTypeController(AccountTypeService accountTypeService){
        this.accountTypeService = accountTypeService;
    }
    @RequestMapping("/list")
    public List<AccountType> accountTypeList() {
        return accountTypeService.accountTypeList();
    }
}
