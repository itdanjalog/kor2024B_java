package day20;

import java.util.Map;

public class Controller {

    // * 싱글톤 만들기
    private Controller(){} // (1)
    private static final Controller controller = new Controller();// (2)
    public static Controller getInstance(){ // (3)
        return controller;
    }

    // 1. 등록 컨트롤러
    public boolean create( String phone , String name ){
        // 접근제한자 public : 외부 클래스로부터 접근할수 있는 권한, private(내부) vs public(외부)
        // 반환타입 boolean : 현재 메소드가 종료되면 반환되는 값의 타입
        // 메소드명 create : 메소드 식별 이름 # 주로 카멜표기법(낙타의 등 처럼 , 두번째 단어부터 첫글자를 대문자 , memberCreate )
        // 매개변수 ( String phone , String name ) : 현재 메소드로 들어오는 인자값들을 대입하는 변수들
        // System.out.println("phone = " + phone + ", name = " + name);
        return Dao.getInstance().create( phone , name );
    } // method end

    // 2. 출력 컨트롤러
    public Map< String , String> read( ) {
        return Dao.getInstance().read( );
    }
} // class end














