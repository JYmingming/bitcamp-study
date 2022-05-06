# 07.2 파일 API 활용: 상속 문법을 이용해 읽고 쓰기 기능 확장

- 상속을 이용하여 한 줄 단위로 읽고 쓰는 기능을 추가한다.

## 백엔드 개발 실습

### 1단계 - FileReader 클래스의 기능을 확장한다.

- com.eomcs.io.FileReader2 클래스 생성
  - FileReader를 상속 받아 FileReader2 클래스를 정의한다.
  - readLine() 메서드 추가: 한 줄 단위로 읽는 기능을 추가한다.

### 2단계 - FileReader 대신 FileReader2 클래스를 사용하여 데이터를 읽는다.

- com.eomcs.mylist.controller.XxxController 클래스의 생성자 변경
  - FileReader 클래스를 FileReader2 클래스로 대체한다.
  - 생성자 변경

### 3단계 - FileWriter 기능을 확장한다.

- com.eomcs.io.FileWriter2 클래스 생성
  - FileWriter를 상속 받아 FileWriter2 클래스를 정의한다.
  - println() 메서드 추가: 한 줄 단위로 출력하는 기능을 추가한다.


### 4단계 - FileWriter 대신 FileWriter2 클래스를 이용하여 데이터를 출력한다.

- com.eomcs.mylist.controller.XxxController 클래스 변경
  - save() 메서드 변경


## 프론트엔드 개발 실습








#
