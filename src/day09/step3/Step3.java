package day09.step3;

/* 실습2 : 생성자를 이용한 Student 객체 생성하시오.
[조건1] step3 패키지의 Student 라는 클래스를 선언합니다.
[조건2] Student  클래스의 필드는 아래와 같이
       - 학생명 과 국어점수 , 수학점수 , 국어점수 으로 선언 합니다.
       - String name; int kor; int math , int eng
[조건3] 생성자 3개 선언/정의 합니다.
	1. 기본 생성자
	2. name 매개변수 생성자
	3. String name; int kor; int math , int eng 매개변수 생성자
[조건4]  step3 패키지의Step3 클래스 생성하여
    - Student 객체를 서로 다른 생성자 이용하여 학생 객체 3개를 생성하시오.
*/
public class Step3 {
    public static void main(String[] args) {

        // Student 클래스의 객체 1 개 생성 ,
            // (1) 기본생성자
        Student s1 = new Student();
            // 메소드 호출 : 객체변수명.메소드명();
        s1.info(); // null , 0 , 0 , 0

        // Student 클래스의 객체 1개 생성 ,
            // (2) name 매개변수를 갖는 생성자
            // 생성자( 값 ) 소괄호 안에 name 매개변수로 전달할 값 넣어주기.
        Student s2 = new Student("유재석");
            // 메소드 호출 : 객체변수명.메소드명();
        s2.info();  // 유재석 , 0 , 0 , 0

        // Student 클래스의 객체 1개 생성 ,
            // (3) name , kor , math , eng 매개변수를 4개를 갖는 생성자
            // 생성자( 값1 , 값2 , 값3 , 값4 ) 소괄호 안에 각 매개변수로 전달할 값 넣어주기
        Student s3 = new Student( "강호동" , 80 , 90 , 100 );
            // 메소드 호출 : 객체변수명.메소드명();
        s3.info(); // 강호동 ,80 , 90 , 100

    } // main e
} // class e














