package com.lelo.source.country;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

  private final String name;
  private final String code;

  public Country(String name, String code) {
    this.name = name;
    this.code = code;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }
}
