package com.example.demo.services;

import com.example.demo.dtos.ProductDto;
import com.example.demo.models.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<ProductDto> getAllProducts(){
        return  this.productRepository.findAll().stream()
                .collect(
                        Collectors.toMap(Product::getName, Function.identity(), (p1, p2) -> p1)).values()
                .stream().map(ProductDto::fromProductEntity).toList();
    }
}
