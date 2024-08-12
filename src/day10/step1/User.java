package day10.step1;

// 클래스의 사용처:[1] 객체의 설계도 클래스
public class User {
    // 클래스의 구성멤버
    // 1. 멤버변수 : 객체내 저장할 고유한 특성/속성을 저장하는 곳
    String name; // 유저의 이름(name) 를 저장하는 속성명 정의 ,
        // 속성의 값은 아직 없는 상태
        // -> 객체가 생성될때 속성의 값도 (처음값)초기화가 된다.
    int age; // 유저의 나이(age) 를 저장하는 속성명 정의 ,

    // 2. 생성자 : 객체 생성시 멤버변수의 초기화 하는 곳
        // 조건1 : 클래스명과 동일해야한다. 조건2 : 매개변수의 타입과 개수가 일치해야한다.
        // 관례적으로 매개변수의 변수명은 멤버변수와 동일하게 한다.

        // 1. 기본/디폴트 생성자 : 매개변수가 없는 생성자 ,
    User( ){ }
        // 2. 생성자 정의 : 매개변수가 1개 인 생성자 ,
    User( String name ){
        this.name = name;
    }
        // 3. 생성자 정의 : 매개변수가 2개 인 생성자
    User( String name , int age ){
        this.name = name; this.age = age;
    }

    // 3. 메소드 : 객체의 이벤트/행위 하는 곳
    void 생일이벤트( ){
        System.out.println( this.name + "님 생일축하합니다.");
        this.age += 1;// vs // this.age = this.age + 1 ;
        System.out.println( this.age + "살[만] 되었습니다.");
    } // method end
} // class end
