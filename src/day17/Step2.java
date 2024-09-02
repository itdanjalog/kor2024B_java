package day17;

import java.util.*;

public class Step2 {
    public static void main(String[] args) {

        // [1] try{} catch{} finally{}
        try {
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
        }catch ( InputMismatchException e ){
            System.out.println("잘못된 입력");
        } // catch end
        finally {  // - 예외가 발생 여부와 상관없이 실행되는 실행코드 #주로 외부 시스템과 연동 해제 시 사용된다.
            System.out.println("입력되었습니다.");
        }

        // [2] try{} catch{ } catch{ } catch{ }
        try{
            int[] intArray = { 1 , 2 , 3 };
            intArray[3] = 4; // 인덱스 3은 없으므로 예외발생를 예측된다. ( 어떻게 알죠?? 개발자 경험 필요 )
            Integer.parseInt( "aaa"); // "aaa"는 정수타입으로 변환할수 없으므로 예외발생이 예측된다.
        }catch ( ArrayIndexOutOfBoundsException e ){
            System.out.println("존재하지 않는 인덱스 입니다.");
        }catch ( NumberFormatException e ){
            System.out.println("정수타입으로 변환할수 없는 자료 입니다.");
        }catch ( Exception e ){
            System.out.println("예외 발생 했습니다.");
        }

        // [3] 실습1 : 로또 프로그램 구현
            // - 6번의 1~45 사이의 번호를 입력받아서 컬렉션 프레임워크(ArrayList) 저장
            // - ( 예외 예측 방지 ) 번호 입력시 번호가 아닌 다른것을 입력하면 예외처리 함으로써 프로그램 실행 유지 하도록 구현
        // [1] 입력객체
        Scanner scan = new Scanner(System.in);
        // [2] 6개 정수를 저장할 리스트 컬렉션 선언
        List< Integer > list = new ArrayList<>(); // 컬렉션 프레임워크 [ 동일한 타입의 2개이상 자료들을 저장 할때 사용된다. ]
        // [3] 6번 입력를 받기 위해서 반복문을 6번 회전한다.
        for( int i = 1 ; i<=6 ; i++ ){ // i는 1부터 6까지 1씩증가하면서 반복 # 6회반복
            try{ // [4] 만약에 try{} 안에서 예외가 발생하거나 발생 할것같은 코드
                int value = scan.nextInt(); // [5] 정수타입으로 입력받는다. *예측:사용자가 문자열을 입력하면 예외발생

                // [*조건추가] 만약에 정상입력 이면서 1~45 사이의 정수가 아니면
                if( value < 0 || value > 45 ){
                    System.out.println(" 1~45 사이의 정수만 입력해주세요.");
                    i--; continue;
                }
                // [*조건추가] 만약에 정상입력 이면서 기존에 입력한 정수 이면  (  중복제거 )
                if( list.contains( value ) ){ // 만약에 방금 입력받은 값이 리스트에 존재하면
                    System.out.println(" 이미 등록한 정수 입니다.");
                    i--; continue;
                }
                // [6] list 에 입력받은 value 자료를 저장한다.
                list.add( value );

            }catch ( Exception e ){ // [7] 만약에 try{} 에서 예외발생시 Exception 클래스 : 모든 클래스의 상위클래스
                System.out.println("잘못된 입력이 있습니다.");
                i--; // [8] 해당 반복횟수는 정상 입력이 아니므로 반복횟수는 다시 차감
                scan = new Scanner(System.in); // [9] 키보드로부터 잘못 입력받은 데이터를 초기화
            } // catch end

        } // for end
        // - [10] 6번 입력후 리스트 상태 확인
        System.out.println("list = " + list);
    } // main end
} // class end
