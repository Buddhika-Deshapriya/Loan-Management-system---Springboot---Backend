package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.Title;
import com.example.easyloan.management.Service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Controller for title type
 */
@RestController
@RequestMapping("/title")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TitleController {
    private TitleService titleService;

    @Autowired
    public TitleController(TitleService titleService){
        this.titleService = titleService;
    }

    @RequestMapping("/list")
    public List<Title> titleList(){
        return titleService.titleList();
    }
}
