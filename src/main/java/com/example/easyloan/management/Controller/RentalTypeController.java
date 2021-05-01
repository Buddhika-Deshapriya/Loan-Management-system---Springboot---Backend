package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.RentalType;
import com.example.easyloan.management.Service.RentalTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Controller for rental type
 */
@RestController
@RequestMapping("/rentaltype")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RentalTypeController {
    private RentalTypeService rentalTypeService;

    @Autowired
    public RentalTypeController(RentalTypeService rentalTypeService){
        this.rentalTypeService = rentalTypeService;
    }
    @RequestMapping("/list")
    public List<RentalType> rentalTypeList(){
        return rentalTypeService.rentalTypeList();
    }
}
