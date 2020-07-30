package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.RentalType;
import com.example.easyloan.management.Repository.RentalTypeRepository;
import com.example.easyloan.management.Service.RentalTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalTypeServiceImpl implements RentalTypeService {
    private RentalTypeRepository rentalTypeRepository;

    @Autowired
    public RentalTypeServiceImpl(RentalTypeRepository rentalTypeRepository) {

        this.rentalTypeRepository = rentalTypeRepository;
    }

    @Override
    public List<RentalType> rentalTypeList() {
        return rentalTypeRepository.findAll();
    }

}
