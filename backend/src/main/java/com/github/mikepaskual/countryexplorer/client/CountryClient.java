package com.github.mikepaskual.countryexplorer.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CountryClient {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String API_URL = "https://restcountries.com/v3.1/all?fields=name,cca3,population,flags,capital";

    public Object[] getAllCountries() {
        return restTemplate.getForObject(API_URL, Object[].class);
    }
}
