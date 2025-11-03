package com.example.demo.initializer;

import com.example.demo.models.Category;
import com.example.demo.models.Product;
import com.example.demo.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    private static final Logger log = LoggerFactory.getLogger(DataInitializer.class);

    @Bean
      CommandLineRunner initDatabase (ProductRepository productRepository){

          return args -> {
                  productRepository.save(new Product(null,"orange",25.0,100, new Category("Fruit")));
                  productRepository.save(new Product(null,"lemon",40.4,200, new Category("Fruit")));
                  productRepository.save(new Product(null,"banana",10,500, new Category("Fruit")));
                  log.info("+++++ database initialized ++++");
          };
      }
}
