package day13;

import java.util.Random;
import java.util.UUID;

public class Exam4 {
    public static void main(String[] args) {
        
        // [1] Random, 난수 클래스 , 활용처: 인증번호, 추첨 등
        // 1. 랜덤 객체
        Random random = new Random();
        // 2. 랜덤 생성 , .nextXXX( ) , .nextXXX( 개수 ) + 시작번호
        int value1 = random.nextInt(); System.out.println( value1 ); // -1157105229
        int value2 = random.nextInt(10); System.out.println( value2 ); // 0~9 난수
        int value3 = random.nextInt(10) + 1 ; // 1~10사이에 난수     뒤에 1이 시작값 원래 0인데 1부터 시작함
        boolean value4 = random.nextBoolean(); System.out.println( value4 ); // true or false 난수
        // [2] UUID, 범용 고유 식별자, 절대로 중복없는 난수 생성 , 활용처: 회원번호/파일식별 등
        // !!!!! new 쓰고 안쓰고 차이 Random은 생성자(Constructor)방식을 사용했고, UUID는 정적 메서드(Static Method)를 사용했기때문 !!!!!
        String uuid = UUID.randomUUID().toString();
        System.out.println( uuid ); // 179a5134-77a6-45ac-b44b-a86ebbd0aa48



    } // m end
} // c ed
