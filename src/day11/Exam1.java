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
// 3. 추상메소드 구현할 클래스 필요<구현객체> , 클래스명 implements 인터페이스명, 인터페이스명
interface ExamInterFace{ 
    int a = 10; // 상수!, 인터페이스에서는 pubilc static final 생략 해도 상수이다.
    public static final int b = 20; // 상수
    // * 생성자없다. 즉 new없다 --> 인스턴스 불가능 , 목적: 여러 인스턴스 호출/관리
    // ** 추상메소드: 선언부만 존재하고 { } 구현부가 없는 메소드
    void method1( int x );
    public abstract int method2( int x , int y );
}
class ExamClass implements ExamInterFace{ // 해당 클래스가 지정한 인터페이스 구현
    // 상속은 오버라이딩(선택) vs 구현은 오버라이딩(필수)
    // 추상메소드에 대한 구현을 모두 마치면 클래스에 오류 사라진다.
    @Override public void method1( int x ){System.out.println( x );}
    @Override public int method2( int x , int y ){return x + y ;}
}
// 인터페이스로 추상을 만들고 클래스로 구현한다?

