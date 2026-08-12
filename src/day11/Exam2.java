package day11;

public class Exam2 {
    public static void main(String[] args) {
        // 1. 인터페이스: 키보드 규격(규칙) 만든다.
        // 2. 규격에 따른 (implements)구현<구현체> 만든다.
        // 3. 키보드 타입 생성
        KeyBoard myBoard;
        // 4. 스포츠게임 실행하면
        myBoard = new SportsGame(); // 업캐스팅
        // 5. a키
        myBoard.akey(); // 슈팅
        // 6. 스포츠게임 종료하고 액션게임 실행하면
        myBoard = new ActionGame(); // 업캐스팅 (변수는 단 하나의 자료만 저장)
        myBoard.akey(); // 공격 
        // 즉 다형성 표현: 1) extends 2) implements
    } // m ed
} // c ed
class ActionGame implements KeyBoard{ 
    @Override
    public void akey() {
        System.out.println("공격");
    }
    @Override
    public int bkey(int x) {
        System.out.println("방어"); return x;
    }
}
class SportsGame implements KeyBoard{ 
    @Override
    public void akey(){System.out.println("슈팅");}
    @Override
    public int bkey(int x){System.out.println("수비"); return x; } 
} 

interface Buy{
    // 1) 추상메소드: 구현부가 없는 메소드
    public abstract void method1(); // 구현부가{}(중괄호)인데 이게 없음 
    // 2) 디폴트메소드: 구현부가 있는 메소드
    public default void method2(){}
    // 3) 정적메소드: static이면 인스턴스(구현체) 없이 사용 가능한 메소드
    public static void method3(){}
    // 4) 비공개메소드: 하위타입 오버라이딩(구현) 불가능한 메소드
    private void method4(){}
}
interface Sell{void method5();}
// 생략시 pubilc abstract 기본적용임.
// 원래는 public abstract 이렇게 써야하는데 추상메소드에서는 써도 되고 안써도된다

class Customar extends Object implements Buy, Sell{
    // 2개이상의  인터페이스들을 구현 가능 / 상속과의 차이점?
    // 추상메소드만 필수 오버라이딩 / 부모가 구현을 안해서? 
    @Override public void method1(){}
    @Override public void method5(){}
}

interface CustomarControl extends Buy, Sell {
    // 인터페이스는 다른 인터페이스로부터 상속 가능
    void order(); // 추상메소드
}

class Customar2 implements CustomarControl{
    // buy + sell 상속받은 CustomarControl 구현한다.
    @Override public void method1(){ }
    @Override public void method5(){ }
    @Override public void order(){ }
}