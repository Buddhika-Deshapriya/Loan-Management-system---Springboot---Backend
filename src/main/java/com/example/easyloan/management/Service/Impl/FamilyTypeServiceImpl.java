package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.FamilyType;
import com.example.easyloan.management.Repository.FamilyTypeRepository;
import com.example.easyloan.management.Service.FamilyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Service implementation for family type service
 */
@Service
public class FamilyTypeServiceImpl implements FamilyTypeService {
    private FamilyTypeRepository familyTypeRepository;

    @Autowired
    public FamilyTypeServiceImpl(FamilyTypeRepository familyTypeRepository) {

        this.familyTypeRepository = familyTypeRepository;
    }

    @Override
    public List<FamilyType> familyTypeList() {
        return familyTypeRepository.findAll();
    }

}
