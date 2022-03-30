### 17.1 Lombok 적용

- Lombok 라이브러리를 이용하여 도메인 객체를 간결하게 다루기

## 백엔드 개발 실습

### 1단계 - lombok 라이브러리를 프로젝트에 추가한다.

- 빌드 스크립트 파일(build.gradle)에 lombok 라이브러리 추가
  - build.gradle 변경
    - dependencies {} 블록에 `id "io.freefair.lombok" version "6.4.1"` 플러그인 추가
  - `java -jar lombok.jar` 파일 실행하여 이클립스 IDE에 lombok 기능 추가


### 2단계 - 도메인 클래스에 lombok 을 적용한다.

- com.eomcs.mylist.domain.* 클래스 변경
  - 게터/세터, toString(), 생성자 제거
  - @Data 애노테이션 추가

## 프론트엔드 개발 실습


#
