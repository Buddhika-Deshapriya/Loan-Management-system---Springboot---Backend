package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.CustomerAssets;
import com.example.easyloan.management.Repository.CustomerAssetsRepository;
import com.example.easyloan.management.Service.CustomerAssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerAssetsServiceImpl implements CustomerAssetsService {

    private CustomerAssetsRepository customerAssetsRepository;

    @Autowired
    public  CustomerAssetsServiceImpl(CustomerAssetsRepository customerAssetsRepository) {

        this.customerAssetsRepository = customerAssetsRepository;
    }

    @Override
    public List<CustomerAssets> customerAssetsList() {
        return customerAssetsRepository.findAll();
    }

    @Override
    public Optional<CustomerAssets> findById(Integer id) {
        return customerAssetsRepository.findById(id);
    }

    @Override
    public CustomerAssets addCustomerAssets(CustomerAssets customerAssets) {
        return customerAssetsRepository.save(customerAssets);
    }

    @Override
    public String deleteCustomerAssets(Integer id) {
        customerAssetsRepository.deleteById(id);
        return "{'Message' : 'Customer Assets Deleted Successfully!'}";
    }
}
