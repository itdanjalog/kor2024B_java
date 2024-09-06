package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Step2 {
    public static void main(String[] args) {

        // [1] JDBC( JAVA 와 DB 연동 ) 드라이버(클래스) 로드 # 일반 예외 발생
        try {
            System.out.println(">> JDBC 클래스 로드 ");
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println(">> DB 접속 시도");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java" , "root" , "1234" );
            System.out.println(">> DB 접속 성공");

            // [2] 자바에서 SQL 구문을 실행 하기
            // 1. insert
                // 1. SQL 구문을 작성한다.
            String sql = "insert into members( name ) values('유재석')";
                // 2. SQL 구문 실행 # conn.prepareStatement("sql구문");#  지정한 SQL 서명 한다.
            conn.prepareStatement( sql ).executeUpdate();
            System.out.println("=================> 등록 성공");

            // 2. select
                // 1. SQL 구문을 작성한다.
            String sql2 = "select * from members";
                // 2. SQL 구문 실행 하고 결과 반환 받기
            ResultSet rs = conn.prepareStatement( sql2 ).executeQuery(); // Query질의하다. 뜻
                // 3. while 반복을 이용한 레코드 하나씩 조회하기
            while( rs.next() ) {    // rs.next() : rs(select조회 결과 인터페이스 )
                // # .next() : 조회된 다음 레코드 이동 # 만약에 다음 레코드가 존재하면 true 아니면 false 반환 하는 함수
                String name = rs.getString( "name");
                // # rs.getString("속성명"); : 현재 조회중인 레코드/행 에서 지정한 속성명의 값 반환 하는 함수
                System.out.println("name = " + name);
            } // while end

            // 3. update
                // 1. SQL 구문을 작성한다. # 만약에 members 테이블에서 name 속성이 '유재석' 이면 '유재석2' 수정 처리
            String sql3 = "update members set name = '유재석2' where name = '유재석' ";
                // 2. SQL 구문 실행 하기
            conn.prepareStatement( sql3 ).executeUpdate();
            System.out.println("=================> 수정 성공 ");

            // 4. delete
                // 1. SQL 구문을 작성한다. # 만약에 members 테이블에서 name 속성이 '유재석2' 이면 레코드 삭제 처리
            String sql4 = "delete from members where name = '유재석2' ";
                // 2. SQL 구문 실행 하기
            conn.prepareStatement( sql4 ).executeUpdate();
            System.out.println("=================> 삭제 성공 ");

        }catch ( Exception e ){
            System.out.println(">> DB 접속 실패 "+e);
        }

    } // main end
} // class end






