package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.LoanApplicationDirectorResponse;
import com.example.easyloan.management.Service.LoanApplicationDirectorResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("directorresponse")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoanApplicationDirectorResponseController {

    private LoanApplicationDirectorResponseService loanApplicationDirectorResponseService;

    @Autowired
    public LoanApplicationDirectorResponseController(LoanApplicationDirectorResponseService loanApplicationDirectorResponseService){
        this.loanApplicationDirectorResponseService = loanApplicationDirectorResponseService;
    }


    @RequestMapping("/add")
    public LoanApplicationDirectorResponse addLoanApplicationDirectorResponse(@RequestBody LoanApplicationDirectorResponse loanApplicationDirectorResponse) throws Exception {
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
