package com.example.easyloan.management.Controller.TrialCalculator;

import com.example.easyloan.management.Model.TrialCalculatorModel.MonthlyAmortizationSchedule;
import com.example.easyloan.management.Service.TrialCalculatorService.AmortizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loancalc")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoanTrialCalculatorController {

    @Autowired
    private AmortizationService amortizationService;


    @RequestMapping(value = "/show", method = RequestMethod.POST)
    @PreAuthorize("hasRole('DIR') or hasRole('ADMIN')")
    public MonthlyAmortizationSchedule calculatePayments(@RequestBody MonthlyAmortizationSchedule monthlyAmortizationSchedule  , BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            System.out.println( "There are errors! " + bindingResult.getAllErrors().toString() );
        }
        amortizationService.initializeUnknownFields(monthlyAmortizationSchedule);
        return monthlyAmortizationSchedule;
    }

}
