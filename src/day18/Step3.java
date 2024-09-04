package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        // [1] 자바 외부에 (메모장/txt)파일 생성
        try { // [일반예외]예외가발생 하거나 [예측]발생할것 같은 코드
            // (1) 파일 쓰기 객체
            FileOutputStream 파일쓰기객체 = new FileOutputStream("./src/day18/test1.txt");
            // (2) 파일에 내용을 쓰기 # 쓰기할 자료는 바이트 타입만 가능하다.
            파일쓰기객체.write( "Hello Java".getBytes( ) );
            // (2) 콘솔에서 키보드로부터 입력한 문자열을 메모장에 작성하기
            //Scanner scan = new Scanner( System.in );
            //System.out.print("메모장에 입력할 내용 : ");
            //String 입력받은문자열 = scan.nextLine();
            //파일쓰기객체.write( 입력받은문자열.getBytes() );
        }catch ( FileNotFoundException e ){
            //FileNotFoundException : 만약에 해당 경로에 파일이 없으면/오류 발생하면 미리 대비해서 예외처리 해달라는 뜻
            System.out.println("[존재하지 않는 파일 혹은 잘못된 경로 입니다.]" + e );
        }catch ( IOException e ){
            System.out.println("[입출력 관련 오류가 발생했습니다. ]"+e);
        }

        // [2] 자바 외부에 (메모장/txt) 파일 읽어오기
        try {
            // (1) 파일 읽기 객체
            FileInputStream 파일읽기객체 = new FileInputStream("./src/day18/test1.txt");
            // (2) 바이트 단위로 읽어올 바이트배열 선언
            byte[] 바이트배열 = new byte[10]; // 15바이트 -> 영대소문자 1개당 1바이트 , 한글 1개당 3바이트
            // (3) 파일 읽기
            파일읽기객체.read( 바이트배열 );
            // (4) 바이트배열을 문자열로 변환
            System.out.println( new String(바이트배열) );
        }catch ( Exception e ){
            // Exception 클래스는 예외 클래스의 최상위 클래스 # 모든 예외를 처리 가능한 클래스이다.
            System.out.println("[예외발생-관리자에게문의]");
        }

        // [3] 활용 ( 메모장.txt) csv파일 :
            // 공공데이터포털 : https://www.data.go.kr
            // '부평구 맛집' 검색
            // 부평구 맛집 API 링크 : https://www.data.go.kr/data/15103411/fileData.do
            // DAY18 폴더내 '부평구맛집데이터.csv' 넣어두기

        try{
            // 1. 파일 읽기 객체 생성
            FileInputStream 파일읽기객체 = new FileInputStream("./src/day18/부평구맛집데이터.csv");
            // 2. 바이트 배열 선언
            byte[] bytes = new byte[6521];
            // 3. 파일 읽기
            파일읽기객체.read(  bytes );
            // 4. 확인
            String 파일내용 = new String( bytes , "EUC-KR" );
            System.out.println( 파일내용 );
            //활용
            System.out.println( 파일내용.split("\n")[0] );
            System.out.println( 파일내용.split("\n")[1] );
            System.out.println( 파일내용.split("\n")[1].split(",")[1] );
            // 첫번째 맛집 가게명 : (주)온누리푸드온누리장작구이
        }catch (Exception e ){
            System.out.println("[예외발생 관리자에게 문의]");
        }
    } // main end
} // class end










