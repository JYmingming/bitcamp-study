# 06.1 패키지 사용법: 클래스 분류하기 + public 접근 제어

- 클래스를 관리하기 쉽도록 역할 별로 패키지에 분류한다.

## 백엔드 개발 실습

### 1단계 - 도메인 역할을 수행하는 클래스를 별도의 패키지로 분류한다.

데이터 타입 역할을 수행하는 클래스를 **도메인** 클래스라 부른다.

- com.eomcs.mylist.domain 패키지 생성
- Contact, Todo, Board 클래스를 domain 패키지로 이동
  - 필드의 기본 접근 범위는 패키지다.
  - 즉 같은 패키지에 소속된 클래스만이 접근 가능하다.
  - 다른 패키지에서 접근하고 싶다면 직접 변수를 사용하지 말고 setter/getter를 이용하라.
- com.eomcs.mylist.XxxController 클래스 변경
  - 도메인 클래스의 필드를 사용할 때 setter/getter를 사용한다.

### 2단계 - 여러 프로젝트에서 일반적인 용도로 사용하는 클래스는 util 패키지로 분류한다.

- com.eomcs.util 패키지 생성
  - 특정 프로젝트에서만 사용되는 클래스가 아니라면 보통 그룹 패키지 밑에 둔다.
- ArrayList 클래스 변경
  - util 패키지로 이동한다.
  - 다른 패키지에서 메서드를 사용할 수 있도록 public 으로 공개한다.
  - 외부에서 직접 필드를 접근하지 못하도록 만든다.
  - 대신 그 값을 꺼내거나 설정할 수 있도록 setter/getter 를 추가한다.
    - size() 추가
    - get(int) 추가
  - com.eomcs.mylist.XxxController 클래스 변경
    - ArrayList 클래스 변경에 맞춰 size 대신 size()를 사용한다.
    - list 배열을 직접 접근하는 대신 get()을 사용한다.

### 3단계 - 페이지 컨트롤러 역할을 수행하는 클래스를 controller 패키지로 분류한다.

- com.eomcs.mylist.controller 패키지 생성
- XxxController 클래스를 controller 패키지로 이동한다.







#
