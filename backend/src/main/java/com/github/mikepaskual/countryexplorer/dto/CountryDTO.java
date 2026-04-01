package com.github.mikepaskual.countryexplorer.dto;

public class CountryDTO {

    private String code;
    private String name;
    private String capital;
    private long population;
    private FlagDTO flag;

    public CountryDTO() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public FlagDTO getFlag() {
        return flag;
    }

    public void setFlag(FlagDTO flag) {
        this.flag = flag;
    }
}
