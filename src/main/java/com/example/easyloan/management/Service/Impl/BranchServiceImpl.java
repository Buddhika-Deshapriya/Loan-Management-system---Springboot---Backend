package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.Branch;
import com.example.easyloan.management.Repository.BranchRepository;
import com.example.easyloan.management.Service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchServiceImpl implements BranchService {
    private BranchRepository branchRepository;

    @Autowired
    public BranchServiceImpl(BranchRepository branchRepository) {

        this.branchRepository = branchRepository;
    }

    @Override
    public List<Branch> branchList() {
        return branchRepository.findAll();
    }

    @Override
    public Optional<Branch> findById(Integer id) {
        return branchRepository.findById(id);    }

    @Override
    public Branch addBranch(Branch branch) {
        return branchRepository.save(branch);
    }
}
