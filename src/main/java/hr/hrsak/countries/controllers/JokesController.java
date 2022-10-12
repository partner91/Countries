package hr.hrsak.countries.controllers;

import hr.hrsak.countries.services.JokeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/v1")
public class JokesController {

    @Resource
    private JokeService jokeService;

    @GetMapping("/joke")
    public ResponseEntity<String> getJoke() {
        return ResponseEntity.ok(jokeService.getJoke());
    }
}
