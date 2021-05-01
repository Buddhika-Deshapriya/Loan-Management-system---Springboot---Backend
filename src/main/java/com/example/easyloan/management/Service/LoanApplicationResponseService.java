package com.example.easyloan.management.Service;

import com.example.easyloan.management.Model.LoanApplicationResponse;

import java.util.List;
import java.util.Optional;

/*
 * Service for loan application response
 */
public interface LoanApplicationResponseService {

    List<LoanApplicationResponse> loanApplicationResponseList();

    Optional<LoanApplicationResponse> findById(Integer id);

    LoanApplicationResponse addLoanApplicationResponse(LoanApplicationResponse loanApplicationResponse);

    String deleteLoanApplicationResponse(Integer id);

}
