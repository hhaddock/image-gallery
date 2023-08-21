package com.atlas.photogallery.controller;

import com.atlas.photogallery.entity.Image;
import com.atlas.photogallery.service.impl.ImageServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/images")
@RequiredArgsConstructor
public class GalleryController {

    @Autowired
    ImageServiceImpl imageService;

    @GetMapping
    public ResponseEntity<List<Image>> getImages() {
        Iterable<Image> images = imageService.getImages();
        return new ResponseEntity<>((List<Image>) images, HttpStatus.OK);
    }
}
