package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.LoanApplicationResponse;
import com.example.easyloan.management.Service.LoanApplicationResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loanapplicationresponse")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoanApplicationResponseController {

    private LoanApplicationResponseService loanApplicationResponseService;

    @Autowired
    public LoanApplicationResponseController(LoanApplicationResponseService loanApplicationResponseService){
        this.loanApplicationResponseService = loanApplicationResponseService;
    }


    @RequestMapping("/add")
    public LoanApplicationResponse addLoanApplicationResponse(@RequestBody @Valid LoanApplicationResponse loanApplicationResponse) throws Exception {
        return loanApplicationResponseService.addLoanApplicationResponse(loanApplicationResponse);
    }

    @RequestMapping("/list/{id}")
    public Optional<LoanApplicationResponse> findById(@PathVariable Integer id){
        return loanApplicationResponseService.findById(id);
    }

    @RequestMapping("/list")
    public List<LoanApplicationResponse> loanApplicationResponseList(){
        return loanApplicationResponseService.loanApplicationResponseList();

    }

    @RequestMapping("/delete/{id}")
    public String deleteLoanApplicationResponse(@PathVariable Integer id) {
        return loanApplicationResponseService.deleteLoanApplicationResponse(id);
    }
}
