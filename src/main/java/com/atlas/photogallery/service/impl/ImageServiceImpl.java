package com.atlas.photogallery.service.impl;

import com.atlas.photogallery.entity.Image;
import com.atlas.photogallery.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired

    @Override
    public Image createImage(Image image) {
        return null;
    }

    @Override
    public Iterable<Image> getImages() {

        return null;
    }

    @Override
    public Image getImageById(Long id) {
        return null;
    }
}
