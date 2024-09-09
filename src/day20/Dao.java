package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class Dao {
    // * 싱글톤 만들기
    private Dao(){ DBConnect(); } // (1)
    private static final Dao dao = new Dao(); // (2)
    public static Dao getInstance(){ return dao; }// (3)

    // - JDBC 연동 함수
    private Connection conn; // DB 연동 인터페이스
    public boolean DBConnect(){
        try { // 예외가 발생 하거나 할것 같은(예측) 코드를 감싼다.
            Class.forName("com.mysql.cj.jdbc.Driver"); // 1. JDBC 드라이버 라이브러리 빌드(불러오기) // 일반예외 발생
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java" , "root" , "1234");  // 2. 연동 # DriverManager.getConnection( 연동할DB주소 , 계정명 , 비밀번호 );
            System.out.println(">> DB 연동 성공 ");
            return true;
        }catch ( Exception e ){ // 예외가 발생했을때 실행코드
            System.out.println(">> DB 연동 실패 "+e);
        }
        return false;
    } // method end

    // 1. 등록 함수
    public boolean create( String phone , String name ){
        //System.out.println("phone = " + phone + ", name = " + name); // soutp
        // 1. sql 작성
        String sql = "insert into phonebook( phone , name ) values( '"+phone+"' , '"+name+"' )";
        try { // 2. 연동된 인터페이스의 sql 기재후 sql 실행
            conn.prepareStatement(sql).executeUpdate();
            return true;
        }catch ( Exception e ){   System.out.println(e);   }
        return false;
    } // method end

    // 2. 출력 함수
    public Map<String,String> read( ) {
        // * map 컬렉션 객체 생성  # 여러개의 엔트리(key:value)를 저장하기 위해서
        // 엔트리( phone : name )
        Map< String , String > map = new HashMap<>();
        // 1. sql 작성 # 조회SQL : select * from 테이블명;
        String sql = "select * from phonebook";
        try {
            // 2. 연동된 인터페이스의 sql 기재 하고 실행해서 결과 받기
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            // 3. 조회 결과 레코드 들을 ResultSet 인터페이스 이용한 레코드 조회
            while ( rs.next() ){ // 조회된 마지막 레코드 까지 하나씩 조회 반복
                // 4. rs.next() : 조회 결과에서 다음 레코드로 이동 메소드
                    // 다음 레코드가 존재하면 true 다음 레코드가 없으면 false 반환 함수
                String phone = rs.getString("phone");
                String name = rs.getString("name");
                    // 5. rs.get타입("필드명") : 현재 조회 중 인 레코드의 필드 값 반환 함수
                map.put( phone , name ); // key : phone , value : name
                    // 6. 번화번호를 key 에 저장하고 이름을 value에 저장하는 엔트리를 생성하여 map 컬렉션에 추가
            }
        }catch (Exception e ){  System.out.println(e);  }
        return map; // 7. map 컬렉션을 반환
    }
} // class end

















