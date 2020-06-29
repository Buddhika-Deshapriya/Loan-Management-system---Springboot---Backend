package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.LoanCashRelease;
import com.example.easyloan.management.Repository.LoanApplicationRepository;
import com.example.easyloan.management.Repository.LoanCashReleaseRepository;
import com.example.easyloan.management.Service.LoanCashReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanCashReleaseServiceImpl implements LoanCashReleaseService {


    private LoanCashReleaseRepository loanCashReleaseRepository;

    @Autowired
    public  LoanCashReleaseServiceImpl(LoanCashReleaseRepository loanCashReleaseRepository) {

        this.loanCashReleaseRepository = loanCashReleaseRepository;
    }

    @Override
    public List<LoanCashRelease> loanCashReleaseList() {
        return loanCashReleaseRepository.findAll();
    }

    @Override
    public Optional<LoanCashRelease> findById(Integer id) {
        return loanCashReleaseRepository.findById(id);
    }

    @Override
    public LoanCashRelease addLoanCashRelease(LoanCashRelease loanCashRelease) {
        return loanCashReleaseRepository.save(loanCashRelease);
    }

    @Override
    public String deleteLoanCashRelease(Integer id) {
        loanCashReleaseRepository.deleteById(id);
        return "{'Message' : 'Loan Cash Released Deleted Successfully!'}";    }
}
