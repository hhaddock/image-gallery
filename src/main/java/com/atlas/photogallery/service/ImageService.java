package com.atlas.photogallery.service;

import com.atlas.photogallery.entity.Image;

public interface ImageService {

    public abstract Image createImage(Image image);
    public abstract Iterable<Image> getImages();
    public abstract Image getImageById(Long id);
}
