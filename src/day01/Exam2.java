package day01;              //클래스가 속한 폴더명/패키지
public class Exam2 {        // 클래스 시작
        // [1] m + 엔터 : main함수 작성
        public static void main(String[] args) {    // 메인함수 시작

            // [2] 리터럴 : 상수 , 미리 상수로 구성한 자료들
            // 3, 'a' , true
            System.out.println( 3 ); // so + 3
            System.out.println( 3.14 );
            System.out.println( '유' ); //  ''(작은따옴표) : 문자
            System.out.println( "유재석" ); //  " "(큰따옴표) : 문자열 (N글자)
            System.out.println( true );
            // [3] 자료타입 / 자료형 : 자료(데이터) 효율적으로 분류하는 방법
            // 효율이란? 자료 크기에 따라 적당한 타입(크기) 선정하여 빈공간(여백) 줄이기
            // C/JAVA 정적 VS PY/JS 동작(자동으로)타입
            // 1) boolean : treu 또는 false 저장하는 타입 , 1byte
            boolean bool1 = true; // let/const --> boolean
            System.out.println( bool1 );

            // 2)
            //char : ''(작은따옴표로 감싼 문자 1개 저장하는 타입 , 영문은 2byte 한글은 3byte? 조금더큼, 유니코드(코드<-->자연어를 번역해주는 단위느낌?))
            char ch1 = 'A'; 
            System.out.println( ch1 );

            // 3) String : ""(큰따옴표로 감싼 문자 N개 저장하는 타입) , N * 2 byte 문자열개수만큼 크기다 달라짐 한글이 조금더큼 , 객체(문자열)
            String str1 = "ABC";
            
            
        } // 메인함수 끝
} // 클래스 끝
