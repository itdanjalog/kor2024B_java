package day14;

// 객체 설계도 클래스
class Student{
    // 1. 멤버변수
    private String name;
    private int midTermExam;
    private int finalExam;
    // 2. 생성자
    public Student(){} // 1.빈생성자
    public Student( String name , int midTermExam , int finalExam ){ // 2.풀생성자
        this.name = name;
        this.midTermExam = midTermExam;
        this.finalExam = finalExam;
    }
    // 3. 메소드
    @Override  // 1. toString()
    public String toString() {
        return "Student{" +
                "midTermExam=" + midTermExam +
                ", name='" + name + '\'' +
                ", finalExam=" + finalExam +
                '}';
    }
    // 2. getter and setter()
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getMidTermExam() {return midTermExam;}
    public void setMidTermExam(int midTermExam) {this.midTermExam = midTermExam;}
    public int getFinalExam() {return finalExam;}
    public void setFinalExam(int finalExam) {this.finalExam = finalExam;}
} // class end

// 프로그램 실행 클래스
public class Step3 {
    public static void main(String[] args) {
        /* 배열 실습1 : Student클래스를 정의하여 최대100명이 저장될수 있도록 배열 생성 코드 작성하시오.
            조건1 : Student 멤버변수 3개 : 이름 , 중간고사점수 , 기말고사점수
            조건2 : 멤버변수는 private , 생성자2개 이상 , getter and setter , toString  생성 하시오.
            조건3 : 임의 객체 2개를 생성하여 배열내 첫번째 와 두번째 요소 자리에 저장하시오.
            조건4 : 반복문을 이용한 배열을 순회 하시오.
        */

        // [1] 학생  객체를 최대 100개 저장할수 있는 배열 타입 선언
            // 100 개의 연속된 공간이 생성 , 고정길이 , 길이 수정이 불가능하다.
            // 인덱스 : [0] ~ [99]  , 길이 : 100 , 마지막인덱스 : [99]
        Student[] array = new Student[100];

        // [2] 첫번째 요소의 학생 대입
        array[0] = new Student("유재석" , 30 , 70 );

        // [3] 두번째 요소의 학생 대입
        array[1] = new Student("강호동" , 70 , 90 );

        // [4] 배열 순회
        for( int index = 0 ; index <= array.length-1 ; index++ ){
            System.out.println( array[index] );
        }
            // null 이라는것은 객체가 없다 , 즉] 참조 주소가 존재하지 않는다 뜻

    } // main end
} // class end















