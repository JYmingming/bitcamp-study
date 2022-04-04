### 19.1 UI 레이아웃을 다루는 방법 : 헤더, 사이드바, 풋터 넣기

- 페이지에 헤더, 사이드바, 풋터 넣기

## 백엔드 개발 실습


## 프론트엔드 개발 실습

### 1단계 - 헤더를 분리한다.

- static/header.html 생성
- static/index.html 변경
  - header.html 을 삽입

### 2단계 - 풋터를 추가한다.

- static/footer.html 생성
- static/index.html 변경
  - footer.html 을 삽입

### 3단계 - 사이드바를 추가한다.

- static/.html 생성
- static/index.html 변경
  - sidebar.html 을 삽입

### 4단계 - 공통 스타일을 별도의 파일로 분리한다.

- static/css/common.css 생성
  - 헤더, 풋터, 사이드바를 제어하는 css 코드를 이 파일로 옮긴다.
- static/index.html 변경
  - common.css 적용

### 5단계 - 게시글 페이지에 헤더, 사이드바, 풋터를 적용한다.

- static/board/index.html 변경
- static/board/form.html 변경
- static/board/view.html 변경


#
