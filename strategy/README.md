#Strategy Pattern

- 특정 동일 기능의 모드(strategy)만을 바꿔 사용하는 패턴
- 모드 별로 동일한 기능(abstract method)를 사용하는 경우

* 특정 interface를 생성 후 abstract method를 생성
* 각 모드 별로 class를 생성 후 interface를 implements 한다.
* 기능 class안에 interface를 필드로 하고, setter method를 
* 기능 사용 시 모드별로 set을 하고 사용한다.

> 해당 패턴 사용시 소스 코드의 분석에 용이하다
> 모드 추가할 경우에도 용이하다.
> Examplge : 검색 시 "전체", "이미지", "뉴스", "지도" 검색 시 
