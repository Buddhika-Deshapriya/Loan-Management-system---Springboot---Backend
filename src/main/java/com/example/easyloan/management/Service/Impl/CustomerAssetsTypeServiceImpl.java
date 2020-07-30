package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.CustomerAssetsType;
import com.example.easyloan.management.Repository.CustomerAssetsTypeRepository;
import com.example.easyloan.management.Service.CustomerAssetsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerAssetsTypeServiceImpl implements CustomerAssetsTypeService {

    private CustomerAssetsTypeRepository customerAssetsTypeRepository;

    @Autowired
    public  CustomerAssetsTypeServiceImpl(CustomerAssetsTypeRepository customerAssetsTypeRepository) {

        this.customerAssetsTypeRepository = customerAssetsTypeRepository;
    }

    @Override
    public List<CustomerAssetsType> customerAssetsTypeList() {
        return customerAssetsTypeRepository.findAll();
    }

}
