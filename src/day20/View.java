package day20;

import java.util.Map;
import java.util.Scanner;

public class View {

    // * 싱글톤 객체 만들기
    // (1) 생성자를 private 으로 한다.
    private View(){}
    // (2) 내부 클래스에서 private static final 객체 생성 한다.(싱글톤)
    private static final View view = new View();
    // (3) 내부 클래스 객체를 외부로부터 접근할수 있는 public static 메소드 선언 한다.
    public static View getInstance(){ return view;  }
    // 1. 메인페이지(화면) 그리는 함수
    // public static void mainView( ){
    public void mainView( ){
        while (true){ // 무한루프(반복문)
            System.out.println("===== 메인 화면(전화번호·기록부) =====");  // 출력문
            System.out.print("1.create 2.read 3.update 4.delete 5.exit : ");
            Scanner scan = new Scanner(System.in); // 입력 객체
            int choose = scan.nextInt();  // 키보드로부터 입력받은 자료를 정수타입으로 가져와서 변수에 저장
            if( choose == 1 ) { // 조건문 : if(조건) { } else { }
                System.out.println(">> 등록 페이지 <<");
                System.out.print(">>등록할 전화번호 : "); String phone = scan.next();
                System.out.print(">>등록할 성명 : "); String name = scan.next();

                boolean result = Controller.getInstance().create( phone , name );
                if ( result ){  System.out.println("[등록 성공]"); }
                else{  System.out.println("[등록 실패]");  }

            }else if( choose == 2 ){
                System.out.println(">> 출력 페이지 <<");

                // map 컬렉션이란? key와value를 한쌍(entry) 으로 구성 해서 여러개 쌍을 저장하는 구조 #
                Map< String , String > result = Controller.getInstance().read();
                result.keySet().forEach( key -> {
                    System.out.println( "phone : " + key + "   name : " + result.get( key ) );
                });

            }else if( choose == 3 ){
                System.out.println(">> 수정 페이지 <<");

            }else  if( choose == 4 ){
                System.out.println(">> 삭제 페이지 <<");

            }else if( choose == 5 ){
                break; // 가장 가까운 반복문을 종료한다. break  가장 가까운 반복문을 이동 한다. continue
            } // if end
        } // whine end
    } // m end

} // class end
