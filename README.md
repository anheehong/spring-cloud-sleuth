# spring cloud sleuth

sleuth 을 이용한 프로젝트 였으나, <br/>
spring boot 3.0 이후로 동작을 안해 micrometer-tracing 변경

------

### zipkin 띄우기

- **참고문서**
> [zipkin start](https://zipkin.io/pages/quickstart.html)

- **docker**
```bash
    docker run -d -p 9411:9411 openzipkin/zipkin
```

- **java**
```bash
  curl -sSL https://zipkin.io/quickstart.sh | bash -s
  java -jar zipkin.jar
```

------

**spring boot 3.0 이후는 sleuth 지원 안함**<br>
- [spring-cloud-sleuth](https://docs.spring.io/spring-cloud-sleuth/docs/current-SNAPSHOT/reference/html/)
- [micrometer-metrics](https://github.com/micrometer-metrics/tracing/wiki/Spring-Cloud-Sleuth-3.1-Migration-Guide)

**spring boot 3.0 이후는 sleuth -> micrometer-tracing**

------

[local zipkin 들어가기](http://127.0.0.1:9411/)

> GET "/api/movie" 
> log TraceId 로 Zipkin 에서 조회 확인