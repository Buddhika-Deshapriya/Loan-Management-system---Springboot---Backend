package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.MembershipType;
import com.example.easyloan.management.Repository.MembershipTypeRepository;
import com.example.easyloan.management.Service.MembershipTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Service implementation for membership type service
 */
@Service
public class MembershipTypeServiceImpl implements MembershipTypeService {
    private MembershipTypeRepository membershipTypeRepository;

    @Autowired
    public MembershipTypeServiceImpl(MembershipTypeRepository membershipTypeRepository) {

        this.membershipTypeRepository = membershipTypeRepository;
    }

    @Override
    public List<MembershipType> membershipTypeList() {
        return membershipTypeRepository.findAll();
    }

}
