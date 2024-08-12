package day10.step3;

public class Step3 {
    public static void main(String[] args) {
        // (1) Member 객체 생성
        Member m1 = new Member( "유재석" , 'M' , 50 , 177);
            m1.infoPrint(); // 유재석M대한민국50177.0
            m1.getHeight();
            int krw1 = m1.getMoney( (byte) 50 ); // 강제 타입 변환
        System.out.println("krw1 = " + krw1);
            m1.setAge( 11 );
        System.out.println( m1.age ); // ????? 50? 51?          50

        // (2) Member 객체 생성
        Member m2 = new Member( "강호동" , 'W' , 42 , 180 );
            m2.infoPrint(); // 강호동W대한민국42180.0
            double result1 = m2.getHeight();
            byte yen = 40; // 자동변환 변환
            int krw2 = m2.getMoney( yen );
        System.out.println("krw2 = " + krw2);
            m2.setAge( 15 );
        System.out.println( m2.age ); /// ? 42?  43??           43

        // (3) Member 객체 생성
        Member m3 = new Member( "신동엽" , 'M' , 61 , 192 );
            m3.infoPrint(); // 신동엽M대한민국61192.0
            System.out.println( m3.getHeight() );
            byte yen2 = 45;
            int krw3 = m3.getMoney( yen2 );
        System.out.println("krw3 = " + krw3);
            m3.setAge( 12 );
        System.out.println( m3.age ); /// ? 61 ?? 62 ??         61

        /*
            핵심 포인트 :
                [1] 왜 같은 함수를 호출했는데 서로 다른 출력문이 나올까?
                    m1.infoPrint(); , m2.infoPrint(); , m3.infoPrint();
                [2] 반환된 값을 처리하는 방법
                    1. m1.getHeight();
                    2. double result1 = m2.getHeight();
                    3. System.out.println( m3.getHeight() );
                [3] 같은 함수 이지만 , 함수 호출시 전달하는 매개변수 값 에 따른 서로 다른 결과를 얻을수 있다.
         */




    } // main end
} // class end
