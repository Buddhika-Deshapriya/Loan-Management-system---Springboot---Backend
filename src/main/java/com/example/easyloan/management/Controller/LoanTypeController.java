package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.LoanType;
import com.example.easyloan.management.Service.LoanTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loantype")
public class LoanTypeController {

    private LoanTypeService loanTypeService;

    @Autowired
    public LoanTypeController(LoanTypeService loanTypeService) {
        this.loanTypeService = loanTypeService;
    }


    @RequestMapping("/add")
    public LoanType addLoanType(@RequestBody LoanType loanType) throws Exception {
        return loanTypeService.addLoanType(loanType);
    }

    @RequestMapping("/list/{id}")
    public Optional<LoanType> findById(@PathVariable Integer id){
        return loanTypeService.findById(id);
    }

    @RequestMapping("/list")
    public List<LoanType> loanTypeList(){
        return loanTypeService.loanTypeList();

    }

    @RequestMapping("/delete/{id}")
    public String deleteLoanType(@PathVariable Integer id){
        return loanTypeService.deleteLoanType(id);
    }

}
