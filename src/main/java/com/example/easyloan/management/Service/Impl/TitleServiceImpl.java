package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.Title;
import com.example.easyloan.management.Repository.TitleRepository;
import com.example.easyloan.management.Service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Service implementation for title service
 */
@Service
public class TitleServiceImpl implements TitleService {
    private TitleRepository titleRepository;

    @Autowired
    public TitleServiceImpl(TitleRepository titleRepository) {

        this.titleRepository = titleRepository;
    }

    @Override
    public List<Title> titleList() {
        return titleRepository.findAll();
    }

}
