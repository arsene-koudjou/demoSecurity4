package demo.controller;
import demo.dtos.MarketDto;
import demo.services.MarketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/markets")
public class MarketController {
    private final MarketService marketService;

    public MarketController(MarketService marketService){
        this.marketService = marketService;
    }

    @GetMapping
    public List<MarketDto> getAllMarkets(){
        return this.marketService.getAllMarkets();
    }

}
