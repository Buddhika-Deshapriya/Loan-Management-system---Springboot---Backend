package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.MarriedStatus;
import com.example.easyloan.management.Repository.MarriedStatusRepository;
import com.example.easyloan.management.Service.MarriedStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarriedStatusServiceImpl implements MarriedStatusService {
    private MarriedStatusRepository marriedStatusRepository;

    @Autowired
    public  MarriedStatusServiceImpl(MarriedStatusRepository marriedStatusRepository) {

        this.marriedStatusRepository = marriedStatusRepository;
    }

    @Override
    public List<MarriedStatus> marriedStatusList() {
        return marriedStatusRepository.findAll();
    }

}
