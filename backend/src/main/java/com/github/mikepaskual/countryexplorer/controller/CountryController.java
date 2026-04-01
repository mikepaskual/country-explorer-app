package com.github.mikepaskual.countryexplorer.controller;

import com.github.mikepaskual.countryexplorer.dto.CountryDTO;
import com.github.mikepaskual.countryexplorer.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<CountryDTO> getCountries() {
        return countryService.getCountries();
    }
}
