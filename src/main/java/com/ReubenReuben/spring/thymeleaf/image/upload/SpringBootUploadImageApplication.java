package com.ReubenReuben.spring.thymeleaf.image.upload;

import javax.annotation.Resource;

import com.ReubenReuben.spring.thymeleaf.image.upload.service.FilesStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootUploadImageApplication implements CommandLineRunner {

  @Resource
  FilesStorageService storageService;

  public static void main(String[] args) {
    SpringApplication.run(SpringBootUploadImageApplication.class, args);
  }

  @Override
  public void run(String... arg) throws Exception {
//    storageService.deleteAll();
    storageService.init();
  }
}
