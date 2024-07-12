// 주석 : 컴파일(번역)시 실행되지 않는 구역
// 슬래시 2개 , 한줄 주석
/* 여러줄 주석  */
    // 활용처 : 메모( 학습할때 = 코드설명적을때 , 협업할때 = 코드안내 )
    // 주석 정말 많이 하자..
        // 주석 안해도 되는 상황 : 1초안에 코드 해석이 가능하면
// 자바는 클래스 단위로 코드를 작성 , 왜? 컴파일러(번역기) , 번역 단위가 class 단위
    // - 클래스 구역 { } 밖에 코드를 작성하면 오류발생(번역불가능)
package day01;  // 현재 .java 파일이 위치한 폴더/패키지명

    // 10; // 클래스 밖에서 코드 입력시 오류/발생 * 규칙/법
    // System.out.println( 10 ); // 오류/발생 : class 밖 이라서

public class Step1 { // class 선언 // class 구역 시작  // 자바의 모든 코드는 class 안에서 작성한다.
    // 10; // 데이터( 정수 리터럴 코드 작성 ) , 후속 명령어 없다.
    //System.out.println( 10 ); // 오류/발생 : 명령어 실행은 main 함수 안에서만 가능하다.

    // - main 엔터 : main함수[ 코드를 읽어드리는 실행 스레드 내장으로 포함 = 코드를 읽는 흐름 기능]
    public static void main(String[] args) { // main 선언 // main 구역 시작 // 자바의 모든 코드를 읽는 실행은 main 함수 안에서 작성한다.
        // 10; // 데이터 코드 작성 , 후속 명령어 없다.
        // * 리터럴 값을 작성해서 출력 명령어를 실행

        // - sout + 엔터 : System.out.println( 리터럴값 );
        // 컴퓨터야 console창에 'XXXX' 출력해   // 컴퓨터야 console창에 '안녕컴퓨터' 출력해
        System.out.println( 10 );   // 자바 회사 에서 만든 명령어/코드
            // 컴파일러(실행) :
                // [1] 해당 파일의 오른쪽 클릭 -> RUN
                // [2] class 왼쪽 또는 main 왼쪽에 초록색 실행버튼
        System.out.println( 3.14 );     // 실수 리터럴값 출력
        System.out.println( 'a' );      // 문자 리터럴값 출력
        System.out.println( "abc" );    // 문자열 리터럴값 출력
        System.out.println( true );     // 불리언 리터럴값 출력
        System.out.println( 10 + 10 );  // 10(리터럴) + 10(리터럴) => 20(새로운 리터럴)

    } // main 구역 끝
} // class 구역 끝












