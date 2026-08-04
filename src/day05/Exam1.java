package day05;

import java.util.Scanner;



public class Exam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1] 객체 만들기
        // 1) 클래스 정의 :     1. .java 새롭게만들기 2. 현재파일 class 밖{}
        // class 클래스명{ 상태; 행위; }
        // 2) 클래스 { } 안에서 상탵 (멤버변수) 와 행위(메소드) 코드 작성
        // 3) 실행문(MAIN함수) 에서 객체 생성: 타입명 변수명 = new 생성자(인수, 인수 );
            // 1. class 타입 -> 참조 타입이다.
            // 2. class 타입은 첫글자 대문자 , 기본타입 소문자 , 변수명 소문자시작 관례
            // 3. new 인스턴스화 : 클래스 기반으로 (heap)메로리 할당
            // 4. Student 생성자 : 클래스명과 동일하며 메소드/함수 비슷한 역할
        new Student(); // 객체 생성
        Student s1 = new Student( ); // 객체 생성 후 Student s1에 변수 저장 
    
    // 2] 객체 사용/참조, .(접근/도트/이동)연산자 이동하여 멤버 접근
    System.out.println( s1 ); // 1) 객체 저장하고 있는 변수명 작성하면 day05.Student@232204a1 이런 주소값 반환
    System.out.println( s1.studentName ); // 2) 객체 저장하고 있는 변수명.멤버변수명하면 null이라고 나옴

    // 3] 객체내 멤버변수 값 수정 , (객체)변수명.멤버변수명 = 새로운값
    s1.studentName = "유재석";          System.out.println( s1.studentName);
    s1.StudentID = 10;                System.out.println(s1.StudentID);

    // *] 주의할점: new연산자 *1개 당* *1개의* 인스턴스 생성
    Student s2 = new Student(); // 인스턴스생성 day05.Student@4aa298b7 101호
    Student s3 = new Student(); // 인스턴스생성 day05.Student@7d4991ad 102호
    Student s4 = s2;            // 인스턴스참조 day05.Student@4aa298b7 101호
    System.out.println( s2 ); System.out.println( s3 ); System.out.println( s4 );
    s2.studentName = "강호동"; // 101호 멤버변수 수정
    System.out.println( s2.studentName); System.out.println( s4.studentName ); // s4가 s2를 참조해서 s2가 바뀌면 s4도 같이 바뀜 강호동


    
    } // m ed
} // c ed

class Student{ // '학생' 추상 개념 -> 코드화 
    // 멤버변수(상태)
    int StudentID; // 타입 변수명;     클래스 안에서 선언된 변수 -> 멤버변수
    String studentName;

} // class end
/*
    1. 객체란? 상태 또는 행위 정의(추상)하는것 
        -> 주체(개발자) vs 객체(프로그램내 모든 대상)
        -> 상태(값/자료), 행위(함수/메소드)
    2. 객체지향 프로그래밍 : 개발자(주체)가 컴퓨터내 객체(대상) 만들기
    
    3. 객체 정의: 클래스(설계도) 기반으로 객체 정의한다.

    4. 클래스란? 객체(추상)의 상태와 행위 코드로 정의한곳
        1) 설계클래스(객체정의용도) 2) 메인클래스(메인 함수 = 프로그램을 스타트 끊어주는 역할, 실행목적용도)
    
    5. 인스턴스란? 클래스로 (객체가) 정의된 기반으로 메모리 할당(물리개념)
        new 연산자 이용한다


*/