package day14;

// 객체 설계도 클래스
class Book{
    // 1. 멤버변수
    private String bookName; // 책이름
    private String author; // 책저자
        // private 란? 현재 클래스에서만 호출 가능한 접근제한자 키워드
    // 2. 생성자
    public Book(){} // 기본생성자
    public Book( String bookName , String author ){   // 매개변수 2개를 갖는 생성자
        this.bookName = bookName;
        this.author = author;
        // 함수내에서 멤버변수와 매개변수의 이름이 같을때 구분하는 방법
        // this.변수명 : 멤버변수 뜻  , 변수명 : 매개변수 뜻
    }
    // 3. 메소드/멤버함수
        // 1. getter and setter : private 멤버변수를 외부클래스로부터 간접접근할수 있도록 만든 함수들
    public String getBookName() {return bookName;}
    public void setBookName(String bookName) {this.bookName = bookName;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
        // 2. toString : 객체의 주소값이 아닌 객체의 속성값들을 모두 문자열로 반환 해주는 함수
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
} // class end


// 프로그램 실행 클래스
public class Step2 {
    public static void main(String[] args) {

        // [1] 여러개 Book 객체를 저장하는 배열 선언
        Book[] library = new Book[5]; // 5개를 저장할수 있는 배열

        // [2] 각 인덱스 번호의 요소 값 대입
        library[0] = new Book( "JAVA" , "저자1");
        library[1] = new Book( "C" , "저자2");
        library[2] = new Book( "Python" , "저자3");
        library[3] = new Book( "C#" , "저자4");
        library[4] = new Book( "DataBase" , "저자5");
        // library[5] = new Book( "REACT" , "저자6");
        // 오류 발생 : 5인덱스는 존재하지 않는다. [0] ~ [4] 존재

        // [3] 배열순회 : 책장(library) 에 책(Book) 를 하나씩 호출
        for( int index = 0 ; index <= library.length-1 ; index++ ){
            // 인덱스는 0 부터 마지막인덱스까지 1씩증가 반복
            System.out.println( library[index] );
        }


    } // main end
} // class end
















