package day04; // 현재 클래스가 위치한 패키지/폴더명

import java.util.Scanner; // import : 가져오기 뜻 , 미리 만들어진 클래스를 가져오기 , Scanner 클래스 가져오기
                            // - 클래스 란 : 속성 과 함수/기능 가 포함된 설계도
                            // - 객체 란 : 클래스[설계도] 기반으로 만들어진 메모리 공간
// - 자바는 컴파일(번역) 단위가 class 단위 이므로 모든 코드는 class 안에서 작성해야한다.
public class Step1 { // class s
    // - main함수 : 컴파일된 코드들을 읽어드리는(실행-스레드) 기능이 포함된 함수
    public static void main(String[] args) { // main start
        // [1] 입력 객체 생성
            // 1. 콘솔에서 입력받을때 필요한 객체( 입력 기능을 가진 형태물 )
        Scanner scan = new Scanner( System.in );
            /* 따라하기 :
                1. Scanner  : 첫글자를 대문자로 하는 Scanner (Sc)입력 후 엔터
                    - class 위에 import java.util.Scanner; 코드 자동 생성
                    - 주의할점 : 자동완성이 아닌 직접 입력시에는 import 자동 생성이 안된다.
                2. scan : 변수명 ( 임의 )
                        int a ;    int 기본 타입의 a 변수
                        Scanner b; Scanner 클래스 타입의 b 변수
                3. = : 대입
                4. new : 객체 생성 연산자
                    - new Scanner( System.in ); Scanner 타입의 객체 생성
            */
        // [2] 입력 객체 를 이용한 입력기능 사용하기
            // scan.next(); : 콘솔에서 입력를 할때까지 대기상태 이고 '엔터' 입력시 입력종료
        //scan.next();
            // Process finished : 프로그램이 끝났다는 뜻

        // [3] 다양한 입력후 타입변환을 제공하는 함수 들
        // 1. .next() : 콘솔 입력한 데이터를 문자열 타입으로 반환 해주는 함수
        System.out.print("[1] .next() 문자열 : ");
        //scan.next();            // 1. 입력
        //String str1 =           // 2. 저장
        //System.out.println();   // 3. 출력
        String str1 = scan.next();  // - 만일 콘솔에서 '자바' 입력시 String str1="자바"
        System.out.println("str1 = " + str1); // soutv : 자동완성

        // 2. .nextBoolean() : 콘솔 입력한 데이터를 논리 타입으로 반환 해주는 함수 ,
            // 주의할점 : true/false 만 입력 가능 그외 입력시 오류
        System.out.print("[2] .nextBoolean() 논리타입 : ");
        boolean bool1 = scan.nextBoolean();
        System.out.println("bool1 = " + bool1);

        // 3. .nextByte()   : 콘솔에서 입력한 데이터를 byte 타입으로 반환 해주는 함수 ,
        System.out.print("[3] .nextByte() -128~127 : ");
        byte byte1 = scan.nextByte();
        System.out.println("byte1 = " + byte1);
        
        // 4. .nextShort() : 콘솔에서 입력한 데이터를 short 타입으로 반환 해주는 함수 ,   
        System.out.print("[4] .nextShort() +-3만정도 : ");
        short short1 = scan.nextShort();
        System.out.println("short1 = " + short1);

        // 5. .nextInt() : 콘솔에서 입력한 데이터를 int 타입으로 반환 해주는 함수 ,
        System.out.print("[5] .nextInt() +-21억정도 : ");
        int int1 = scan.nextInt();
        System.out.println("int1 = " + int1);

        // 6. .nextLong() : 콘솔에서 입력한 데이터를 long 타입으로 반환 해주는 함수 ,
        System.out.print("[6] .nextLong() +-21억이상 정도 : ");
        long long1 = scan.nextLong();
        System.out.println("long1 = " + long1);

        // 7. .nextFloat() : 콘솔에서 입력한 데이터를 float 타입으로 반환 해주는 함수 ,
        System.out.print("[7] .nextFloat() 소수점8자리 표현 : ");
        float float1 = scan.nextFloat();
        System.out.println("float1 = " + float1);

        // 8. .nextDouble() : 콘솔에서 입력한 데이터를 double 타입으로 반환 해주는 함수 ,
        System.out.print("[8] .nextDouble() 소수점17자리 표현 : ");
        double double1 = scan.nextDouble();
        System.out.println("double1 = " + double1);

    } // main end
} // class e









