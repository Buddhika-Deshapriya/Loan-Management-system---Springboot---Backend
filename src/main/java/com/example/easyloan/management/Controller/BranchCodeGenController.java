package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.Branch;
import com.example.easyloan.management.Service.BranchCodeGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loanapplicationinvoicenumbergenerate")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BranchCodeGenController {
    private BranchCodeGenService branchCodeGenService;

    @Autowired
    public BranchCodeGenController(BranchCodeGenService branchCodeGenService) {
        this.branchCodeGenService = branchCodeGenService;
    }

    @RequestMapping("/takecode")
    public List<Branch> codeGenList(){

        String app_id = branchCodeGenService.CodeList().get(0).getBranchCode();
        Integer id = branchCodeGenService.CodeList().get(0).getId();

        Integer uid = ++id;
        String final_code_id = "COOP-" + uid;
        branchCodeGenService.CodeList().get(0).setBranchCode(final_code_id);
        return branchCodeGenService.CodeList();
    }
}
