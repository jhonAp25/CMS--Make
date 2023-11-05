package com.make.ModuloHome.repository;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileIUploadRepository {
    String uploadImage(MultipartFile multipartFile) throws IOException;
}
