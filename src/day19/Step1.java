package day19;

import java.sql.Connection;
import java.sql.DriverManager;

public class Step1 {
    public static void main(String[] args) {
        // [1] DB 연동 코드 # JDBC
        // 1. JDBC 드라이버 클래스 로드
            // mysql 에서 제공하는 jdbc 관련 클래스를 로드한다. # 경로는 고정 # 일반 예외 발생
        try {
            System.out.println("[1] JDBC 클래스 로드 ");
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("[2] DATABASE 접속 시도");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java" , "root" , "1234");

            System.out.println("[3] DATABASE 접속 성공");

        }catch (Exception e ){
            System.out.println(e);
            System.out.println("[4] DATABASE 접속 실패");
        } // catch end
    } // main end
} // class end






