package com.lelo.source.time;

import java.time.*;
import java.time.format.*;
import java.util.*;

@org.springframework.stereotype.Service
public class TimeService {

  public String getFormattedTime() {
    DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss z", Locale.US)
        .withZone(ZoneId.systemDefault());
    LocalDateTime now = LocalDateTime.now();
    return simpleDateFormat.format(now);
  }

}
