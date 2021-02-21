package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.Branch;
import com.example.easyloan.management.Repository.BranchRepository;
import com.example.easyloan.management.Service.BranchCodeGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchCodeGenServiceImpl implements BranchCodeGenService {
    private BranchRepository branchRepository;

    @Autowired
    public BranchCodeGenServiceImpl(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    @Override
    public List<Branch> CodeList() {
        return branchRepository.findLastQuery();
    }
}
