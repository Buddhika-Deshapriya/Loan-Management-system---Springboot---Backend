package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.CustomerAssetsType;
import com.example.easyloan.management.Service.CustomerAssetsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Controller for customer assets type
 */
@RestController
@RequestMapping("/customerassetstype")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerAssetsTypeController {

    private CustomerAssetsTypeService customerAssetsTypeService;

    @Autowired
    public CustomerAssetsTypeController(CustomerAssetsTypeService customerAssetsTypeService){
        this.customerAssetsTypeService = customerAssetsTypeService;
    }
    @RequestMapping("/list")
    public List<CustomerAssetsType> customerAssetsTypeList(){
        return customerAssetsTypeService.customerAssetsTypeList();
    }
}
