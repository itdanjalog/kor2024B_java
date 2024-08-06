package day09.step1;

// 클래스1 의 선언
// 용도 : 객체의 설계도 클래스
public class MyClass { // class start
    // 필드 : 객체가 가질수 있는 고유특성를 저장하는 메모리 공간 역할
    int field1;
    String field2;

} // class end

// 클래스2 의 선언
// 용도 : 객체의 설계도 클래스
class YourClass{ // class start
    // 필드
    int field1;
    String field2;
    // 생성자 : 객체 생성할때 필드 초기화
    // 객체 생성시 사용되는 객체필드 초기화 담당
    // 주의할점 : 클래스명 과 이름 동일하다
        // 1. 기본 생성자
    YourClass( ){  }
        // 2.
    YourClass( int field1 ){
        this.field1 = field1;
    }

} // class end





