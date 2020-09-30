package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.Branch;
import com.example.easyloan.management.Service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/branch")
public class BranchController {

    private BranchService branchService;

    @Autowired
    public BranchController(BranchService branchService){
        this.branchService = branchService;
    }

    @RequestMapping("/add")
    public Branch addBranch(@RequestBody @Valid Branch branch) throws Exception {
        return branchService.addBranch(branch);
    }

    @RequestMapping("/list/{id}")
    public Optional<Branch> findById(@PathVariable Integer id){
        return branchService.findById(id);
    }

    @RequestMapping("/list")
    public List<Branch> branchList(){
        return branchService.branchList();

    }
}
