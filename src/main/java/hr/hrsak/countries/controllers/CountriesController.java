package hr.hrsak.countries.controllers;

import hr.hrsak.countries.services.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/v1")
public class CountriesController {

    @Resource
    private CountryService countryService;
    //Test
    @GetMapping("/countries")
    public ResponseEntity<String[]> getAllCountries() {
        return ResponseEntity.ok(countryService.getAllCountries());
    }
}
