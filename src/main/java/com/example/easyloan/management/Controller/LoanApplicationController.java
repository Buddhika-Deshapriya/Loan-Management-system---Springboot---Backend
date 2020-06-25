package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.Customer;
import com.example.easyloan.management.Model.LoanApplication;
import com.example.easyloan.management.Service.CustomerService;
import com.example.easyloan.management.Service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loanapplication")
public class LoanApplicationController {

    private LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService){
        this.loanApplicationService = loanApplicationService;
    }


    @RequestMapping("/add")
    public LoanApplication addLoanApplication(@RequestBody LoanApplication loanApplication) throws Exception {
        return loanApplicationService.addLoanApplication(loanApplication);
    }

    @RequestMapping("/list/{id}")
    public Optional<LoanApplication> findById(@PathVariable Integer id){
        return loanApplicationService.findById(id);
    }

    @RequestMapping("/list")
    public List<LoanApplication> loanApplicationList(){
        return loanApplicationService.loanApplicationList();

    }

    @RequestMapping("/delete/{id}")
    public String deleteLoanApplication(@PathVariable Integer id) {
        return loanApplicationService.deleteLoanApplication(id);
    }
}
