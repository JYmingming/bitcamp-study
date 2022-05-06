# 02 메서드 사용법

- 특정 기능을 수행하는 코드에 대해 메서드로 정의해두면 재사용이 쉽고 코드 유지보수가 쉽다.
- 코드를 메서드로 분리하는 경우
  - 유사한 코드가 여러 곳에서 중복 사용될 때
  - 코드의 기능을 명확하게 설명하고 싶을 때


## 백엔드 개발 실습

### 1단계 - 한 사람의 연락처 정보를 문자열로 만드는 코드를 메서드로 분리한다.

- ContactController.createCSV() 정의
  - add() 변경
  - update() 변경
  - 백업: ContactController.java.01

### 2단계 - 이메일로 연락처를 찾아 배열 인덱스를 알아내는 코드를 분리한다.

- ContactController.indexOf() 정의
  - get() 변경
  - update() 변경
  - 백업: ContactController.java.02

### 3단계 - 배열 항목 삭제 코드를 분리한다.

코드 기능을 명확하게 설명하고 싶을 때도 메서드를 활용하여 코드를 분리한다.

- ContactController.remove() 정의
  - delete() 변경
  - 백업: ContactController.java.03

### 4단계 - 배열 크기를 자동으로 늘린다.

- ContactController.add() 변경
  - 배열이 꽉차면 새 배열을 만들어 확장한다.
  - 백업: ContactController.java.04

### 5단계 - 배열 크기를 늘리는 코드를 별도의 메서드로 분리한다.

코드 기능을 명확하게 설명하고 싶을 때도 메서드를 활용하여 코드를 분리한다.

- ContactController.grow() 생성
  - add() 변경
  - 백업: ContactController.java.05

### 6단계 - 배열 크기를 계산하는 코드를 별도의 메서드로 분리한다.

코드 기능을 명확하게 설명하고 싶을 때도 메서드를 활용하여 코드를 분리한다.

- ContactController.newLength() 생성
  - grow() 변경
  - 백업: ContactController.java.06

### 7단계 - 배열을 복사하는 코드를 메서드로 분리한다.

코드 기능을 명확하게 설명하고 싶을 때도 메서드를 활용하여 코드를 분리한다.

- ContactController.copy() 생성
  - grow() 변경
  - 백업: ContactController.java.07







#
