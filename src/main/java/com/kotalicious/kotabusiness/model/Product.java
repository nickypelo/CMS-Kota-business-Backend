package com.kotalicious.kotabusiness.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.web.multipart.MultipartFile;

import java.util.Currency;

@Data
@Table(name="product")
public class Product {

    @Id
    private String id;
    @Column("productName")
    private String name;
    @Column("productPrice")
    private double price;
    @Column("productImage")
    private String image;
    @Column("productDescription")
    private String description;
}
