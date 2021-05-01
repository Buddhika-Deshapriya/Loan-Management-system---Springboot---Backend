package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.LoanType;
import com.example.easyloan.management.Repository.LoanTypeRepository;
import com.example.easyloan.management.Service.LoanTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * Service implementation for loan type service
 */
@Service
public class LoanTypeServiceImpl implements LoanTypeService {

    private LoanTypeRepository loanTypeRepository;

    @Autowired
    public  LoanTypeServiceImpl(LoanTypeRepository loanTypeRepository) {
        this.loanTypeRepository = loanTypeRepository;
    }

    @Override
    public List<LoanType> loanTypeList() {
        return loanTypeRepository.findAll();
    }

    @Override
    public Optional<LoanType> findById(Integer id) {
        return loanTypeRepository.findById(id);
    }

    @Override
    public LoanType addLoanType(LoanType loanType) {
        return loanTypeRepository.save(loanType);
    }
    @Override
    public String deleteLoanType(Integer id) {
        loanTypeRepository.deleteById(id);
        return "{'Message' : 'Loan Type Deleted Successfully!'}";
    }
}
