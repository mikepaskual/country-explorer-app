package com.github.mikepaskual.countryexplorer.service;

import com.github.mikepaskual.countryexplorer.client.CountryClient;
import com.github.mikepaskual.countryexplorer.dto.CountryDTO;
import com.github.mikepaskual.countryexplorer.dto.FlagDTO;
import com.github.mikepaskual.countryexplorer.dto.GenericBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CountryService {

    private final CountryClient countryClient;

    public CountryService(CountryClient countryClient) {
        this.countryClient = countryClient;
    }

    @SuppressWarnings("unchecked")
    public List<CountryDTO> getCountries() {
        List<CountryDTO> countryDTOS = new ArrayList<>();

        for (Object country : countryClient.getAllCountries()) {
            Map<String, Object> countryMap = (Map<String, Object>) country;

            String code  = (String) countryMap.get("cca3");

            Map<String, Object> nameMap = (Map<String, Object>) countryMap.get("name");
            String name = (String) nameMap.get("common");

            List<String> capitals = (List<String>) countryMap.get("capital");
            String capital = (capitals != null && !capitals.isEmpty()) ? capitals.get(0) : "N/A";

            long population = ((Number) countryMap.get("population")).longValue();

            Map<String, Object> flags = (Map<String, Object>) countryMap.get("flags");
            FlagDTO flagDTO = GenericBuilder.of(FlagDTO::new)
                    .with(FlagDTO::setAlt, (String) flags.get("alt"))
                    .with(FlagDTO::setSvg, (String) flags.get("svg"))
                    .build();

            CountryDTO countryDTO = GenericBuilder.of(CountryDTO::new)
                    .with(CountryDTO::setCapital, capital)
                    .with(CountryDTO::setCode, code)
                    .with(CountryDTO::setFlag, flagDTO)
                    .with(CountryDTO::setName, name)
                    .with(CountryDTO::setPopulation, population)
                    .build();

            countryDTOS.add(countryDTO);
        }

        return countryDTOS;
    }
}
