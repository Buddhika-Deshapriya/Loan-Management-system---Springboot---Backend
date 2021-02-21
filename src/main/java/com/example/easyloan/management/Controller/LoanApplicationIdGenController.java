package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.LoanApplication;
import com.example.easyloan.management.Service.LoanApplicationIdGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loanapplicationinvoicenumbergenerate")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoanApplicationIdGenController {
    private LoanApplicationIdGenService loanApplicationIdGenService;

    @Autowired
    public LoanApplicationIdGenController(LoanApplicationIdGenService loanAppIdGenService) {
        this.loanApplicationIdGenService = loanAppIdGenService;
    }

    @RequestMapping("/takeid")
    public List<LoanApplication> appidList(){

        String app_id = loanApplicationIdGenService.AppList().get(0).getApplicationNo();
        String calc_id = loanApplicationIdGenService.AppList().get(0).getCalculationNo();
        Integer id = loanApplicationIdGenService.AppList().get(0).getId();
        Integer uid = ++id;
        String final_app_id = "LN-AN-" + uid;
        String final_calc_id = "LN-CN-"+ uid;
        loanApplicationIdGenService.AppList().get(0).setApplicationNo(final_app_id);
        loanApplicationIdGenService.AppList().get(0).setCalculationNo(final_calc_id);
        return loanApplicationIdGenService.AppList();
    }
}