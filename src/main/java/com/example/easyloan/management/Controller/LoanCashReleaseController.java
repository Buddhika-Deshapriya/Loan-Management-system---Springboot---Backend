package com.example.easyloan.management.Controller;


import com.example.easyloan.management.Model.LoanApplication;
import com.example.easyloan.management.Model.LoanCashRelease;
import com.example.easyloan.management.Service.LoanApplicationService;
import com.example.easyloan.management.Service.LoanCashReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("loancashrelease")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoanCashReleaseController {

    private LoanCashReleaseService loanCashReleaseService;
    private LoanApplicationService loanApplicationService;

    @Autowired
    public LoanCashReleaseController(LoanCashReleaseService loanCashReleaseService ,LoanApplicationService loanApplicationService){
        this.loanCashReleaseService = loanCashReleaseService;
        this.loanApplicationService=loanApplicationService;
    }


    @RequestMapping("/add")
    public LoanCashRelease addLoanCashRelease(@RequestBody @Valid LoanCashRelease loanCashRelease) throws Exception {
        Optional<LoanApplication> loanApplication = loanApplicationService.findById(loanCashRelease.getId());
        loanApplication.get().setLoanStatus(loanCashRelease.getLoanStatus());
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
