package day15;
/*
    컬렉션 프레임워크
    - 컬렉션( collection / 수집 )
    - 프레임(틀/뼈대) 워크(일하다) : 틀과뼈대 를 가지고 일하다. 누군가가 미리 틀/뼈대 만들었으니 개발이 빠르다.
        - 수집뼈대 가지고 일하다.
    - (생활)수집 : 어떤 대상을 모으는 행위
        - 포켓몬 카드 수집
    - (컴퓨터)수집 : 자료구조( 효율적인 접근과 수정을 가능하게 하는 자료의 조직,관리,저장 )
        - 포켓몬 카드 수집할때 효율적인 접근과 관리를 위해서 카드를 구분해서 수집한다.
        - (생활) 포켓몬 카드 보관하는방법:자료구조 , (컴퓨터) 배열 , 리스트 , 스택 , 큐 , 해시 등등
    - 자바의 컬렉션 프레임워크 종류 , 이미 만들어진 인터페이스/클래스 활용 = 프레임워크
        [1] List 인터페이스 : 저장된 요소의 순서대로 인덱스를 부여 함으로 인덱스를 이용한 요소를 식별한다. , 중복 가능
        [2] Set 인터페이스 : 저장된 요소의 순서가 없고 인덱스가 없으므로 식별이 불가능하다, 즉 값으로 식별한다 , 중복 불가능
        [3] Map 인터페이스 : key 와 value 를 한쌍으로 하는 엔트리를 순서가 없고 인덱스가 없는 구조로 여러개 엔트리를 저장하는 구조 , key 중복 불가능
    - 용어
        1. 요소란 : 저장된 데이터들 중에서 하나의 값
        2. 인덱스란 : 순서대로 저장된 요소들의 번호
    - 장점
        1. 가변길이 이다. 배열은 한번 정한 크기를 변경하거나 삭제할수 없다.
        2. 별도의 기능/함수가 많다. 미리 만들어진 함수들을 제공하므로 빠르게 데이터를 관리할수 있다.

    [1] List 인터페이스
        1. 정의 : 순서가 있는 데이터의 집합 , 인덱스 존재(배열과비슷) , 요소의 값 중복허용(인덱스로 구별하므로)
        2. 클래스 : List 인터페이스의 구현클래스
            1. ArrayList 클래스     :  List< 제네릭타입 > 변수명 = new ArrayList<>();
            2. LinkedList 클래스
            3. Vector 클래스 등등
        3. 메소드
            1. .add( 자료 ) : 리스트객체내 지정한 자료의 요소를 추가한다
    * 인터페이스 에서 클래스가 필요한 이유 : 인터페이스는 추상메소드를 구현하는 클래스가 꼭 필요로 한다.

 */

import java.util.ArrayList;
import java.util.List;

public class Step1 {
    public static void main(String[] args) {
        // [1] ArrayList 클래스 선언
        List< Integer > list = new ArrayList<>();
        // [2] 메소드
        // 1. .add( 자료 )
        list.add( 10 ); list.add( 20 ); list.add( 30 ); list.add( 40 );
        System.out.println("list = " + list); // 확인 // [10, 20, 30, 40]
        // 2. .get( 인덱스번호 ) : 리스트객체내 지정한 인덱스번호의 요소 값 반환 함수
        int var1 = list.get( 1 );
        System.out.println("var1 = " + var1); // 20
        // 3. .set( 인덱스번호 , 자료 ) : 리스트객체내 지정한 인덱스번호의 요소 값 수정 함수
        list.set( 1 , 100 ); // 1인덱스의 값을 100 으로 수정 하겠다는 뜻
        System.out.println("list = " + list); // [10, 100, 30, 40]
        // 4. .remove( 인덱스번호 ) : 리스트객체내 지정한 인덱스번호의 요소 삭제
        list.remove( 2 ); // 2인덱스의 요소 삭제
        System.out.println("list = " + list );  // [10, 100, 40]
        // 5. .size() : 리스트객체내 요소 들의 총 개수 반환
        int var2 = list.size();
        System.out.println("var2 = " + var2); // 3
        // 6. .contains( 자료 ) : 리스트객체내 지정한 자료가 존재하면 true 아니면 false
        boolean var3 = list.contains( 100 );
        System.out.println("var3 = " + var3); // true
        // 7. .indexOf( 자료 ) : 리스트객체내 지정한 자료가 존재하면 찾은인덱스반환 없으면 -1 반환
        int var4 = list.indexOf( 100 );
        System.out.println("var4 = " + var4); // 1
        // 8. 반복문과 리스트 관계 : 리스트는 인덱스가 존재하므로 반복문과 같이 활용이 된다. 인덱스:0~ , 길이:1~ // 인덱스 와 길이는 1의 차이가 있다.
        for( int index = 0 ; index < list.size() ; index++ ){
            System.out.println("list.get( index )  = " + list.get( index ) );
        }
        // 9. .clear() : 리스트객체내 모든 요소 삭제 
        list.clear();
        System.out.println("list = " + list); // []
        // 10. .isEmpty() : 리스트객체내 요소가 하나도 없으면 true 하나라도 있으면 false
        boolean var5 = list.isEmpty();
        System.out.println("var5 = " + var5); // true
    }
}
