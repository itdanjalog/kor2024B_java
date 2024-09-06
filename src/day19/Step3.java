package day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        try {
            // ===============[1] DB 연동 코드 ================== //
                // ==> 여기에 DB 연동 코드를 넣어주세요
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/java" , "root" , "1234" );
            // ===============[2] 무한루프 ====================== //
            while (true){
                System.out.print("1.등록 2.출력 3.수정 4.삭제 : ");
                Scanner scan = new Scanner(System.in);
                int ch = scan.nextInt();
                if( ch == 1 ){
                    // ===============[3] 무한루프 ====================== //
                    // ==> 키보드로부터 입력받은 값을 (DB내) members 테이블 에 (레코드) 저장 하시오.
                    String newName = scan.next();
                    String sql = "insert into members( name ) values('"+newName+"')";
                    conn.prepareStatement( sql ).executeUpdate();
                    System.out.println("=================> 등록 성공");
                }

                if( ch == 2 ) {
                    // ===============[4] 무한루프 ====================== //
                    // ==>  (DB내) members 테이블에 저장된 모든 레코드/행 를 출력 하시오.
                    String sql2 = "select * from members";
                    ResultSet rs = conn.prepareStatement( sql2 ).executeQuery();
                    while( rs.next() ) {
                        String name = rs.getString( "name");
                        System.out.println("name = " + name);
                    } // while end
                }

                if( ch == 3 ) {
                    // ===============[5] 무한루프 ====================== //
                    // ==> 수정할 이름 과 새로운 이름 의 2개 이름을 키보드로부터 입력받아 (DB내) members 테이블 속성명 값을 수정 처리 하시오.
                    String oldName = scan.next();
                    String newName = scan.next();
                    String sql3 = "update members set name = '"+newName+"' where name = '"+oldName+"' ";
                    conn.prepareStatement( sql3 ).executeUpdate();
                    System.out.println("=================> 수정 성공 ");
                }

                if( ch == 4 ) {
                    // ===============[6] 무한루프 ====================== //
                    // ==> 삭제할 이름 을 키보드로 부터 입력받아 (DB내) members 테이블의 레코드를 삭제 처리 하시오.
                    String delName = scan.next();
                    String sql4 = "delete from members where name = '"+delName+"' ";
                    conn.prepareStatement( sql4 ).executeUpdate();
                    System.out.println("=================> 삭제 성공 ");
                }
            } // while end
        }catch (Exception e ){
            System.out.println("[예외발생]"+e);
        }// c end

    } // main end
} // class end






