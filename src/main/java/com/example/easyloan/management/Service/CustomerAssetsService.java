package com.example.easyloan.management.Service;

import com.example.easyloan.management.Model.CustomerAssets;

import java.util.List;
import java.util.Optional;

/*
 * Service for customer assets
 */
public interface CustomerAssetsService {

    List<CustomerAssets> customerAssetsList();

    Optional<CustomerAssets> findById(Integer id);

    CustomerAssets addCustomerAssets(CustomerAssets customerAssets);
}
