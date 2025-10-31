package com.example.demo.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

@Entity
public class Product {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
