package com.lelo.source.hello;


public class HelloResult {

  private final String message;
  private final String time;

  public HelloResult(String message, String time) {
    this.message = message;
    this.time = time;
  }

  public String getMessage() {
    return message;
  }

  public String getTime() {
    return time;
  }
}
