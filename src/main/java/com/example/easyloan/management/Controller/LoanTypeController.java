package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.LoanType;
import com.example.easyloan.management.Service.LoanTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/loantype")
public class LoanTypeController {

    private LoanTypeService loanTypeService;

    @Autowired
    public LoanTypeController(LoanTypeService loanTypeService) {
        this.loanTypeService = loanTypeService;
    }


    @RequestMapping("/add")
    @PreAuthorize("hasRole('DIR') or hasRole('ADMIN') or hasRole('MGR')")
    public LoanType addLoanType(@RequestBody @Valid LoanType loanType) throws Exception {
        return loanTypeService.addLoanType(loanType);
    }

    @RequestMapping("/list/{id}")
    public Optional<LoanType> findById(@PathVariable Integer id){
        return loanTypeService.findById(id);
    }

    @RequestMapping("/list")
    @PreAuthorize("hasRole('DIR') or hasRole('ADMIN') or hasRole('FRO') or hasRole('USER')")
    public List<LoanType> loanTypeList(){
        return loanTypeService.loanTypeList();

    }

    @RequestMapping("/delete/{id}")
    public String deleteLoanType(@PathVariable Integer id){
        return loanTypeService.deleteLoanType(id);
    }

}
