package com.example.easyloan.management.Controller;


import com.example.easyloan.management.Model.LoanApplicationResponse;
import com.example.easyloan.management.Model.LoanCashRelease;
import com.example.easyloan.management.Service.LoanApplicationResponseService;
import com.example.easyloan.management.Service.LoanCashReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("loancashrelease")
public class LoanCashReleaseController {

    private LoanCashReleaseService loanCashReleaseService;

    @Autowired
    public LoanCashReleaseController(LoanCashReleaseService loanCashReleaseService){
        this.loanCashReleaseService = loanCashReleaseService;
    }


    @RequestMapping("/add")
    public LoanCashRelease addLoanCashRelease(@RequestBody LoanCashRelease loanCashRelease) throws Exception {
        return loanCashReleaseService.addLoanCashRelease(loanCashRelease);
    }

    @RequestMapping("/list/{id}")
    public Optional<LoanCashRelease> findById(@PathVariable Integer id){
        return loanCashReleaseService.findById(id);
    }

    @RequestMapping("/list")
    public List<LoanCashRelease> loanApplicationResponseList(){
        return loanCashReleaseService.loanCashReleaseList();

    }

    @RequestMapping("/delete/{id}")
    public String deleteLoanApplicationResponse(@PathVariable Integer id) {
        return loanCashReleaseService.deleteLoanCashRelease(id);
    }
}
