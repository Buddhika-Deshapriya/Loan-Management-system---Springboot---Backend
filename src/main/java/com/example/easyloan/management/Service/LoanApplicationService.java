package com.example.easyloan.management.Service;

import com.example.easyloan.management.Model.LoanApplication;

import java.util.List;
import java.util.Optional;

public interface LoanApplicationService {
    List<LoanApplication> loanApplicationList();

    Optional<LoanApplication> findById(Integer id);

    LoanApplication addLoanApplication(LoanApplication loanApplication);

    String deleteLoanApplication(Integer id);
}
