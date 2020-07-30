package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.LoanStatus;
import com.example.easyloan.management.Service.LoanStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loanstatus")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoanStatusController {
    private LoanStatusService loanStatusService;

    @Autowired
    public LoanStatusController(LoanStatusService loanStatusService){
        this.loanStatusService = loanStatusService;
    }
    @RequestMapping("/list")
    public List<LoanStatus> loanStatusList(){
        return loanStatusService.loanStatusList();
    }
}
