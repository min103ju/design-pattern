# SingleTon Pattern

- 어떤 클래스의 객체가 해당 프로세스 내에게 딱 한개만 만들어져 있어야 하는 경우에 해당한다.

* 해당 인스턴스를 정적 메모리(**static**)에 올려 사용
* 해당 클래스 안에 static singleTon(본인) 필드를 추가
* getInstance 메소드 : static 필드의 null 여부 검사, null일 경우 new로 새로운 인스턴스를 할당하는 메소드
> Examplge : App에서 Dark 모드로 사용하고자 했을경우 다른 페이지로 이동하더라도 Dark 모드는 꾸준히 유지되어 있어야한다.


