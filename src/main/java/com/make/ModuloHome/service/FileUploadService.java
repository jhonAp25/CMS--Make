package com.make.ModuloHome.service;

import com.cloudinary.Cloudinary;
import com.make.ModuloHome.repository.FileIUploadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class FileUploadService implements FileIUploadRepository {
    private final Cloudinary cloudinary;


    @Override
    public String uploadImage(MultipartFile multipartFile) throws IOException {
        return cloudinary.uploader()
                .upload(multipartFile.getBytes(),
                        Map.of("public_id", UUID.randomUUID().toString()))
                .get("url")
                .toString();
    }
}
