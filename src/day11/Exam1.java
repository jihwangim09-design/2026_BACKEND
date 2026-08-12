package day11;

public class Exam1 {
    /*
        기본타입(리터럴):(8) byte, short, int, long, float, double, char, boolean
        참조타입(객체): [ ]배열, 클래스( String , Dto , Scanner 등등), 인터페이스 
    */
   // 1. 인터페이스 만들기 , interface
}
// 1. 인터페이스 만들기 , interface 인터페이스명
// 2. 인터페이스 주요벰버: 상수, 추상메소드
interface ExamInterFace{ 
    int a = 10; // 상수!, 인터페이스에서는 pubilc static final 생략 해도 상수이다.
    public static final int b = 20; // 상수
    // * 생성자없다. 즉 new없다 --> 인스턴스 불가능 , 목적: 여러 인스턴스 호출/관리
}
public class Exam1 { }
