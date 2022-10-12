package hr.hrsak.countries.services.impl;


import hr.hrsak.countries.dto.Joke;
import hr.hrsak.countries.services.JokeService;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Random;


@Service
public class DefaultCountryImpl implements JokeService {

    private String url = "https://worstjokesever.com/?sort=score&skip=";
    private Random rnd = new Random();


    @Override
    public Joke getJoke() {
        try{
            Document doc = Jsoup.connect(getRandomUrl(url)).get();
            Elements joke = doc.getElementsByClass("joke__content");
            int randomJoke = rnd.nextInt(joke.size());
            return new Joke(StringUtils.capitalize(joke.get(randomJoke).html().replace("<p>", "").replace("</p>", "")));
        } catch (IOException e){
            System.out.println(e.getMessage());
            return new Joke("No joke for you!");
        }
    }

    private String getRandomUrl(String url){
        int skip = (rnd.nextInt(1860) * 20);
        url = url + skip;
        return url;

    }

}
