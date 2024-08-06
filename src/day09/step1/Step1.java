package day09.step1;

// 용도 : main함수를 가진 클래스 
public class Step1 { // class end
    public static void main(String[] args) {

        // [1] MyClass 객체 생성
        // 1. 첫번째 객체  
        MyClass m1 = new MyClass();
        // soutv + 엔터 
        System.out.println("m1 = " + m1);
        // m1  : 객체의 (위치한)주소
        // m1. : 해당 객체의 (위치의) 주소로 이동
        // m1.field1 : 해당 객체의 필드를 호출/접근
        m1.field1 = 30;         // 특정 필드값 저장/수정
        m1.field2 = "유재석";    // 특정 필드값 저장/수정
        System.out.println( m1.field1 ); // 특정 필드값 호출
        System.out.println( m1.field2 ); // 특정 필드값 호출
            // m1 = { field = 30 , field2 = "유재석" }
        // 2. 두번째 객체 
        MyClass m2 = new MyClass();
        System.out.println("m2 = " + m2);
        System.out.println( m2.field1 );    // 0 , field1 필드의 값을 넣지 않았기 때문에
        System.out.println( m2.field2 );    // null, field1 필드의 값을 넣지 않았기 때문에
            // m2 = { field = 0 , field2 = null }
        m2.field1 = 40; m2.field2 ="강호동";
        System.out.println( m2.field1 );    // 40
        System.out.println( m2.field2 );    // "강호동"
            // m2 = { field = 40 , field2 = "강호동" }





        // [2] YourClass 객체 생성 
        // 1. 첫번째 객체 , 기본생성자 사용
        YourClass y1 = new YourClass();
        System.out.println("y1 = " + y1);

        System.out.println( y1.field1 ); // 0

        // 2. 두번째 객체  , 필드1개인 생성자 사용
        YourClass y2 = new YourClass( 50 );
        System.out.println("y2 = " + y2);

        System.out.println( y2.field1 ); // 50

























    } // main end
} // class end
