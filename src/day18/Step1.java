package day18;

import java.util.Arrays;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        
        // [1] 문자 
        char c1 = 'A';
        System.out.println("c1 = " + c1); // c1 = A
        char c2 = '김';
        System.out.println("c2 = " + c2); // c2 = 김
        System.out.println( c1 == 'A' ); // true

        System.out.println( (int)c1 ); // 65        // int(10진수)
        System.out.println( (int)c2 ); // 44608
            // - 문자 타입을 문자열 로 만들기 # char 배열을 이용한 문자열 표현 # JAVA:String클래스
        char[] s3 = new char[3];
           s3[0] = '김';     s3[1] = '민';    s3[2] = '재';

        // [2] 문자열
        String s1 = "김민재";
        String s2 = new String("김민재");
        System.out.println( s1 == "김민재"); // true
        System.out.println( s2 == "김민재"); // false
        System.out.println( s2.equals("김민재") ); // true

        // [3] 자바에서 자주 사용되는 문자열 함수들
        // 1. "문자열".charAt(인덱스)  # 지정한 인덱스번호 에 위치한 문자 1개 반환 함수
        String 주민등록번호 = "840420-1230123";
        System.out.println( 주민등록번호.charAt(7) ); // 1
        char gender = 주민등록번호.charAt(7);
        if( gender == '1' || gender == '3' ) { // char타입은 == 비교연산 가능하다.
            System.out.println("남자 입니다.");
        }else if( gender == '2' || gender == '4'  ){
            System.out.println("여자 입니다.");
        }
        // [활용] Scanner 클래스에는 nextChar() 메소드가 존재하지 않는다.
            // - Scanner 입력객체에서 문자1개를 입력받는 방법
        /*
        Scanner scan = new Scanner(System.in);
        char c3 = scan.next().charAt(0); // 키보드로부터 입력받은 문자열 자료중에서 0번째(첫번째)문자 추출
        System.out.println( c3 );
        */

        // 2. "문자열".length()  # 지정한 문자열의 길이 # 문자개수 반환 함수
        System.out.println( 주민등록번호.length() ); // 14
        // [활용] 문자열 내 문자1개씩 추출하기
        for( int index = 0 ; index < 주민등록번호.length() ; index++ ){
            System.out.print(" , " + 주민등록번호.charAt( index ) ) ;
        }
        System.out.println();

        // 3. "문자열".replace( "기존문자" , "새로운문자" )
        // # 지정한 문자열내 기존문자가 존재하면 새로운문자 치환/교체 해서 새로운 문자열 반환
            // # 주의할점 : 문자는 항상 불변성의 특징 따른다.
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은  String 클래스 입니다.";
        oldStr.replace( "자바" , "JAVA"); // # 지정한 문자열내 "자바"가 있으면 "JAVA"로 치환해서 반환 함수
        System.out.println( oldStr );
        String newStr = oldStr.replace( "자바" , "JAVA");
        System.out.println( newStr );
        // [활용] 외부로부터 자료를 받았는데 JAVA 관련된 자료가 포함된 경우 치환
        String htmlStr = "안녕하세요<br/>유재석"; // # html언어의 문법이 포함 # html에서 <br/>는 줄바꿈 뜻
        String newStr2 = htmlStr.replace( "<br/>" , "\n");
        System.out.println(  newStr2 );

        // 4. "문자열".subString(  )
            //  "문자열".subString( 시작인덱스 ) : # 시작인덱스 부터 문자열 잘라내서 반환하는 함수
            // "문자열".subString( 시작인덱스 , 끝인덱스 ) : # 시작인덱스 부터 끝인덱스 전까지 잘라내서 반환하는 함수
        String endNum =  주민등록번호.substring( 7 );
        System.out.println("endNum = " + endNum); // endNum = 1230123
        String startNum = 주민등록번호.substring( 0 , 6 );
        System.out.println("startNum = " + startNum); // startNum = 840420

        // 5. "문자열".split("구분문자")   # 문자열내 구분문자가 존재하면 구문문자 기준으로 분해 해서 (문자열)배열 로 반환
        System.out.println( 주민등록번호.split("-") ); // 주민등록번호에서 '-'하이픈 기준으로 분해 한다.
        String[] strArray = 주민등록번호.split("-");
        System.out.println( strArray[0] ); // 분해한 문자열배열에서 첫번째 인덱스 값 확인 # 840420
        System.out.println( strArray[1] ); // 분해한 문자열배열에서 두번째 인덱스 값 확인 # 1230123

        // 6. "문자열".indexOf("찾을문자") # 문자열내 찾을문자가 존재하면 찾은 문자열이 위치한 인덱스 번호 반환 , 없으면 -1 반환 한다.
        String bookName = "이것이 자바 프로그래밍 이다.";
        int findIndex = bookName.indexOf("자바"); // 문자열내 '자바' 문자가 포함하고 있는지 확인
        System.out.println("findIndex = " + findIndex); // 다섯번째에 위치하므로 인덱스는 4
        int findIndex2 = bookName.indexOf("파이썬");
        System.out.println("findIndex2 = " + findIndex2); // -1 # 문자열내 '파이썬'문자가 없다.
        
        // 7. "문자열".contains("찾을문자") # 문자열내 찾을문자가 존재하면 true 반환 , 없으면 false 반환 하는 함수
        boolean findBool = bookName.contains("자바");
        System.out.println("findBool = " + findBool); // findBool = true
        boolean findBool2 = bookName.contains("파이썬");
        System.out.println("findBool2 = " + findBool2); // findBool2 = false
        
        // 8. "문자열".getBytes() : # 문자열내 문자 하나씩 바이트로 변환후 바이트 배열로 반환 함수 
        String str = "Hello";   // 72[H] 101[e] l[108] l[108] o[111]
        byte[] bytes = str.getBytes(); // 문자열을 바이트 배열로 변환해서 반환 
        System.out.println("Arrays.toString(bytes)  = " + Arrays.toString(bytes) );
        
        // 9. new String( 바이트배열 ) # 지정한 바이트배열을 문자열 변환 해주는 문자열 클래스 생성자
        String str2 = new String( bytes );
        System.out.println("str2 = " + str2);

    } // main end
} // class end
