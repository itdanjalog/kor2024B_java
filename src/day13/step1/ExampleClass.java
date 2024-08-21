package day13.step1;

// 1. 객체 설계도 클래스
public class ExampleClass {
    // 1. 필드 , 주의할점
    int var1;
    // 2. 생성자 , 주의할점 : 1. 클래스명 과 생성자명은 동일하다. 2.오버로딩 지원( 매개변수의 개수,순서,타입 이 다르면 동일한 이름으로 여러개 정의/선언 )
    ExampleClass( ){ } // 기본생성자
    ExampleClass( int var1 ){ this.var1 = var1; } // 매개변수1개인 생성자 // 오버로딩
    // 3. 메소드 , 주의할점 : 1. 함수를 정의 와 사용은 다르다.(지금 정의/선언/만들기 ) 2.매개변수 타입 와 리턴타입 적절하게 선정하기.
    int method1( int a ){
        return a * 2;
    }
}
