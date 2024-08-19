package day13.step1;

public class Step1 {
    public static void main(String[] args) {


        // [1] Class 객체
        ExampleClass ec1 = new ExampleClass();
        System.out.println( ec1.var1 );
        System.out.println( ec1.var2 );

        System.out.println( ExampleClass.var1 );
        // System.out.println( ExampleClass.var2 );

        ec1.method2( 10 );

        // [2] InterFace 객체
        // ExampleInterface ei1 = new ExapleInterFace();
        System.out.println( ExampleInterface.var1 );
        System.out.println( ExampleInterface.var2 );

        // [3]
        ExampleInterface ei2 = new ExampleImplementClass();
        ei2.method1( 10 );
        ei2.method1( 20 );

    }
}
