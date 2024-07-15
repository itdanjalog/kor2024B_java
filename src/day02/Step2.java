package day02;

public class Step2 {
    public static void main(String[] args) {

        // int age = 10;

        int myInt = 4;
        double myReal = 2.5;
        char myChar = 'a';
        String myString = "hello";

        // 변수 선언과 초기화
        int age = 10;
        String name = "Alice";
        int value ;

        // 변수 사용
        System.out.println("Name: " + name); // 출력: Name: Alice
        System.out.println("Age: " + age);   // 출력: Age: 10
        //System.out.println( value );

        // 변수 값 변경
        age = 12;
        name = "Bob";

        // 변수 사용
        System.out.println("Updated Name: " + name); // 출력: Updated Name: Bob
        System.out.println("Updated Age: " + age);   // 출력: Updated Age: 12


    }
}
