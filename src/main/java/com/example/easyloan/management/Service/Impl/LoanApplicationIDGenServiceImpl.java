package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.LoanApplication;
import com.example.easyloan.management.Repository.LoanApplicationRepository;
import com.example.easyloan.management.Service.LoanApplicationIdGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicationIDGenServiceImpl implements LoanApplicationIdGenService {
    private LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationIDGenServiceImpl(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    @Override
    public List<LoanApplication> AppList() {
        return loanApplicationRepository.findLastQuery();
    }
}
