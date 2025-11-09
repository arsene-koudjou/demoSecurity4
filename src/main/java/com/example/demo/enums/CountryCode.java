package com.example.demo.enums;

public enum CountryCode {
    FRANCE("France", "FR", "EUR"),
    GERMANY("Germany", "DE", "EUR"),
    SPAIN("Spain", "ES", "EUR"),
    ITALY("Italy", "IT", "EUR"),
    UNITED_KINGDOM("United Kingdom", "GB", "GBP"),
    USA("United States", "US", "USD"),
    CANADA("Canada", "CA", "CAD"),
    JAPAN("Japan", "JP", "JPY");

    private final String name;
    private final String isoCode;
    private final String currencyCode;

    CountryCode(String name, String isoCode, String currencyCode){
        this.name = name;
        this.isoCode = isoCode;
        this.currencyCode = currencyCode;
    }

    public String getName(){
        return name;
    }
    public String getIsoCode(){
        return isoCode;
    }
    public String getCurrencyCode(){
        return currencyCode;
    }
}
