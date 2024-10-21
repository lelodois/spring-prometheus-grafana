package com.lelo.source.hello;

import com.lelo.source.time.TimeRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

  private final TimeRepository timeRepository;

  public HelloWorldService(TimeRepository timeRepository) {
    this.timeRepository = timeRepository;
  }

  public HelloResult getInfo() {
    String date = timeRepository.getFormattedTime();
    return new HelloResult("hello world!", date);
  }

}