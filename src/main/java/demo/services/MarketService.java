package demo.services;

import demo.dtos.MarketDto;
import demo.repository.MarketRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class MarketService {
    private final MarketRepository marketRepository;

    public MarketService(MarketRepository marketRepository){
        this.marketRepository = marketRepository;
    }

    public List<MarketDto> getAllMarkets(){
       return this.marketRepository.findAll()
                .stream().collect(Collectors.toMap(
                        market -> market.getName(), Function.identity(),(m1,m2)->m1)).values()
                .stream().map(MarketDto::fromMarketEntity).toList();
    }
}
