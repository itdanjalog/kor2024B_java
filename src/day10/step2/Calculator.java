package day10.step2;

public class Calculator {
    // 클래스 멤버
    // 1. 멤버변수/필드
    // 2. 생성자
    // 3. 멤버함수/메소드

    // [1] plus 함수 정의/만들기
    int plus( int x , int y ){
    // 1. int : return 값 , 반환 값의 타입 지정
    // 2. plus : 함수의식별이름
    // 3. ( int x , int y ) : 함수로 들어오는 값을 변수에 저장하는 매개변수 2개
        System.out.println("더하기를 처리 합니다.");
        int z = x + y; //
    // 4. 위 코드는 함수가 호출/사용 될때 실행되는 코드 들
        return z;
    // 5. return 값/변수; : 함수가 종료될때 함수를 호출했던 곳으로 반환해주는 값

    } // method end

    // [2] minus 함수 정의/만들기
    int minus( int x , int y ){ // method s
        System.out.println("빼기를 처리 합니다.");
        int z = x - y;
        return z;
    } // method e

} // class end
