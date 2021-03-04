package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.LoanCashRelease;
import com.example.easyloan.management.Repository.LoanApplicationRepository;
import com.example.easyloan.management.Repository.LoanCashReleaseRepository;
import com.example.easyloan.management.Service.LoanCashReleaseVoucherIdGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanCashReleaseVoucherIdGenServiceImpl implements LoanCashReleaseVoucherIdGenService {
    private LoanCashReleaseRepository loanCashReleaseRepository;

    @Autowired
    public LoanCashReleaseVoucherIdGenServiceImpl(LoanCashReleaseRepository loanCashReleaseRepository) {
        this.loanCashReleaseRepository = loanCashReleaseRepository;
    }

    @Override
    public List<LoanCashRelease> CashList() {
        return loanCashReleaseRepository.findLastQuery();
    }
}