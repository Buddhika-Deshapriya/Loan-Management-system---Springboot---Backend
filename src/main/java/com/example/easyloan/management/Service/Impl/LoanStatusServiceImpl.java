package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.LoanStatus;
import com.example.easyloan.management.Repository.LoanStatusRepository;
import com.example.easyloan.management.Service.LoanStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanStatusServiceImpl implements LoanStatusService {
    private LoanStatusRepository loanStatusRepository;

    @Autowired
    public  LoanStatusServiceImpl(LoanStatusRepository loanStatusRepository) {

        this.loanStatusRepository = loanStatusRepository;
    }

    @Override
    public List<LoanStatus> loanStatusList() {
        return loanStatusRepository.findAll();
    }

}
