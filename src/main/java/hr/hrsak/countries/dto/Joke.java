package hr.hrsak.countries.dto;

import lombok.Data;

@Data
public class Joke {
    private String joke;

    public Joke(String joke){
        this.joke = joke;
    }
}
