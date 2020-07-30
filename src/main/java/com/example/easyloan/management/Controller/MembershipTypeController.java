package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.MembershipType;
import com.example.easyloan.management.Service.MembershipTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/membershiptype")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MembershipTypeController {
    private MembershipTypeService membershipTypeService;

    @Autowired
    public MembershipTypeController(MembershipTypeService membershipTypeService){
        this.membershipTypeService = membershipTypeService;
    }
    @RequestMapping("/list")
    public List<MembershipType> membershipTypeList(){
        return membershipTypeService.membershipTypeList();
    }
}
