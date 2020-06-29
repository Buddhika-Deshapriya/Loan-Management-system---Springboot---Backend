package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.Customer;
import com.example.easyloan.management.Model.Loan;
import com.example.easyloan.management.Service.CustomerService;
import com.example.easyloan.management.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loan")
public class LoanController {

    private LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService){
        this.loanService = loanService;
    }


    @RequestMapping("/add")
    public Loan addLoan(@RequestBody Loan loan) throws Exception {
        return loanService.addLoan(loan);
    }

    @RequestMapping("/list/{id}")
    public Optional<Loan> findById(@PathVariable Integer id){
        return loanService.findById(id);
    }

    @RequestMapping("/list")
    public List<Loan> loanList(){
        return loanService.loanList();

    }

    @RequestMapping("/delete/{id}")
    public String deleteLoan(@PathVariable Integer id) {
        return loanService.deleteLoan(id);
    }
}
