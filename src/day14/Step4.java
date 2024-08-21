package day14;
/*
    -캐스팅(타입변환)이란 : 변수의 타입을 변환하는 과정
        1. 기본타입
            (자동) byte -> short -> int -> long -> float ->double
            (강제) byte <- short <- int <- long <- float <-double
        2. 참조타입
            (자동) 자식타입 -> 부모타입
            (강제) 자식타입 <- 부모타입
 */

class Box{
    Object data;
}

class GBox< T >{
    T data;
}

class MGBox< A , B >{
    A data1;
    B data2;
}


public class Step4 {
    public static void main(String[] args) {
        // [1]. Object 클래스란? 자바에서 최상위 클래스 , 모든 클래스는 Object 로 부터 상속받는다. , 조상 클래스
            // (1) 자동/묵시적 타입변환 : 하위타입 --> 상위타입
        Object o1 = 1;      // int 타입 -> Object 타입 변환
        Object o2 = 3.14;   // double 타입 -> Object 타입 변환
        Object o3 = "JAVA"; // String 참조타입 -> Object 타입 변환
        Object o4 = true;   // boolean 타입 -> Object 타입 변환
        Object o5 = new Student(); // 정의한 Student() 타입 -> -> Object 타입 변환
            // (2) 강제/명시적 타입변환 : 상위타입 --> 하위타입 , 상위타입의 생성타입이 하위타입일 경우에만 가능.
        // Student s1 = (Student)o1; // 오류발생 : o1 태생 타입이 정수타입 이므로 Student타입으로 변환이 불가능
        Student s2 = (Student)o5; // 정상 : o5 태생 타입이 Student 타입 이므로 Student타입으로 변환이 가능하다.

        // [2] Object 활용하면 배열의 단점 보완 : 배열은 같은 타입들만 여러개 저장
        Object[] array = new Object[]{ 1 , 3.14 , "JAVA" , true , new Student() };

        // [3] 제네릭 타입 : 객체가 생성될때 멤버변수의 타입을 결정
            // (1) 제네릭타입을 사용 안했을때
            Box box1 = new Box();
            box1.data = 30; // 자동타입변환 실행 , 30(정수타입) --> Object 타입
            // int result1 = box1.data; // 오류 ??? box1.data 안에 있는 30은 int가 아니고 object 타입이다.
            int result1 = (int)box1.data; // 강제 타입변환 실행

            Box box2 = new Box();
            box2.data = "JAVA"; // 자동타입변환 실행 , "JAVA"(String타입) --> Object타입
            String result2 = (String)box2.data; // 강제 타입변환 실행

            // (2) 제네릭타입을 사용 했을때 , JAVA 버전 5 이상 출시
                // GBox 클래스의 data 멤버변수의 타입은 아직 정해져 있지 않다.
                // GBox 객체를 만들때 멤버변수의 타입을 결정한다.
            GBox<Integer> box3 = new GBox<>(); // int 기본타입을 참조타입으로 사용할때는 Integer 클래스 사용
                // box3 { Integer data; }
            box3.data = 30; // 타입변환 실행X
            int result3 = box3.data; // 타입변환 실행x

            GBox<String> box4 = new GBox<>();
                // box4 { String data; }
            box4.data = "JAVA"; // 타입변환 실행X
            String result4 = box4.data; // 타입변환 실행x

            // (3) 멀티 제네릭 타입
            MGBox< String , Integer > box5 = new MGBox<>();
                // box5 { String data1 ; Integer data2; }
            box5.data1 = "JAVA";
            box5.data2 = 30;

            MGBox< Double , Student > box6 = new MGBox<>();
                // box6 { Double data1 ; Student data2; }
            box6.data1 = 3.14;
            box6.data2 = new Student();








    } // main end
} // class end
