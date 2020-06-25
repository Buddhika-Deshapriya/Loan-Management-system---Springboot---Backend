package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.LoanApplication;
import com.example.easyloan.management.Repository.CustomerRepository;
import com.example.easyloan.management.Repository.LoanApplicationRepository;
import com.example.easyloan.management.Service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanApplicationServiceImpl implements LoanApplicationService {

    private LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public  LoanApplicationServiceImpl(LoanApplicationRepository loanApplicationRepository) {

        this.loanApplicationRepository = loanApplicationRepository;
    }

    @Override
    public List<LoanApplication> loanApplicationList() {
        return loanApplicationRepository.findAll();
    }

    @Override
    public Optional<LoanApplication> findById(Integer id) {
        return loanApplicationRepository.findById(id);
    }

    @Override
    public LoanApplication addLoanApplication(LoanApplication loanApplication) {
        return loanApplicationRepository.save(loanApplication);

    }

    @Override
    public String deleteLoanApplication(Integer id) {
        loanApplicationRepository.deleteById(id);
        return "{'Message' : 'Loan Application Deleted Successfully!'}";
    }
}
