package com.lelo.source.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

  private final com.lelo.source.time.TimeService timeService;

  public HelloWorldService(com.lelo.source.time.TimeService timeService) {
    this.timeService = timeService;
  }

  public HelloResult getInfo() {
    String date = timeService.getFormattedTime();
    return new HelloResult("hello world!", date);
  }

}