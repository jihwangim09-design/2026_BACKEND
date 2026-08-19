package day13;

import day12.종합예제.model.dto.BoardDto;

public class Exam1 {
    public static void main(String[] args) {
        // 라이브러리 : 다른 사람들이 만든 클래스/메소드 집합
        // [1] Object 클래스 : 자바의 최상위 클래스 *다형성*
        Object o1 = 3;          Object o2 = 3.14;           Object o3 = "유재석";
        Object o4 = true;       Object o5 = new int[3];
        // * 모든 자료들은 Object 타입 변수에 대입 가능. *
        // 1. toString( ) : 객체의 주소값 반환 함수 , 즉 생략가능 , 활용처 : 오버라이딩 이용한 멤버변수확인
        System.out.println( o5.toString() ); // [I@7ad041f3
        System.out.println( o5 );            // [I@7ad041f3
        Object o6 = new BoardDto();          // Dto에 toSTring에 대한 오버라이딩을 했음
        System.out.println( o6.toString() ); // BoardDto [no=0, content=null, writer=null]
        System.out.println( o6 );            // BoardDto [no=0, content=null, writer=null]
        // 2. equals( ) : 객체가 참조하는 값 비교 함수 , 활용처 : 객체비교, *문자열*비교
        Object o7 = new BoardDto();
        System.out.println( o6 == o7 );         // false 
        System.out.println( o6.equals (o7) );   // false
        String str1 = "유재석"; String str2 = new String("유재석");
        System.out.println( str1 == str2 );     // false
        System.out.println( str1 == "유재석" );  // true    리터럴문자열 == 리터럴문자열
        System.out.println( str2 == "유재석");   // false   객체(리터럴문자열) == 리터럴문자열
        // 리터럴로 정의한 문자열과 new String으로 정의한 문자열은 다르다. 문자열은 포장되기때문에 좀 더 다르다?
        System.out.println( str2.equals("유재석")); // true


    } // m ed
} // c ed

/* 
    기본타입 : byte short int long float double shar boolean
        - 리터럴 = 상수
    참조타입 : 클래스(String,Scanner,~DTO 등등), 인터페이스(Connetion 등등), 배열[ ]
        - 참조 = 주소       , 기본타입 여러개를 하나로 만들때 사용


*/
