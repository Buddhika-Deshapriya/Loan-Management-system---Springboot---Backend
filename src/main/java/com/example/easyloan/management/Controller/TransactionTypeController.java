package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.TransactionType;
import com.example.easyloan.management.Service.TransactionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactiontype")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TransactionTypeController {
    private TransactionTypeService transactionTypeService;

    @Autowired
    public TransactionTypeController(TransactionTypeService transactionTypeService){
        this.transactionTypeService = transactionTypeService;
    }

    @RequestMapping("/list")
    public List<TransactionType> transactionTypeList(){
        return transactionTypeService.transactionTypeList();
    }
}
