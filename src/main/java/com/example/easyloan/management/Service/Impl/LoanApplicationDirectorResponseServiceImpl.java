package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.LoanApplicationDirectorResponse;
import com.example.easyloan.management.Repository.LoanApplicationDirectorResponseRepository;
import com.example.easyloan.management.Service.LoanApplicationDirectorResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * Service implementation for loan application director service
 */
@Service
public class LoanApplicationDirectorResponseServiceImpl implements LoanApplicationDirectorResponseService {

    private LoanApplicationDirectorResponseRepository loanApplicationDirectorResponseRepository;

    @Autowired
    public LoanApplicationDirectorResponseServiceImpl(LoanApplicationDirectorResponseRepository loanApplicationDirectorResponseRepository) {

        this.loanApplicationDirectorResponseRepository = loanApplicationDirectorResponseRepository;
    }

    @Override
    public List<LoanApplicationDirectorResponse> loanApplicationDirectorResponseList() {
        return loanApplicationDirectorResponseRepository.findAll();
    }

    @Override
    public Optional<LoanApplicationDirectorResponse> findById(Integer id) {
        return loanApplicationDirectorResponseRepository.findById(id);
    }

    @Override
    public LoanApplicationDirectorResponse addLoanApplicationDirectorResponse(LoanApplicationDirectorResponse loanApplicationDirectorResponse) {
        return loanApplicationDirectorResponseRepository.save(loanApplicationDirectorResponse);
    }

    @Override
    public String deleteLoanApplicationDirectorResponse(Integer id) {
        loanApplicationDirectorResponseRepository.deleteById(id);
        return "{'Message' : 'Loan Application Director Response Deleted Successfully!'}";    }
}
