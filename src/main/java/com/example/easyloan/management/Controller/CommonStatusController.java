package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.CommonStatus;
import com.example.easyloan.management.Service.CommonStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commonstatus")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CommonStatusController {
    private CommonStatusService commonStatusService;

    @Autowired
    public CommonStatusController(CommonStatusService commonStatusService){
        this.commonStatusService = commonStatusService;
    }
    @RequestMapping("/list")
    public List<CommonStatus> commonStatusList(){
        return commonStatusService.commonStatusList();
    }
}
