package day04;

public class Exam1 {
    public static void main(String[] args) {
        
        // 조건문1. : if( true/false ) 실행문;
        int 온도 = 5;
        if( 온도 <= 10 ) System.out.print("외투 입는다.");

        // 조건문2. : if( true/false ) ( 실행문; , 실행문; )
        if ( 온도 <= 10 ){ System.out.println("외투 입는다.");}
        if( 온도 <= 10 )  System.out.print("외투 입는다.");


    }
}
