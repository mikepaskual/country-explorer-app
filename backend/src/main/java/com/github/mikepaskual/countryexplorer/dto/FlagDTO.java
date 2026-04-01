package com.github.mikepaskual.countryexplorer.dto;

public class FlagDTO {

    private String svg;
    private String alt;

    public FlagDTO() {
        super();
    }

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

}
