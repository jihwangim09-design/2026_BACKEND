package day13;

public class Exam3 {
    public static void main(String[] args) {
        // String 클래스
        // 1. 문자열은 배열이다.
        char str1 = '유'; // char 타입은( ' ' )은 1글자만 가능!
        char[ ] str2 = { '유' , '재' , '석' }; // char 타입의 배열
        String str3 = "유재석"; // String 클래스는 배열의 멤버변수 가짐.
        // 2. 문자 변환
        char str4 = 65; System.out.println(str4); // 65대신에 A가 나옴 아스키코드
        char[] str5 = { 74 , 65 , 86 , 65 }; System.out.println(str5);
        
    } // m ed
} // c ed
