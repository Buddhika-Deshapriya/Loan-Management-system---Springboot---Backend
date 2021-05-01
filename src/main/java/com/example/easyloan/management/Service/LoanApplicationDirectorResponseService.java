package com.example.easyloan.management.Service;

import com.example.easyloan.management.Model.LoanApplicationDirectorResponse;

import java.util.List;
import java.util.Optional;

/*
 * Service for loan application director response
 */
public interface LoanApplicationDirectorResponseService {
    List<LoanApplicationDirectorResponse> loanApplicationDirectorResponseList();

    Optional<LoanApplicationDirectorResponse> findById(Integer id);

    LoanApplicationDirectorResponse addLoanApplicationDirectorResponse(LoanApplicationDirectorResponse loanApplicationDirectorResponse);

    String deleteLoanApplicationDirectorResponse(Integer id);
}
