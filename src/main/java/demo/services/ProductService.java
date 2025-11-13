package demo.services;

import demo.dtos.ProductDto;
import demo.repository.ProductRepository;
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
                        Collectors.toMap(product -> product.getName(), Function.identity(), (p1, p2) -> p1)).values()
                .stream().map(ProductDto::fromProductEntity).toList();
    }
}
