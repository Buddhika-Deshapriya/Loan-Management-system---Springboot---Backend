package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.Gender;
import com.example.easyloan.management.Service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Controller for gender type
 */
@RestController
@RequestMapping("/gender")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GenderController {

    private GenderService genderService;

    @Autowired
    public GenderController(GenderService genderService){
        this.genderService = genderService;
    }
    @RequestMapping("/list")
    public List<Gender> genderList(){
        return genderService.genderList();
    }
}
