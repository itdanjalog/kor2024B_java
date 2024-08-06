package day09.step3;

public class Student { // class s
    // 클래스 구성멤버
    // 1. 멤버변수/필드
    String name; // 학생명 을 저장하기 위한 멤버변수 선언
    int kor; // 국어점수
    int math; // 수학점수
    int eng; // 영어점수
    // 2. 생성자
    // 2-1 기본 생성자
    Student( ){ }
    // 2-2 name 매개변수 1개 인 생성자
    Student( String name ){
        this.name = name ;
    }
    // 2-3 name , kor , math , eng 매개변수 4개인 생성자
    Student( String name , int kor , int math , int eng ){
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }
    // 3. 메소드 : 실행문 들을 모아둔 구역
    void info( ){
        // 각 필드값 을 출력하는 실행문이 4개
        // this : 현재 메소드를 호출한 객체의 필드
        System.out.println( this.name  );
        System.out.println( this.kor );
        System.out.println( this.math );
        System.out.println( this.eng );
    }
} // class e

