/*
    변수 : 변하는 수  <--------> 상수 : 고정된 수
    프로그래밍에서 변수
        - *하나의 자료*를 저장할수 있는 메모리 공간 , 저장소 , 상자
        - 왜? 보관하기 위해. 재사용하기위해. 가독성높이기위해 . 계산할때 사용하기 위해
    타입/자료형
        - 자료 를 분류
        - 왜? 처리의 효율성 좋다. 분류의 안정성
        - 타입의 종류 : 기본타입 , 참조타입
    기본타입
        - 리터럴 값을 저장하는 타입
        - 기본타입 종류 , 8가지
        타입명             용량         허용범위
        boolean         1바이트        true 또는 false
        char            2바이트        '' 작은따옴표의 문자 1개
        - String           X          " " 큰따옴표 , 문자 여러개 , 기본타입이 아닌 클래스
        byte            1바이트        -128 ~ 127 , 대략 +-100 정도
        short           2바이트        -32,768 ~ 32,737 , 대략 +-3만 정도
        int             4바이트        대략 +-21억 정도 , 정수 리터럴의 기본타입
        long            8바이트        대략 +-21억 이상
        float           4바이트        소수점 8자리 표현
        double          8바이트        소수점 17자리 표현 , 실수 리터럴의 기본타입
*/
package day02;
public class Step2 { // class start
    // main + 엔터
    public static void main(String[] args) { // main start

        // [1] 자바의 변수란
        int box = 10;
            // - int는 정수를 담을 수 있는 변수(상자)의 타입 뜻
            // - box는 변수(상자) 의 이름
            // - = 오른쪽 자료를 왼쪽에 대입/저장 뜻
            // - 10 리터럴값
            // - ; 코드문장의 마침

        // [2] '저장' 이라는 개념을 가지는 변수
        int myInt = 4;
        double myReal = 2.5;
        char myChar = 'a';
        String myString = "hello";

        // [3] '타입'
        // ex) 분리수거
        // 비닐분리수거 상자 = 비닐;      [o]
        // 비닐분리수거 상자 = 음식물;    [x]
        // - 비닐분리수거 상자에 비닐 넣기 가 가능하지만 음식물 안된다.

        // [3-1] boolean : true 또는 false 를 저장하는 타입
        boolean bool1 = true;
            // soutv + 엔터 : 가장 가까운 변수의 값을 호출해서 출력
        System.out.println("bool1 = " + bool1);
        
        boolean bool2 = false;
        System.out.println("bool2 = " + bool2);
        // boolean bool3 = 10; // 오류발생이유 : 변수의 타입과 저장할 리터럴값의 타입이 일치하지 않아서.

        // [3-2] char : 문자 1개만 저장 가능 , ''작은따옴표 , 65536개 문자 *표현(유니코드)
        char c1 = 'A';  System.out.println("c1 = " + c1);
        char c2 = '가';  System.out.println("c2 = " + c2);
        char c3 = 97;    System.out.println("c3 = " + c3);
        // 유니코드란 ? 아스키코드 기반의 전세계 언어(한글포함)를 번역하는 규약/규칙 표
            // 97 ---> 'a'  ,   98 ---> 'b'  ,  99 ---> 'c'
        // char c4 = "ABC"; // 불가능
        int c5 = '가';    System.out.println("c5 = " + c5); // 44032

        // 문자열 : 문자 여러개를 저장 가능 , 문자열 , " " 큰따옴표 , 클래스(참조)타입
        String str1 = "ABC";       System.out.println("str1 = " + str1);
        String str2 = "가나다";    System.out.println("str2 = " + str2);

        // [4-1] byte : -128 ~ +127 , 정수타입
        byte b1 = -128; System.out.println("b1 = " + b1);
        byte b2 = 127;  System.out.println("b2 = " + b2);
        // byte b3 = 200;  // 오류 발생 : byte 타입이 저장 할수 있는 허용 범위 벗어남

        // [4-2] short : 대략 -+3만정도 , 정수타입
        short s1 = 32000;   System.out.println("s1 = " + s1);
        short s2 = -32000;  System.out.println("s2 = " + s2);
        // short s3 = 40000; // 오류 발생 : short 타입이 저장 할 수 있는 허용 범위 벗어남

        // [4-3] int : 대략 -+21억정도 , 정수타입 , *정수리터럴의 기본타입은 int
        int i1 = 2100000000;    System.out.println("i1 = " + i1);
        // int i2 = 3000000000;    // 오류 발생 : int 타입이 저장 할 수 있는 허용 범위 벗어남

        // [4-4] long : 대략 -+21억이상 , 정수타입 ,
        // * 리터럴의 기본정수타입은 int 이므로 long타입의 리터럴 값 입력시 리터럴값뒤에 L/l 붙이자.
        // long l1 = 3000000000;        // 오류 발생 : 21억 이상의 리터럴값을 입력시 뒤에 L이 없으면 오류 발생 
        long l2 = 3000000000L;
        System.out.println("l2 = " + l2);
        // - long타입의 이상의 리터럴 값 를 저장할때는 문자열타입 으로 한다.
        String str3 = "3000000000000000000000000000000000000000000";
        System.out.println("str3 = " + str3);

        // [5-1] double : 소수점 17자리 표현 , 실수타입 , *실수리터럴의 기본타입은 double , 부동소수점( 실수의 근사값 )
        double d1 = 0.123456789123456789;
        System.out.println("d1 = " + d1);
        
        // [5-2] float : 소수점 8자리 표현  , 실수타입  , 부동소수점( 실수의 근사값 )
        // float f1 = 0.123456789123456789; // 오류  발생 : 실수의 리터럴값을 입력시 뒤에 f가 없으면 오류 발생 
        float f2 = 0.123456789123456789F;
        System.out.println("f2 = " + f2);

        // [4] 변수명 : 데이터/자료를 저장하는 있는 변수/상자의 상징적인 이름
            // 규칙 : 1.숫자로시작 안됨 2.특수문자는 $ , _ 만 사용 , 띄어쓰기 3.키워드(문법상 의미가 있는 단어) 안됨 ,
            // 4. 영문의 카멜표기법 권장( 첫글자는 소문자 시작하고 다음 단어의 첫글자는 대문자 )
        // int 1int = 10;
        // int bo_x = 10;
        // int int = 10;
        int intbox = 10;
        int intBox = 10; // 카멜표기법

        // [5] = 대입 : 오른쪽 값을 왼쪽 변수에 저장/대입
        int sportCar = 10; // 10 정수리터럴 값을 sportCar 변수에 저장/대입

        // [6] 값 : 변수 타입과 일치한 리터럴 값
            // 10 , 3.14 , 'a' , "abc" , true

    } // main end
} // class end













