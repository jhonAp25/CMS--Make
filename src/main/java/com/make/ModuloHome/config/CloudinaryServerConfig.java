package com.make.ModuloHome.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;


@Configuration
public class CloudinaryServerConfig {

    private String CLOUD_NAME = "dod2jvyh4";
    private String API_KEY = "345356794932128";
    private String API_SECRET = "NtAimfQAhgPio4i4-Qjlf5tZeSI";


    @Bean
    public Cloudinary cloudinary() {
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", CLOUD_NAME);
        config.put("api_key", API_KEY);
        config.put("api_secret", API_SECRET);
        return new Cloudinary(config);
    }
}