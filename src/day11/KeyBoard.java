package day11;

public interface KeyBoard {
// 폴더 -> now java file -> interface 생성
// 1. 상수는 필수가 아닌데 상수를 쓸거면 초기값 대입이 필수
    public static final String info = "인텔"; // 상수
    String date = "2026-08-12"; // 상수
// 2.추상메소드, { } 생략한 선언부만 작성
    public abstract void akey(); // 추상메소드
    int bkey( int x ); // 추상메소드
}
