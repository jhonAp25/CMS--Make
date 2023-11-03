package com.make.ModuloHome.service;

import com.make.ModuloHome.model.Home;
import com.make.ModuloHome.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    @Autowired
    HomeRepository homeRepository;

    public List<Home> getHome(){
        return homeRepository.findAll();
    }


}
