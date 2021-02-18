package com.example.easyloan.management.Controller;


import com.example.easyloan.management.Model.CustomerAssets;
import com.example.easyloan.management.Service.CustomerAssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customerassets")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerAssetsController {

    private CustomerAssetsService customerAssetsService;

    @Autowired
    public CustomerAssetsController(CustomerAssetsService customerAssetsService){
        this.customerAssetsService = customerAssetsService;
    }


    @RequestMapping("/add")
    public CustomerAssets addCustomerAssets(@RequestBody @Valid CustomerAssets customerAssets) throws Exception {
        return customerAssetsService.addCustomerAssets(customerAssets);
    }

    @RequestMapping("/list/{id}")
    public Optional<CustomerAssets> findById(@PathVariable Integer id){
        return customerAssetsService.findById(id);
    }

    @RequestMapping("/list")
    public List<CustomerAssets> customerAssetsList(){
        return customerAssetsService.customerAssetsList();

    }

}
