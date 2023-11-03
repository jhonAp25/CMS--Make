package com.make.ModuloHome.controller;


import com.make.ModuloHome.model.Home;
import com.make.ModuloHome.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class HomeController {

    @Autowired
    HomeService homeService;


    @GetMapping()
    public List<Home> getHome(){
        return homeService.getHome();
    }


}
