package day16;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Exam2 {
    public static void main(String[] args) {
        /*
            스레드 풀: 매번 새로운 스레드 생성하지 않고 미리 일정한 스레드를 풀(pool)에 생성
            목적: 과부하 방진
            구조: 선입선출(queue)방식으로 먼저 요청이 들어온 순서대로 *대기중인* 스레드가 처리한다.
            만일 대기중인 스레드가 없으면 요청은 wait(대기) 상태이며 스레드가 작업이 끝나고 대기중인 요청 처리
            활용처: 웹서버(톰캣), JDBC , 콜센터 시스템 , 안전한 서버 구축 등등



        */

        // [1] 스레드풀 구축( 미리 스레드 수 생성) ,
        // ThreadPoolExecuto poolExecutor = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor)Executors.newFixedThreadPool(3); // 강제 타입 변환 3개의 스레드 풀 구축
        // [2] 임의의 요청 스레드 생성 (구현체)
    } // main end
} // class end

// [2] 작업(요청) 스레드
class CallTask implements Runnable{
    private Random random = new Random(); // 난수객체 생성
    private int id; // 스레드 식별용
    public CallTask( int id ){ this.id = id; } // 생성자
    @Override
    public void run() {// 멀티스레드 
        String threadName = Thread.currentThread().getName(); // 현재 작업스레드명 호출 (식별용)
        System.out.println( threadName+"상담원이 고객 통화가 시작됨 고객id: "+id);

        
    }
}