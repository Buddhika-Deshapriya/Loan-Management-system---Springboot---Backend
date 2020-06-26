//package com.example.easyloan.management.Service.Impl;
//
//import com.example.easyloan.management.Model.Loan;
//import com.example.easyloan.management.Repository.LoanRepository;
//import com.example.easyloan.management.Service.LoanService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class LoanServiceImpl implements LoanService {
//
//    private LoanRepository loanRepository;
//
//    @Autowired
//    public  LoanServiceImpl(LoanRepository loanRepository) {
//
//        this.loanRepository = loanRepository;
//    }
//
//    @Override
//    public List<Loan> loanList() {
//        return loanRepository.findAll();
//
//    }
//
//    @Override
//    public Optional<Loan> findById(Integer id) {
//        return loanRepository.findById(id);
//    }
//
//    @Override
//    public Loan addLoan(Loan loan) {
//        return loanRepository.save(loan);
//    }
//
//    @Override
//    public String deleteLoan(Integer id) {
//        loanRepository.deleteById(id);
//        return "{'Message' : 'Loan Deleted Successfully!'}";    }
//}
