package com.example.demo.controller;

import com.example.demo.dtos.MarketDto;
import com.example.demo.models.Market;
import com.example.demo.repository.MarketRepository;
import com.example.demo.services.MarketService;
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
