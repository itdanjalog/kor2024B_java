package day06; // 해당 클래스가 포함된 패키지/폴더명

public class Step1 { // class start

    public static void main(String[] args) { // main start

        // [1] 제어문(조건문)
            // - 프로그램의 흐름을 제어하는 중요한 구조 , 조건문 사용하여 TRUE 인지 FALSE 인지에 따른 코드 블록 실행
            // - 왜?? 컴퓨터는 혼자서 흐름 제어(사고방식) 없다. --> 개발자가 하나씩하나씩 흐름 제어 해야한다.
            /*
                [1]
                - 동생(6살) 에게 1000원 주고 집근처에서 콜라 구매 심부름. ( 상세한 설명이 부족해서 심부름 불가능 )
                - 동생에게 1000원 주고 집근처 A편의점 가서 콜라가 있고 가격이 1000원 이하이면 구매하고 집으로 돌아와
                  아니면 B편의점 가서 콜라가 있고 가격이 1000원 이하이면 구매하고 집으로 돌아와
                  아니면 C편의점 가서 콜라가 있고 가격이 1000원 이하이면 구매하고 집으로 돌아와
                  아니면 그냥 집으로 돌아와
                - if A편의점콜라 -> 콜라 1000 이하이면 -> 구매하고 집으로 복귀
                  else if B편의점콜라 -> 콜라 1000 이하이면 -> 구매하고 집으로 복귀
                  else if C편의점콜라 -> 콜라 1000 이하이면 -> 구매하고 집으로 복귀
                  else 그냥 집으로 복귀
                [2]
                    A골목길( 자주 다니던 골목 )
                    B골목길
                    - 어느날 A골목길이 공사중이면 B골목길로 간다.
                    if( A골목길 != 공사중 ){ A골목길로 학원가기; }
                    else{ B골목길로 학원가기; }
            */
            /*
            IF 형태
                1. 단순 IF문 , 참일때 코드가 하나일때 사용된다. { } 생략
                    if( 조건 ) 참일때코드;

                2. 실행 블록 IF문 , 참일때 코드가 여러개일때 사용된다. { } 사용한 여러개 코드 묶는다.
                    if( 조건 ) { 참일때코드1; 참일때코드2; }

                3. 조건/거짓 블록 IF문 , 참일때 코드 와 거짓일때 코드를 제어한다.
                    if( 조건 ) { }
                    else{ }

                4. 다수 조건에 따른 IF문 , 조건이 여러개 일때 사용된다. , 결과는 1개만 갖는다.
                    if( 조건1 ) {  }
                    else if( 조건2 ) { }
                    else if( 조건3 ) { }
                    else { }

                5. 중첩 if문 , { } 안에 if 넣기
                    if( 조건1 ) {
                        if( 참1 조건2 ){ }
                        else{ }
                    }else{
                        if( 거짓1 조건2 ){ }
                        else{ }
                    }
            */

        // [1] if
        int age = 10;

        // 1. 변수 선언
        // 2. 해당 변수를 논리
        if( age >= 19 ) System.out.println("[1] 성인 입니다.");

        // [2] if{ }
        if( age >= 19 )
            System.out.println("[2] 성인 입니다.");
            System.out.println("[2] 서비스 이용할수 있습니다.");   // 성인이 아닌데 '서비스 이용 '출력된다.

        if( age >= 19 ) {
            System.out.println("[2] 성인 입니다.");
            System.out.println("[2] 서비스 이용할수 있습니다.");   // 성인일때만 '서비스 이용' 출력된다.
        }

        // [3] if{ } else { }
        if( age >= 19 ){  System.out.println("[3] 성인 입니다."); }
        else{  System.out.println("[3] 미성년자 입니다.");  }

        // [4] if{ } else if{ } else if{ } else{ }
        if( age >= 40 ) { System.out.println("[4] 중년");  }
        else if( age >= 19 ){  System.out.println("[4] 청년"); }
        else if( age >= 7 ){ System.out.println("[4] 학생");}
        else{ System.out.println("[4] 유아"); }
            // if ~ else if : 다수 조건에 따른 하나의 결과를 얻기
            // vs
            // if 다수 : 다수 조건에 따른 다수 결과를 얻기
        if( age >= 40 ) { System.out.println("[4] 중년");  }
        if( age >= 19 ){  System.out.println("[4] 청년"); }
        if( age >= 7 ){ System.out.println("[4] 학생");}
        else{ System.out.println("[4] 유아"); }

        // [5] if중첩
        char gender = 'M';
        if( age >= 19 ){
            if( gender == 'W'){ // age >= 19 and gender == 'W'
                System.out.println("[5] 성인 여성 입니다. ");
            }else{
                System.out.println("[5] 성인 남성 입니다. ");
            }
        }else{
            System.out.println("[5] 미성년자 입니다. ");
        }

    } // main end
    // main { } 밖에 코드선언(변수선언)는 가능 하지만 실행(변수호출)코드는 불가능하다.
} // class end
// class { } 밖에 코드 입력시 컴파일(번역) 오류 발생 : 꼭 { } 체크 하자.









