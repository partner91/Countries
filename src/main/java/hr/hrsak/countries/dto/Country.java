package hr.hrsak.countries.dto;

import lombok.Data;

@Data
public class Country {
    private String name;

    public Country(String name){
        this.name = name;
    }
}
