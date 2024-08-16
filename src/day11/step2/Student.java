package day11.step2;
// 실습1 : 학생점수 관리 프로그램 만들기 위한 Student 클래스 설계하시오.
// [조건1] 속성 : 이름 , 국어점수 , 영어점수 , 수학점수
// [조건2] 모든 멤버변수는 private 한다.
// [조건3] 생성자는 3개 이상 정의한다. ( 오버로딩 )
// [조건4] 각 멤버변수의 setter and getter 메소드를 만든다.
public class Student { // class s

    // 1. 멤버변수
    private String name;
    private int kor;
    private int eng;
    private int math;

    // 2. 생성자
        // 1. 기본/디폴트 생성자
    public Student(){}
        // 2. 매개변수 1개인 생성자 정의
    public Student( String name ){
        this.name = name;
    }
        // 3. 매개변수 4개인 생성자 정의
    public Student( String name , int kor , int eng , int math ){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }


    // 3. 메소드
        // 3. setter , 멤버변수가 private 이므로 외부클래스로부터 간접접근
    public void setName( String name ){
        // public : 해당 메소드를 모든 곳에서 접근 가능한 키워드 , 접근제한자
        // void : 메소드가 종료될때 반환타입이 없다는 뜻
        // setName : 메소드 이름, 임의로 아무거나 한다. setter 역할은 멤버변수명 앞에 set 붙인다.
        // (String name ) : 함수 호출시 안으로 들어오는 값의 매개변수를 정의
        this.name = name;
        // this : 현재 메소드를 호출한 객체를 뜻한다.
        // this.name : 현재 메소드를 호출한 객체의 멤버변수를 접근
        // this.멤버변수 = 매개변수; : 함수 안으로 들어온 매개변수 값을 멤버변수에 대입하는 실행문;
    }
    public void setKor( int kor ){ this.kor = kor; }
    public void setEng( int eng ){ this.eng = eng; }
    public void setMath( int math ){ this.math = math;}

        // 4. getter , 멤버변수가 private 이므로 외부클래스로부터 간접접근
    public String getName( ){
        // String : 메소드가 종료될때 반환타입이 'String'문자열 이라는 뜻
        return this.name;
        // return : 메소드가 종료될때 반환되는 값 , 메소드 종료 뜻
        // return this.name; : 메소드가 종료될때 현재 객체의 멤버변수의 값을 반환 하겠다는 뜻
    }
    public int getKor( ){ return this.kor; }
    public int getEng( ){ return this.eng; }
    public int getMath( ) { return this.math; }

} // class e

