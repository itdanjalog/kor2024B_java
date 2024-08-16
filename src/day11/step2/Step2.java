package day11.step2;

// 실행 클래스
public class Step2 {
    public static void main(String[] args) {
        // [1] Car 객체 생성
        Car c1 = new Car(); // 기본 생성자를 이용한 객체 생성
        // 1-1 : public 멤버변수 는 외부 클래스에서 접근 가능
        c1.model = "K5";    // c1[객체] 속성[model]의 값을 k5 대입
        // 1-2 : private 멤버변수 는 외부 클래스에서 접근 불가능
        // c1.speed = 10;   // 직접 접근 x
        c1.setSpeed( 10 );  // 간접 접근 o
        // 1-3 :
        System.out.println( c1.model );
        // 1-4
        // System.out.println( c1.speed ); // 직접 접근 x
        System.out.println( c1.getSpeed() ); // 간접 접근 o

    }
}
