package day04;

public class Exam2 {
    public static void main(String[] args) {
        // 1. for( 초기값 ; 조건문 ; 증감식 ){ 실행문; }
        for ( int 단  = 2 ; 단 <= 9 ; 단++) {
            for ( int 곱 = 1 ; 곱 <= 9 ; 곱++) {
                System.out.printf("%d X %d = %d \n" , 단 , 곱 , 단*곱 );
            }
        } //

        // 2. break; 반복문탈출 , continue; 증감식이동
        for( int i = 1 ; i <= 10 ; i++ ){
            if ( i == 3 ) continue; // 만약에 i가 3이면 증감식이동
            if ( i == 5 ) break; // 만약에 i가 9면 반복문탈출
            System.out.println( i );
        }

        // 3. 무한루프 : 실행문 계속반복, 특정조건에 따른 break 활용
        for ( ; ; ){System.out.println("무한반복"); break; }

        // 4. 초기값; while( 조건문 ){ 실행문; } [VS] for문
        int i = 1; // [1] 초기값
        while ( i <= 10 ) { // [2] 조선식

            // [3] 증감식
            i++;
        } // w end

    } //
} // 
