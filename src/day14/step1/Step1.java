package day14.step1;

import java.util.Arrays;

class Book {

    // 1. 멤버변수/필드
    private String bookName;
    private String author;

    // 2. 생성자 : 오른쪽클릭 -> 생성 -> 생성자
    public Book(){}
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }
    // 3. 메소드
    // 1. 일반함수
    public void showBookInfo(){
        System.out.println( this.bookName + ","+this.author );
    }
    // 2. getter and setter : 오른쪽클릭 -> 생성
    public String getBookName() { return bookName;  }

    public void setBookName(String bookName) {this.bookName = bookName;}

    public String getAuthor() {return author;}

    public void setAuthor(String author) {  this.author = author;}
}

public class Step1 {
    public static void main(String[] args) {
        // [ 배열 선언 ]
        // 1. int형 10개를 저장할수 있는 배열 선언과 동시에 초기화
        int[] num = new int[]{ 1,2,3,4,5,6,7,8,9,10};
        // - num = [1][2][3][4][5][6][7][8][9][10]
        // Arrays.toString( 배열변수 ) : 현재 배열내 요소들을 출력
        System.out.println( Arrays.toString( num ));

        int[] num2 = new int[10];
        // - num2 = [0][0][0][0][0][0][0][0][0][0]
        System.out.println( Arrays.toString( num2 ) );

        int num3;
        // System.out.println( num3 );

        // [ 배열내 요소 하나씩 호출 ]
        int sum = 0;
        for( int i = 0 ; i < num.length ; i++ ){
            System.out.println( num[i] );
            sum += num[i];
        }
        System.out.println(" 203p. 하단 1분복습 결과 : " + sum );

        // 문자 여러개를 저장하는 문자 배열 만들기 ===> 문자열 만들기
        // - String 클래스 이해 도움
        char[] alphabets = new char[26];
        char ch = 'A';
        for( int i = 0 ; i<alphabets.length ; i++){
            alphabets[i] = ch;
            ch++; // 알파벳 문자 1증가. A --> B
        }
        for( int i = 0 ; i<alphabets.length ; i++ ){
            System.out.println( alphabets[i] + ","+(int)alphabets[i] );
        }
        // char c = 'A'         -----> 정수로 변환 O ==> 65
        // String str = "ABC"   -----> 정수로 변환 X ==> [ 65 , 66 , 67 ]
        // String <====> char[]



        // [1]
        int[] array1 = new int[3];
        array1[0] = 30;
        //array1[1] = "유재석";    // 타입이 다르므로 오류
        array1[1] = 'A'; // 자동 타입 변환
        array1[2] = (int)3.14;  // 강제 타입 변환
        // array1[3] = 'B'; // 존재하지 않는 인덱스 오류
        System.out.println(Arrays.toString( array1 ) );

        // [2]
        Book[] library = new Book[5];
        // - library = [null] [null] [null] [null] [null]
        for( int i = 0 ; i<library.length ; i++ ){
            System.out.println( library[i]);
            // 객체가 null 일때 .(도트/접근) 사용 불가능.
            //library[i].showBookInfo();
        }

        library[0] = new Book("책이름1" , "저자1");
        library[1] = new Book("책이름2" , "저자2");
        library[2] = new Book("책이름3" , "저자3");
        library[3] = new Book("책이름4" , "저자4");
        library[4] = new Book("책이름5" , "저자5");

        for( int i = 0 ; i<library.length ; i++ ){
            System.out.println( library[i]);
            library[i].showBookInfo();
        }


    }
}