package com.apbg.webstore.productservice.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String image;
    private Double price;

    @Column(columnDefinition = "TEXT")
    private String description;
}
