package day10.step3;

public class Member { // class s
    // - 클래스 멤버
    // 1. 멤버 변수
    String name;    // 이름
    char gender;    // 성별
    String nation = "대한민국"; // 출생국가 , 초기값을 미리 정의
    int age;        // 나이
    double height;  // 신장
    // 2. 생성자
        // 2-1 : 기본/디폴트 생성자
    Member(){}
        // 2-2 : 사용자정의  생성자 , 매개변수가 4개인 생성자.
    Member( String name , char gender ,
            int age , double height ){

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    } //

    // 3. 메소드
        // 3-1 : 매개변수 없다 , 반환값 없다. void : 반환(return)값이 없다는 뜻
        // 함수 설명 : 객체내 필드 값을 출력해주는 함수
    void infoPrint() {
        System.out.println(this.name + this.gender +
                this.nation + this.age + this.height);
    } // method end

        // 3-2 : 매개변수 없다 , 반환값 있다. double
        // 함수 설명 : 객체내 (키)필드 값을 반환 해주는 함수
    double getHeight(){
        return this.height;
    } // method end

        // 3-3 : 매개변수 있다  byte , 반환값 있다. int
        // 함수 설명 : 엔화(yen)를 매개변수로 받아서 원화(krw) 계산해서 반환해주는 함수
    int getMoney( byte yen  ){
        int krw = yen * 900;
        return krw;
    } // method end

        // 3-4 : 매개변수 있다 int , 반환값이 없다. void
        // 함수 설명 : 시(time)를 매개변수로 받아서 12보다 크면 (나이)필드의 1를 더하는 함수
    void setAge( int time ) {
        // 만약에 time 변수가 12보다 크면 (나이)필드의 +1 하고 아니면 안한다.
        if( time > 12 ){ this.age += 1; }
    } // method end

} // class e



















