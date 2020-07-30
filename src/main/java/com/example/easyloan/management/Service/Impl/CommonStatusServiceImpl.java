package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.CommonStatus;
import com.example.easyloan.management.Repository.CommonStatusRepository;
import com.example.easyloan.management.Service.CommonStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonStatusServiceImpl implements CommonStatusService {

    private CommonStatusRepository commonStatusRepository;

    @Autowired
    public CommonStatusServiceImpl(CommonStatusRepository commonStatusRepository) {

        this.commonStatusRepository = commonStatusRepository;
    }

    @Override
    public List<CommonStatus> commonStatusList() {
        return commonStatusRepository.findAll();
    }


}
