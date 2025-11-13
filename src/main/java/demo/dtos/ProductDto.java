package demo.dtos;

import demo.models.Product;

public record ProductDto(Long id, String name, double price, int stock) {
    public static ProductDto fromProductEntity(Product product){
     return new ProductDto(
             product.getId(),
             product.getName(),
             product.getPrice(),
             product.getStock()
     );
    }
}
