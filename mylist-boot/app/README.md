### 21.1 Log4j 적용하기

- Log4j 기능을 활성하시키기

## 백엔드 개발 실습

### 1단계 - 스프링부트의 기본 로그 라이브러리를 제거한다.

- build.gradle 변경

```
configurations {
    all {
        exclude group: 'org.springframework.boot', module: 'spring-boot-starter-logging'
    }
}
```

### 2단계 - log4j2 스프링부트 라이브러리를 추가한다.

- build.gradle 변경

```
dependencies {
  implementation 'org.springframework.boot:spring-boot-starter-log4j2'
  ...
}
```

### 3단계 - log4j2 설정 파일을 생성한다.

- /src/main/resources/log4j2.xml 파일 생성

### 4단계 - 스프링부트 설정 파일에 log4j2 설정 파일의 경로를 지정한다.

- /src/main/resources/application.properties 변경

### 5단계 - 로그 객체를 사용하여 로그를 출력한다.

- 로그를 출력할 클래스에 적용


## 프론트엔드 개발 실습


#
