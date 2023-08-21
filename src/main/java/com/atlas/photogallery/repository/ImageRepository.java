package com.atlas.photogallery.repository;

import com.atlas.photogallery.entity.Image;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImageRepository extends CrudRepository<Image, Long> {
    Image findImageById(Long id);
    List<Image> findImagesByGallery(String galleryName);
}
