package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.LoanApplication;
import com.example.easyloan.management.Model.LoanApplicationDirectorResponse;
import com.example.easyloan.management.Service.LoanApplicationDirectorResponseService;
import com.example.easyloan.management.Service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("directorresponse")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoanApplicationDirectorResponseController {

    private LoanApplicationDirectorResponseService loanApplicationDirectorResponseService;
    private LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationDirectorResponseController(LoanApplicationDirectorResponseService loanApplicationDirectorResponseService , LoanApplicationService loanApplicationService){
        this.loanApplicationDirectorResponseService = loanApplicationDirectorResponseService;
        this.loanApplicationService = loanApplicationService;
    }


    @RequestMapping("/add")
    public LoanApplicationDirectorResponse addLoanApplicationDirectorResponse(@RequestBody @Valid LoanApplicationDirectorResponse loanApplicationDirectorResponse) throws Exception {
        Optional<LoanApplication> loanApplication = loanApplicationService.findById(loanApplicationDirectorResponse.getId());
        loanApplication.get().setLoanStatus(loanApplicationDirectorResponse.getLoanStatus());
        return loanApplicationDirectorResponseService.addLoanApplicationDirectorResponse(loanApplicationDirectorResponse);
    }

    @RequestMapping("/list/{id}")
    public Optional<LoanApplicationDirectorResponse> findById(@PathVariable Integer id){
        return loanApplicationDirectorResponseService.findById(id);
    }

    @RequestMapping("/list")
    public List<LoanApplicationDirectorResponse> loanApplicationDirectorResponseList(){
        return loanApplicationDirectorResponseService.loanApplicationDirectorResponseList();

    }

    @RequestMapping("/delete/{id}")
    public String deleteLoanApplicationDirectorResponse(@PathVariable Integer id) {
        return loanApplicationDirectorResponseService.deleteLoanApplicationDirectorResponse(id);
    }
}
