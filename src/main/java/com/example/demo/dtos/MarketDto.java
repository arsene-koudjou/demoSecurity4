package com.example.demo.dtos;

import com.example.demo.enums.CountryCode;
import com.example.demo.models.Market;

import java.util.Set;

public record MarketDto(Long id, String name, Set<CountryCode> countries) {

    public static MarketDto fromMarketEntity(Market market){
        return new MarketDto(
                market.getId(),
                market.getName(),
                market.getCountries()
        );
    }
}
