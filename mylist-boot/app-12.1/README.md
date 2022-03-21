# 12.1 jQuery 라이브러리 활용하기: jQuery 미니 라이브러리 만들기 및 jQuery 사용하기

- 미니 jQuery 라이브러리 만들기
- 미니 jQuery 라이브러리 적용하기
- 진짜 jQuery 라이브러리 적용하기

## 백엔드 개발 실습



## 프론트엔드 개발 실습

### 1단계 - 미니 jQuery 라이브러리를 만든다.

- /src/main/resources/static/myQuery.js 생성
  - jQuery를 모방하여 일부 함수를 만든다.
- /src/main/resources/static/todo/index.html 변경
  - myQuery 라이브러리를 HTML 에 적용한다.

### 2단계 - 미니 jQuery 라이브러리를 압축한다.

- /src/main/resource/static/myQuery.min.js 생성
  - javascript 또는 CSS 파일을 압축하는 사이트의 도움을 받는다.
- /src/main/resources/static/todo/index.html 변경
  - myQuery 라이브러리를 HTML 에 적용한다.

### 3단계 - 진짜 jQuery 라이브러리를 적용한다.

- /src/main/resources/static/todo/index.html 변경
  - myQuery 라이브러리 대신 CDN 방식으로 진짜 jQuery 라이브러리를 적용한다.

### 4단계 - NPM을 이용하여 라이브러리를 자동으로 다운받는다.

- /src/main/resources/static/ 폴더에 jQuery 라이브러리를 다운로드 한다.
  - `npm init` 실행하여 package.json 설정 파일을 준비한다.
  - `npm install jquery` 실행하여 jQuery 라이브러리를 설치한다.
  - `npm install sweetalert2` 실행하여 SweetAlert2 라이브러리를 설치한다.
- /src/main/resources/static/todo/index.html 변경
  - CDN 라이브러리 대신 npm으로 다운로드 받은 라이브러리를 사용한다.






#
