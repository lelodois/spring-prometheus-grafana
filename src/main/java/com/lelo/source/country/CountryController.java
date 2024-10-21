package com.lelo.source.country;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController()
public class CountryController {

  private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
  public List<Country> getAllCountries() throws java.io.IOException {
    return countryService.getAllCountries();
  }

  @GetMapping("/country/{countryCode}")
  public Country getCountryByCode(@PathVariable String countryCode) throws java.io.IOException {
    return countryService.getCountryByCode(countryCode);
  }

}
