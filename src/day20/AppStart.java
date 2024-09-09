package day20; // 현재 클래스파일이 위치한 폴더/패키지명
/*
    - 클래스
        1. 자바는 컴파일러(번역) 단위가 클래스 단위 이다.
        2. 목적 : 1. 객체설계도 2.실행(main) 클래스
        3. 멤버 : 1. 멤버변수 2.생성자 3.메소드(멤버함수)
            - 다른 클래스에서 지정한 메소드를 호출하는 방법 (*) 객체가 필요하다.

    - main 함수
        1. 자바는 무조건 main 함수부터 코드가 실행 된다.
        2. main 스레드(번역된 코드를 읽는 흐름의단위)가 포함
*/

public class AppStart {
    public static void main(String[] args) {

        // 다른 클래스의 메소드를 호출하는 방법
        // 1. 객체를  생성한 후 메소드 호출
        // View view = new View();
        // view.mainView();

        // 2. 객체 생성한 후 메소드를 1회성 호출  # 변수없이
        // new View().mainView();

        // 3. 만약에 해당 메소드가 static(정적) 메소드 이면 객체가 없어도 된다.
        // View.mainView();

        // 4. 싱글톤 # 클래스명.getInstance();
        View.getInstance().mainView();

    } // main end
} // class end
