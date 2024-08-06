package day09.step2;

// 용도2 : main 함수를 클래스
public class Step2 { // class s
    public static void main(String[] args) {
        // [1] User 클래스의 객체 생성
        User u1 = new User();
        // 클래스명 변수명 = new 생성자명();
        System.out.println( u1.name ); // null
        u1.name = "강호동";            // u1 객체 name의 해당 필드를 호출해서 수정 대입
        System.out.println( u1.name ); // 강호동
        // [2] User 클래스의 객체 생성
        User u2 = new User( "유재석" );        // u2 객체 name 의 값을 매개변수로 전달
        System.out.println( u2.name ); // 유재석
        // [3] User 클래스의 객체 생성
        User u3  = new User( "신동엽" , 50 );  // u3 객체 name,age 의 값을 순서대로 매개변수로 전달
        System.out.println( u3.name ); // 신동엽
        System.out.println( u3.age ); // 50
        // [4] User 클래스의 객체 생성
        User u4 = new User( "서장훈" , 50 , 'M' ); // u4 객체 name,age,gender 의 값을 순서대로 매개변수로 전달
        System.out.println( u4.name );      // 서장훈
        System.out.println( u4.age );       // 50
        System.out.println( u4.gender );    // M
        /* 실습1 : 생성자를 이용한 Product 객체 생성하시오.
            [조건1] Step2 패키지의 Product 라는 클래스를 선언합니다.
            [조건2] Product 클래스의 필드는 아래와 같이 제품명 과 가격으로 선언 합니다.
                String name; int price;
            [조건3] 임의의 생성자 3개 이상 선언/정의 합니다.
            [조건4] Step2 클래스의 예제코드 아래 에서 객체를 서로 다른 생성자로 3개 생성 하시오.
        */

        // Product 객체1 생성  , (1) 기본생성자
        Product p1 = new Product();
        System.out.println( p1.name );  //  null
        System.out.println( p1.price ); //  0
        p1.name = "환타"; // 생성자가 아닌 직접 필드를 호출해서 값 대입
        System.out.println( p1.name );  // 환타

        // Product 객체2 생성  , (2) 매개변수 1개인 생성자
        Product p2 = new Product( "콜라" );
        System.out.println( p2.name );  // 콜라
        System.out.println( p2.price ); // 0

        // Product 객체3 생성  , (3) 매개변수 2개인 생성자
        Product p3 = new Product( "사이다" , 1000 );
        System.out.println( p3.name );  // 사이다
        System.out.println( p3.price ); // 1000

        // - 오류: 생성자 선언시 작성한 매개변수와 순서와 타입 일치
        //Product p4 = new Product( 1000 , "사이다");

        // - 오류: 존재 하지 않는 매개변수는 사용할수 없다.
        //Product p5 = new Product(  "사이다" , 1000 , "CU" );


    } // main e
} // class e










