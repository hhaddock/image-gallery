package com.atlas.photogallery.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "image")
@Getter
@Setter
public class Image implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;
}
