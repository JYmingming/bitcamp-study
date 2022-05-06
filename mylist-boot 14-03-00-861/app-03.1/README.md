# 03.1 클래스 사용법 : 사용자 정의 데이터 타입 만들기

- 회원정보, 영화정보, 주문정보와 같은 복합 데이터는 낱개의 변수를 사용하여 다루는 것 보다
  별도의 타입을 정의하여 *한 단위로 묶어서* 다루는 것이 편하다.
  - 복합데이터: 여러 개의 항목으로 구성된 데이터
  - 예) 회원정보(번호,이름,이메일,전화,주소 등), 영화정보(영화명,설명, 제작사, 주연배우, 개봉일 등)
- 자바에서 제공하지 않는 데이터 타입을 정의할 때 사용하는 문법이 **클래스** 이다.



## 백엔드 개발 실습

### 1단계 - 연락처 정보를 한 단위로 묶어서 다룰 새 데이터 타입을 정의한다.

- com.eomcs.mylist.Contact 클래스 정의


### 2단계 - 연락처 목록은 Contact 클래스의 배열로 변경한다.

- com.eomcs.mylist.ContactController 클래스 변경
  - 배열 변수 변경

### 3단계 - REST API에 Contact 클래스를 적용한다.

- com.eomcs.mylist.ContactController 클래스 변경
  - list() 변경 => 웹브라우저로 응답 결과 확인
  - add() 변경
    - grow(), newLength(), copy() 변경
    - createCSV() 삭제
  - get() 변경
    - indexOf() 변경
  - update() 변경
  - delete() 변경


## 프론트엔드 개발 실습

### 1단계 - 서버에서 받은 JSON 형식의 문자열을 자바스크립트 객체로 전환하여 다룬다.

- /contact/index.html 변경
- /contact/view.html 변경






#
