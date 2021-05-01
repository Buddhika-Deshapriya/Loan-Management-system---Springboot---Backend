package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.MarriedStatus;
import com.example.easyloan.management.Service.MarriedStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Controller for married status
 */
@RestController
@RequestMapping("/marriedstatus")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MarriedStatusController {
    private MarriedStatusService marriedStatusService;

    @Autowired
    public MarriedStatusController(MarriedStatusService marriedStatusService){
        this.marriedStatusService= marriedStatusService;
    }
    @RequestMapping("/list")
    public List<MarriedStatus> marriedStatusList(){
        return marriedStatusService.marriedStatusList();
    }
}
