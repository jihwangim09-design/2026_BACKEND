package day15;

import java.time.LocalTime;

public class Exam4 {
    public static void main(String[] args) {                        // <--------- [1.MAIN]
        
        // [1] 시계 구현
        // 1. 새로운 작업(시계) 스레드 실행
        시계스레드 runnable1 = new 시계스레드();                    // 구현체 생성
        Thread thread1 = new Thread( runnable1 );             // 스레드 객체에 구현체 대입
        thread1.start();                                      // 스레드객체 시작, [1.MAIN]가 [2.시계스레드] 스레드 켠다

    } // main end
} // class end
class 시계스레드 implements Runnable{ // Runnable인터페이스 구현하면 멀티스레드 정의!
    
    @Override public void run() { // 멀티스레드가 처리할 작업
        while (true) { // 무한루프
            System.out.println( LocalTime.now()); // 현재시간
            try{ Thread.sleep(1000);}catch(Exception e){} // 1초 일시정지하고 찍고 반복
        }
    }    


}