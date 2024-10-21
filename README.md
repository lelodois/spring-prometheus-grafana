## Spring Boot Prometheus Grafana

Running App Monitoring suite with Prometheus and Grafana

### Starting

```shell
  docker-compose up --build
```

### Stopping
```shell
  docker-compose down
```

### Links

| App  | URL  |
|---|---|
| App | [http://localhost:8080/](http://localhost:8080/) |
| Prometheus | [http://localhost:9090/graph](http://localhost:9090/graph) |
| Grafana  | [http://localhost:3000](http://localhost:3000)  |
| Spring Boot Actuator | [http://localhost:8080/actuator/metrics](http://localhost:8080/actuator/metrics)

---

### Enable Spring Actuator Metrics

```
management.endpoints.web.exposure.include=*
```

[Actuator - Metrics](http://localhost:8080/actuator/metrics)

-----

