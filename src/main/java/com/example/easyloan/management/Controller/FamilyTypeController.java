package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.FamilyType;
import com.example.easyloan.management.Service.FamilyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/familytype")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FamilyTypeController {
    private FamilyTypeService familyTypeService;

    @Autowired
    public FamilyTypeController(FamilyTypeService familyTypeService){
        this.familyTypeService = familyTypeService;
    }
    @RequestMapping("/list")
    public List<FamilyType> familyTypeList(){
        return familyTypeService.familyTypeList();
    }
}
