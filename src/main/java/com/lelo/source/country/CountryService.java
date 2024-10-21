package com.lelo.source.country;

import io.micrometer.core.instrument.*;
import java.util.*;
import org.springframework.stereotype.*;

@Service
public class CountryService {

  private final CountryRepository countryRepository;
  private final MeterRegistry meterRegistry;

  public CountryService(CountryRepository countryRepository, MeterRegistry meterRegistry) {
    this.countryRepository = countryRepository;
    this.meterRegistry = meterRegistry;
  }

  public List<Country> getAllCountries() throws java.io.IOException {
    meterRegistry.counter("service.getAllCountries").increment();
    return countryRepository.getAll();
  }

  public Country getCountryByCode(String countryCode) throws java.io.IOException {
    return countryRepository.getCountryByCode(countryCode);
  }
}
