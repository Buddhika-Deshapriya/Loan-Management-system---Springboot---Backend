package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.LoanApplicationResponse;
import com.example.easyloan.management.Repository.LoanApplicationResponseRepository;
import com.example.easyloan.management.Service.LoanApplicationResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanApplicationResponseServiceImpl implements LoanApplicationResponseService {

    private LoanApplicationResponseRepository loanApplicationResponseRepository;

    @Autowired
    public LoanApplicationResponseServiceImpl(LoanApplicationResponseRepository loanApplicationResponseRepository) {

        this.loanApplicationResponseRepository = loanApplicationResponseRepository;
    }

    @Override
    public List<LoanApplicationResponse> loanApplicationResponseList() {
        return loanApplicationResponseRepository.findAll();
    }

    @Override
    public Optional<LoanApplicationResponse> findById(Integer id) {
        return loanApplicationResponseRepository.findById(id);
    }

    @Override
    public LoanApplicationResponse addLoanApplicationResponse(LoanApplicationResponse loanApplicationResponse) {
        return loanApplicationResponseRepository.save(loanApplicationResponse);
    }

    @Override
    public String deleteLoanApplicationResponse(Integer id) {
        loanApplicationResponseRepository.deleteById(id);
        return "{'Message' : 'Loan Application Response Deleted Successfully!'}";
    }
}
