package day10;

public class Exam2 {
    public static void main(String[] args) {
        
        // 자바는 100% 객체지향언어이다.
        // super클래스인 Object클래스로부터 모든 클래스는 상속관계
        // 1. 
        A a = new A(); // 총 2개 , A 1개 Object 1개 A --> Object
        // 2. 
        B b = new B(); // 총 3개 , B 1개 A 1개 Object 1개 B --> A --> / Object class B extends A
        // 3.
        C c = new C(); // 총 3개 , C 1개 A 1개 Object 1개 C --> A --> / Object class C extends A
        // 4.
        D d = new D(); // 총 4개 , D 1개 B 1개 A 1개 Object 1개 D --> B --> A --> Object / class D extends B class B extends A 
        // 5.
        E e = new E(); // 총 4개 , E 1개 C 1개 A 1개 Object 1개 E --> C --> A --> Object / class E extends C class B extends A 
        // [2] 자동타입변환 / 업캐스팅
        A a2 = b; // B --> A [가능]
        Object o1 = a2; // A --> Object [가능]
        // [3] 강제타입변환 / 다운캐스팅
        B b2 = (B)a2; // A --> B [가능] 태생이 B 이라서
        // C c2 = (C)b2; // B는 C가 될수없다 같은 계층끼리 타입변환은 안된다 B는 C를 포함하지 않기 떄문에 불가능
        // [4] 타입확인, 인스턴스 instanceOf 타입명
        System.out.println( e instanceof Object); // e가 Object로부터 상속 받았는지 확인 맞으면 true
        System.out.println( e instanceof C); // true
        // System.out.println( e instanceof D); // e --> D false;
        // System.out.println( e instanceof B); // e --> B false;
        // 타입변환 전에 instanceof 키워드 활용하여 타입 확인 후 타입변환<안전>
    }
} // class end
class A{
    A(){System.out.println("[1]A객체생성");}
}
class B extends A{
    B(){System.out.println("[2]B객체생성");}
}
class C extends A{
    C(){System.out.println("[3]C객체생성");}
}
class D extends B{
    D(){System.out.println("[4]D객체생성");}
}
class E extends C{
    E(){System.out.println("[5]E객체생성");}
}