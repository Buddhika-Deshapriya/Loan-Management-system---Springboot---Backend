package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.TransactionType;
import com.example.easyloan.management.Repository.TransactionTypeRepository;
import com.example.easyloan.management.Service.TransactionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Service implementation for transaction type service
 */
@Service
public class TransactionTypeServiceImpl implements TransactionTypeService {
    private TransactionTypeRepository transactionTypeRepository;

    @Autowired
    public TransactionTypeServiceImpl(TransactionTypeRepository transactionTypeRepository) {

        this.transactionTypeRepository = transactionTypeRepository;
    }

    @Override
    public List<TransactionType> transactionTypeList() {
        return transactionTypeRepository.findAll();
    }
}
