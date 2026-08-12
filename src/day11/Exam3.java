package day11;

public class Exam3 {
    public static void main(String[] args) {
        
        // 1.
        Car myCar = new Car();
        // myCar.run(); // [오류] 타이어를 만든게 아님
        // 2.
        // myCar.tire = new Tire(); // [오류] 인터페이스로 객체생성불가능 어제 코드랑 다른점임
        // 3.
        myCar.tire = new HankookTire();
        myCar.run(); // 한국타이어 회전
        // 4.
        myCar.tire = new KumhoTire();
        myCar.run(); // 금호타이어 회전

        // 5.
        System.out.println( myCar.tire instanceof Tire ); // true
        System.out.println( myCar.tire instanceof KumhoTire ); // true
        System.out.println( myCar.tire instanceof HankookTire ); // false 마지막이 Kumho이기 떄문
        // [*] 익명(클래스없이)구현체 = 일회성 사용하는 인터페이스 구현체
        // 자체적으로 추상메소드 오버라이딩
        // new 인터페이스명(){ 오버라이딩 }
        myCar.tire = new Tire(){
            @Override public void roll(){
                System.out.println("일회성타이어 회전");
            }
        };
        myCar.run(); // 일회성타이어 회전

    } // m ed
} // c ed

class Car{
    Tire tire;
    void run( ){this.tire.roll(); }
}
// 인터페이스
interface Tire{
    void roll(); // { }없는 메소드는 추상메소드
}

// 구현체
class HankookTire implements Tire{
    // 추상메소드 { } 구현(재정의)
    @Override public void roll() {
        System.out.println("한국타이어 회전");
    }
}

class KumhoTire implements Tire{
    // 추상메소드 { } 구현(재정의)
    @Override public void roll() {
        System.out.println("금호타이어 회전");
    }
}