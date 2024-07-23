package day03; //해당 클래스가 위치한 패키지/폴더명

public class Step1 { // class start
    // 자바는 컴파일러(번역)를  클래스단위로 하기 때문에 모든 코드는 class 안에 작성

    public static void main(String[] args) { // main start
        // main 함수는 번역된 코드들을 읽어드리고 실행하는 스레드(기능) 포함되어 있다.

        // [1] console 출력
            // 1. System.out.print( 리터럴 또는 변수명 );       : console 출력하는 함수
            // 2. System.out.println( 리터럴 또는 변수명 );     : console 출력후 줄바꿈 하는 함수
            // 3. System.out.printf( "형식문자" , 리터럴 또는 변수명 );
        System.out.print("JAVA");
            // System : 시스템 관련 기능을 제공하는 클래스( 미리 만든 기능설계도 )
                // . : 도트(접근)연산자 , 앞에 있는 자료를 참조
                    // out : 출력 관련 객체 제공
                        // print( ) : ( ) 안에 있는 자료를 console 창에 출력하는 함수
        System.out.print("JAVA2");

        System.out.println("JAVA3");
        System.out.println("JAVA4");

        // [2] 이스케이프/제어 문자
            // 제어기능이 포함된 문자들
            // 키보드 엔터 위에 원화기호(\) , 백슬래시
            // 1.  \n : 줄바꿈처리   2. \t : 들여쓰기(TAB)   3. \r :개행(커서를앞으로)
            // 4. \\ : '\' 출력     5. \" : 큰따옴표 출력   6. \' : 작은따옴표 출력
                // - \n\r 조합하면 : 키보드의 엔터기능
        System.out.println("JAVA\nPYTHON\rC++\trJavaScript\\REACT\"안녕\"\'하세요\'");

        // 실습1 : console에 그림과 같은 강아지를 출력하시오.
        // 1
            // | : 키보드 엔터 위에 \(백슬래시)+shift
            // ` : 키보드 왼쪽끝에 tab 위에 있는 특수문자
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`");
        System.out.println("||_/=\\\\__|");
        // 2
        System.out.println("|\\_/|\n|q p|   /}\n( 0 )\"\"\"\\\n|\"^\"`\n||_/=\\\\__|");

        // [3] 형식문자
            // 다양한 형식 지정자를 이용한 문자열 형식 만들기
            // 1. %s : 문자열 형식  2. %d : 정수 형식  3. %f : 실수 형식
            // 자릿수 맞추기 :
                // %자릿수d    : 자릿수만큼 자릿수를 차지 , 만일 데이터가 자릿수만큼 비어있으면 공백처리 , 오른쪽 정렬
                // %-자릿수d   : 자릿수만큼 자릿수를 차지 , 만일 데이터가 자릿수만큼 비어있으면 공백처리 , 왼쪽 정렬 
                // %0자릿수d   : 자릿수만큼 자릿수를 차지 , 만일 데이터가 자릿수만큼 비어있으면 '0'으로 채우고 , 오른쪽정렬
            // 소수점
                // %자릿수.소수점자릿수f     : 전체자릿수 만큼 자릿수 차지 , 소수점자릿수까지 소수점이 출력된다.
        System.out.printf( "%s" , "JAVA");
        System.out.printf( "%d" , 123 );
        System.out.printf( "%f" , 3.14 );

        int price = 3000;   // int 타입의 'price' 이름의 변수를 선언하고 1500 리터럴값을 저장
        String name = "콜라"; // String 타입의 'name' 이름의 변수를 선언하고 "콜라" 리터럴값을 저장
            // 변수명를 호출해서 가격 출력
            // price; // 변수명을 호출한 값을 끝????
            // 1500
        System.out.println( "상품의 가격 : " + price +"원 입니다." );    // 변수명을 호출한 값을 print() 출력 , 사칙연산 비슷 : 안에 있는 소괄호 부터 처리
            // 1. price : 변수명 호출해서 1500값 반환 2. System.out.println();
            // + : 더하기연산이 아닌 연결연산자 : "문자열A" + "문자열B"  -> "문자열A문자열B"   /  "문자열A" + 30 -> "문자열A30"
        System.out.printf( "상품의 가격 : %d원 입니다.\n" , price );

        System.out.printf("%s의 가격 : %d원 입니다.\n" , name , price );
        System.out.printf("%s의 가격 : %6d원 입니다.\n" , name , price );
        System.out.printf("%s의 가격 : %-6d원 입니다.\n" , name , price );
        System.out.printf("%s의 가격 : %06d원 입니다.\n" , name , price );
        System.out.printf("%5s의 가격 : %5.1f원 입니다.\n" , "사이다" , 3.14);

        // 실습2 : 오른쪽 출력 그림과 같이 3개의 변수들을 printf()함수를 활용하여 출력하시오.
        int num = 1;
        String writer = "유재석";
        String content = "안녕하세요! 처음입니다.";

        System.out.printf("============ 방문록 ============\n");
        System.out.printf("%s\t\t%s\t\t%s\n" , "번호" , "작성자" , "방문록");
        System.out.printf("%d\t\t%s\t\t%s\n" , num , writer , content );
        System.out.printf("===============================\n");

        System.out.printf("============ 방문록 ============\n");
        System.out.printf("%-3s %-5s %-15s \n" , "번호" , "작성자" , "방문록");
        System.out.printf("%-4d %-5s %-15s \n" , num , writer , content );
        System.out.printf("===============================\n");


    } // main end
} //  class end












