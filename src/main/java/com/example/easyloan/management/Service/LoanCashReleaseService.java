package com.example.easyloan.management.Service;

import com.example.easyloan.management.Model.LoanApplication;
import com.example.easyloan.management.Model.LoanCashRelease;

import java.util.List;
import java.util.Optional;

public interface LoanCashReleaseService {

    List<LoanCashRelease> loanCashReleaseList();

    Optional<LoanCashRelease> findById(Integer id);

    LoanCashRelease addLoanCashRelease(LoanCashRelease loanCashRelease);

    String deleteLoanCashRelease(Integer id);
}
