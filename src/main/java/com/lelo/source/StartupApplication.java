package com.lelo.source;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class StartupApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartupApplication.class, args);
    }
}

@org.springframework.context.annotation.Configuration
class Configurations {

    @org.springframework.context.annotation.Bean
    org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer<io.micrometer.core.instrument.MeterRegistry> metricsCommonTags() {

        return registry -> registry.config()
                .commonTags("application", "Demo-App")
                .commonTags("instance", "Demo-Instance");
    }

    @org.springframework.context.annotation.Bean
    public org.springframework.web.filter.CommonsRequestLoggingFilter logFilter() {
        org.springframework.web.filter.CommonsRequestLoggingFilter filter = new org.springframework.web.filter.CommonsRequestLoggingFilter();
        filter.setIncludeQueryString(true);
        filter.setIncludePayload(true);
        filter.setMaxPayloadLength(10000);
        filter.setIncludeHeaders(false);
        filter.setAfterMessagePrefix("REQUEST DATA : ");
        return filter;
    }
}