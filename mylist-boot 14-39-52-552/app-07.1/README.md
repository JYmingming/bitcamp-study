# 07.1 파일 API 활용: 데이터를 텍스트 형식(CSV)으로 읽고 쓰기

- 데이터를 파일에 저장하고 읽는다.

## 백엔드 개발 실습

### 1단계 - 데이터 저장 요청을 받았을 때 파일로 데이터를 저장한다.

- com.eomcs.mylist.controller.XxxController 클래스 변경
  - save() 메서드 추가
- com.eomcs.mylist.domain.Xxx 클래스 변경
  - toCsvString() 추가

### 2단계 - 페이지 컨트롤러 객체가 생성될 때 파일에서 데이터를 로딩한다.

- com.eomcs.mylist.controller.XxxController 클래스 변경
  - 파일에서 데이터를 로딩하는 코드를 생성자에 추가한다.
- com.eomcs.mylist.domain.Xxx 클래스 변경
  - CSV 문자열을 분석하여 객체를 초기화시키는 생성자를 추가한다.
  - CSV 문자열로 객체를 생성하는 valueOf() 스태틱 메서드를 추가한다.

## 프론트엔드 개발 실습








#
