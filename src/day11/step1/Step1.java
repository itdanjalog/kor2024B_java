package day11.step1;

//  실행 클래스
public class Step1 {
    public static void main(String[] args) {

        // - 객체를 생성할때는 *생성자를 선택* 하여 객체를 생성한다.
        // [1] Person 객체 생성
        Person p1 = new Person(); // 2-1 생성자를 이용한 객체 생성
        // [2] Person 객체 생성
        Person p2 = new Person("유재석"); // 2-2 생성자를 이용한 객체 생성
        // [3] Person 객체 생성
        Person p3 = new Person("강호동" , "010-3333-3333"); // 2-3 생성자
        // [4] Person 객체 생성
        Person p4 = new Person("신동엽" , "010-4444-4444" , 40 ); // 2-4 생성자
        // [5] 문제점 : 이름을 넣어야 하는 매개변수 값 자리의 전호번호 값 를 넣었다.
        // Person P5 = new Person("010-5555-5555" , "서장훈" , 50 );

        // - 각 객체를 이용한 메소드 호출
        p1.call();  // p1{ }           null에게 전화를 합니다.
        p2.call();  // p2{ "유재석" }  유재석에게 전화를 합니다.
        p3.call();  // p3{ "강호동" }  강호동에게 전화를 합니다.
        p4.call();  // p4{ "신동엽" }  신동엽에게 전화를 합니다.

    } // main end
} // class end
