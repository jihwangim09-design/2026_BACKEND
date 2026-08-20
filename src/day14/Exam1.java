package day14;

public class Exam1 {
    public static void main(String[] args) {
        /*
            제네릭 타입
            정의: 여러가지 타입에서 동작할 수 있도록 만든 타입
            목적: 클래스 정의할때 타입 정하지 않고 사용자(개발자)가 사용할 때 타입 정한다.
            사용법:
                1) 제네릭타입은 영 대문자로 한다.
                2) 여러개 가능 
                3) 기본타입 불가능하므로 래퍼클래스 사용한다.

        */
        // 1] 클래스내 객체 멤버변수 동일한 타입으로 값 대입
        Box1 box1 = new Box1();
        box1.content = "안녕하세요";
        // 2] String 대신에 int 타입으로 값 대입?? 새로운 클래스 만든다.
        Box2 box2 = new Box2();
        box2.content = 10; // 동일한 멤버변수간 서로 다른 타입 불가능??
        // 3] 해결방안? 제네릭 이용한 동일한 멤버변수간 서로 다른 타입 사용.
        // - 사용하는 사람이 제네릭타입 정한다.
        Box3< String > box3 = new Box3< String >(); // 생성자 뒤에 제네릭 생략 가능
        box3.content = "안녕하세요";
        Box3< Integer > box33 = new Box3<>(); // 생성자 뒤에 제네릭 생략
        box33.content = 10;
    } // m ed
} // c ed
class Box1{ String content; } // 박스1 클래스내 문자열 content 대입 가능.
class Box2{ int content; } // 박스2 클래스내 정수형 content 대입 가능.
class Box3< 제네릭타입 >{ 제네릭타입 content; } // < > 이용한 미지수 타입 지정