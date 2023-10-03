package com.camroseBlinds.controllers;
import com.camroseBlinds.DTOs.UserModel;
import com.camroseBlinds.entities.Image;
import com.camroseBlinds.services.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping("login")
@CrossOrigin(origins = "http://localhost:3000")
public class MyController {

    private final ImageService imageService;

    @PostMapping()
    public boolean login(@RequestBody UserModel creds){
        return creds.getEmail().equals("abhijeetmssn924@gmail.com") && creds.getPassword().equals("admin");
    }


    @PostMapping("/image")
    public String uploadImage(@RequestParam("file") MultipartFile file,
                               @RequestParam("imageTitle") String imageTitle,
                               @RequestParam("imageType") String imageType) throws IOException {


        Image image = new Image();
        image.setImageTitle(imageTitle);
        image.setImageType(imageType);
        image.setFile(file.getBytes());
        return imageService.saveImage(image);
    }

    @GetMapping()
    public byte[] getImage(){
       return imageService.getImageById(1L).getFile();
    }
}
