package com.camroseBlinds.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "images")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image_title")
    private String imageTitle;

    @Lob
    @Column(name = "image_data")
    private byte[] file;

    @Column(name = "image_type")
    private String imageType;

}
