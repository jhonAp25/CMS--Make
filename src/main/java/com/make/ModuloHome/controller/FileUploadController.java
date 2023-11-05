package com.make.ModuloHome.controller;


import com.make.ModuloHome.service.FileUploadService;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/images")
public class FileUploadController {


    @Autowired
    private  FileUploadService fileUpload;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("image") MultipartFile multipartFile,
                             Model model) throws IOException {
        String imageURL = fileUpload.uploadImage(multipartFile);
        model.addAttribute("imageURL",imageURL);
        return imageURL;
    }
}
