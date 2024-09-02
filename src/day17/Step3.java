package day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Step3 {
    public static void main(String[] args) {


        // 1. 파일내 데이터 쓰기/내보내기
        try {
            // 1-1 : 해당 생성자 매개변수의 넣은 경로가 존재하면 파일 연동  아니면 파일 생성
            FileOutputStream fout = new FileOutputStream("src/day17/fileTest.txt"  );
            // 1-2 : 파일내 작성할 문자열 준비
            String outStr = "JAVA PROGRAMMING";
            // 1-3 : 준비한 문자열을 바이트배열로 변환후 바이트배열에 저장
            byte[] outStrArray = outStr.getBytes();
            // 1-4 : 변환된 바이트 배열을 파일과 연동된 객체 .wrtie( 바이트배열 )
            fout.write( outStrArray );
        }catch (Exception e ){ System.out.println("e = " + e);  }

        // 2. 파일내 데이터 불러오기
        try {
            // 2-1 : 해당 생성자 매개변수의 넣은 경로가 존재하면 파일 연동
            FileInputStream fin = new FileInputStream("src/day17/fileTest.txt");
            // 2-2 : 바이트(영문1,한글:2 여러개를 저장할 바이트 배열  선언
            byte[] inStrArray = new byte[ 16 ];
            // 2-3 : 파일과 연동된 객체 .read( 바이트배열 );
            fin.read( inStrArray );
            // 2-4 : 바이트배열을 문자열 변환
            String inStr = new String( inStrArray );
            System.out.println("inStr = " + inStr);

        }catch (Exception e ){  System.out.println("e = " + e);  }

    }
}







