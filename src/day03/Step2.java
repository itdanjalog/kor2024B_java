package day03;

public class Step2 {
    public static void main(String[] args) {

        // 타입 변환이란 ? int 타입에서 다른 타입으로 변환되는 과정
            // 왜?? 데이터/자료의 변화에 따라 타입도 변환해야되는 상황이 있을수 있다.
            // 자바의 핵심특징 1.다형성: 자료가 다양한 형태/타입 를 가질수 있는 성질
            // boolean 1바이트( true=1 , false=0 -> 1비트 )
                // 비트/2진수       : 0 또는 1
                // 1바이트[비트8칸] : 01010101
                // 1비트를 저장하기 위해 1바이트 형식의 타입을 만들었다. ( 저장 메모리의 최소단위가 바이트부터 시작 )

        // [1] 자동/묵시적 타입 변환 : 표현의 크기가 작은 것 에서 큰 순으로 변환 , 메모리 손실 없다.
            // byte -> short,char -> int -> long -> float -> double
            // 1. 
        byte byteValue = 10;
        int intValue = byteValue;   // byte타입의 값을 int타입으로 대입 : 묵시적 형 변환 
        System.out.println("intValue = " + intValue);
            // 2. 
        char charValue = '가';
        intValue = charValue;       // char타입의 값을 int타입으로 대입 : 묵시적 형 변환
        System.out.println("intValue = " + intValue);
            // 3.
        intValue = 50;
        long longValue = intValue;  // int타입의 값을 long타입으로 대입 : 묵시적 형 변환
        System.out.println("longValue = " + longValue);
            // 4. 
        longValue = 100;
        float floatValue = longValue; // long타입의 값을 float타입으로 대입 : 묵시적 형 변환
        System.out.println("floatValue = " + floatValue);
            // 5.
        floatValue = 100.123F;
        double doubleValue = floatValue;    // float타입의 값을 double타입으로 대입 : 묵시적 형 변환
        System.out.println("doubleValue = " + doubleValue);

        // [2] 강제/명시적 타입 변환 : 표현의 크기가 큰 것 에서 작은 순으로 변환 , *메모리 손실 있을수 있다.
            // byte <- short,char <- int <- long <- float <- double
            // ( 변환할타입 ) : 캐스팅
            // 6.
        intValue = 10;
        // byteValue = intValue;   // 오류발생 : int타입은 byte타입으로 변환이 불가능하다.
        byteValue = (byte)intValue;// 해결방안 : int타입변수 앞에 (원하는타입) 캐스팅 연산자를 이용한 강제타입 변환
        System.out.println("byteValue = " + byteValue);
            // 7.
        longValue = 300;
        // intValue = longValue;       // 오류발생 : long타입은 int타입으로 변환이 불가능하다.
        intValue = (int)longValue;      // 해결방안 : long타입변수 앞에 (원하는타입) 캐스팅 연산자를 이용한 강제타입 변환
        System.out.println("intValue = " + intValue);
            // 8.
        intValue = 65;
        // charValue = intValue;        // 오류발생 !! int --> char 불가능
        charValue = (char)intValue;     // 해결!!
        System.out.println("charValue = " + charValue);
            // 9.
        doubleValue = 3.14;
        // intValue = doubleValue;      // 오류발생!! double -> int 불가능
        intValue = (int)doubleValue;    // 해결!!
        System.out.println("intValue = " + intValue);

        // [3] 연산중에 묵시적 타입 변환

    }
}
