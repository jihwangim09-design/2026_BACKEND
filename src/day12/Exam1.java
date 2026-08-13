package day12;

public class Exam1 {
    public static void main(String[] args) {
        // 예외란? 에러발생 시 고치는게 아니라 흐름제어 vs if
        // 예외처리: try{ 예외발생코드 }catch( )

        // [1] 일반예외: 실행(컴파일)하기 전 예외가 발생할거같은 or 발생할수있는 코드에 대해 *미리 예외*
        // 1. ClassNotFoundException: 클래스 찾을 수 없다
        try{
              Class.forName("String"); // Class.forName("찾을클래스") 동적으로 존재하는 클래스 로드(읽어오기)
        }catch( ClassNotFoundException e ){
            System.out.println("존재하지 않은 클래스입니다." + e);
        }
        // 2. InterruptedException: 스레드에 문제가 발생 하면
        try{
            Thread.sleep(1000 ); // Thread.sleep( 밀리초 ); 밀리초 만큼 일시정지   // 스레드란? 컴파일(번역)된 코드들을 읽어드리는 흐름
        }catch( InterruptedException e ) {// 예외발생시 처리되는 코드 , e: 변수이면서 예외정보 담는 객체
            System.out.println("인터럽트 문제 발생 " + e);
        }    
    }   
}
