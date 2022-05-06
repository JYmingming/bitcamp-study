# 07.3 파일 API 활용: 포함 관계를 이용해 읽고 쓰기 기능 확장

- 포함 관계를 이용하여 한 줄 단위로 읽고 쓰는 기능을 추가한다.

## 백엔드 개발 실습

### 1단계 - FileReader 클래스의 기능을 확장한다.

- com.eomcs.io.FileReader2 클래스 변경
  - FileReader를 포함한다.
  - readLine() 메서드 추가:
    - 한 줄 단위로 읽는 기능을 추가한다.
    - 실제 데이터를 읽는 작업은 FileReader에게 위임한다.

### 2단계 - FileWriter 기능을 확장한다.

- com.eomcs.io.FileWriter2 클래스 변경
  - FileWriter를 포함한다.
  - println() 메서드 추가:
    - 한 줄 단위로 출력하는 기능을 추가한다.
    - 실제 출력하는 작업은 FileWriter에게 위임한다.



## 프론트엔드 개발 실습








#
