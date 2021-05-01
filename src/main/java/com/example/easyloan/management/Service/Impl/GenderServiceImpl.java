package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.Gender;
import com.example.easyloan.management.Repository.GenderRepository;
import com.example.easyloan.management.Service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Service implementation for gender service
 */
@Service
public class GenderServiceImpl implements GenderService {
    private GenderRepository genderRepository;

    @Autowired
    public GenderServiceImpl(GenderRepository genderRepository) {

        this.genderRepository = genderRepository;
    }

    @Override
    public List<Gender> genderList() {
        return genderRepository.findAll();
    }

}
