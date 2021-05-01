package com.example.easyloan.management.Service;

import com.example.easyloan.management.Model.Branch;

import java.util.List;
import java.util.Optional;

/*
 * Service for branch
 */
public interface BranchService {

    List<Branch> branchList();

    Optional<Branch> findById(Integer id);

    Branch addBranch(Branch branch);

}
