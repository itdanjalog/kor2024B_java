package day17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {

        // [1] 일반예외 : 컴파일러 가 예외 처리 코드 여부를 검사하는 예외
            // Class.forName("클래스패키지경로"); # 지정한 클래스가 존재하는지 검사 해주는 클래스함수
        try {
            // 예외가 발생(일반예외) 하거나 할것 같은(실행예외) 코드
            Class.forName("java.lang.String"); // String 클래스는 존재한다. #예외발생 안함 // 일반예외를 가지는 클래스함수 # 지정한 클래스가 존재하지 않을수도 있으므로(예측) 무조건 예외처리
            Class.forName("java.lang.String2");// String2 클래스는 존재하지 않는다. # 예외발생 한다.--> catch 구역으로 이동한다.
        }catch ( ClassNotFoundException e ){
            // try{} 안에서 예외가 발생 했을때 실행되는 실행코드
            System.out.println("e = " + e); // soutv 자동완성
        }

        // [2] 실행예외 : 컴파일러 가 예외 처리 코드 여부를 검사하지 않는 예외 ( 개발자의 경험 중요하다. 예측 )
            // 1. NullPointerException
        try {
            // 예외가 발생 하거나 할것 같은 코드
            String str1 = "Java Hello";
            System.out.println("str1.length()  = " + str1.length()); //  문자열.length() : 문자열내 문자개수 반환 함수
            String str2 = null; // 객체(문자열) 이 없다
            System.out.println("str2.length()  = " + str2.length()); // 문자열이 없으므로 문자길이 함수 에서 예외 발생
            // Cannot invoke "String.length()" because "str2" is null
        }catch ( NullPointerException e ){ System.out.println("e = " + e);   }
        
            // 2. NumberFormatException
        try {
            int value = Integer.parseInt("10");
            int value2 = Integer.parseInt("AA");   // Integer.parseInt( 문자열타입 정수형 ) : 정수타입 변환 함수
        }catch ( NumberFormatException e ){ System.out.println("e = " + e);  }
        
            // 3. ArrayIndexOutOfBoundsException
        try {
            int[] intArray = {1, 2, 3};
            System.out.println("intArray[2]  = " + intArray[2]);
            System.out.println("intArray[10]  = " + intArray[10]);
        }catch ( ArrayIndexOutOfBoundsException e ){ System.out.println("e = " + e); };

            // 4. InputMismatchException
        try {
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt();
        }catch ( InputMismatchException e ){
            System.out.println("e = " + e);
        }

        
    } // main end
} // class end
