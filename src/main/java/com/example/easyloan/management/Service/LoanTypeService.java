package com.example.easyloan.management.Service;

import com.example.easyloan.management.Model.LoanType;

import java.util.List;
import java.util.Optional;

public interface LoanTypeService {
    List<LoanType> loanTypeList();

    Optional<LoanType> findById(Integer id);

    LoanType addLoanType(LoanType loanType);

    String deleteLoanType(Integer id);
}
