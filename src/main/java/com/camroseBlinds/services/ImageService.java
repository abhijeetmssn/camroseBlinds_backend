package com.camroseBlinds.services;


import com.camroseBlinds.entities.Image;
import com.camroseBlinds.repos.ImageRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ImageService {


    private final ImageRepo imageRepo;

    public String saveImage(Image image){
        imageRepo.save(image);
        return "Image Successfully Saved";
    }

    public Image getImageById(Long id){
        return imageRepo.getReferenceById(id);
    }

}
