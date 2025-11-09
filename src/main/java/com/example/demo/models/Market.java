package com.example.demo.models;

import com.example.demo.enums.CountryCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Market {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ElementCollection(targetClass = CountryCode.class)
    @CollectionTable(name = "market_countries", joinColumns = @JoinColumn(name = "market_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "country")
    private Set<CountryCode> countries;
    @OneToMany(mappedBy = "market", cascade = CascadeType.ALL)
    private Set<Product> products;

    public Market(String name,Set<CountryCode> countries){
        this.name = name;
        this.countries = countries;
    }

    public Set<String> getCurrencies(){
        return countries.stream()
                .map(CountryCode::getCurrencyCode)
                .collect(Collectors.toSet());
    }
}
