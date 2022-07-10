package com.example.eurovision.controllers;

import com.example.eurovision.entities.Country;
import com.example.eurovision.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/countries")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping
    public List<Country> getCountries(){
        return countryRepository.findAll();
    }

    @PostMapping
    public void saveCountries(@RequestBody List<Country> countries){
        countryRepository.saveAll(countries);
    }

}
