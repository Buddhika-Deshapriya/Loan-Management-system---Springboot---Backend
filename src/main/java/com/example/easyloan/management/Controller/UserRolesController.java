package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.Role;
import com.example.easyloan.management.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Controller for user roles
 */
@RestController
@RequestMapping("/userroles")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserRolesController {

    @Autowired
    RoleRepository roleRepository;

    @RequestMapping("/list")
    public List<Role> roleList(){
        return roleRepository.findAll();
    }
}
