package demo.dtos;

import demo.enums.CountryCode;
import demo.models.Market;

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
