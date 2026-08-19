package day13;

import java.util.Random;

public class Exam4 {
    public static void main(String[] args) {
        
        // [1] 난수 클래스 
        // 1. 랜덤 객체
        Random random = new Random();
        // 2. 랜덤 생성 , .nextXXX( )
        int value1 = random.nextInt(); System.out.println( value1 ); // -1157105229
        int value2 = random.nextInt(10); System.out.println( value2 ); // 0~9 난수를 생성
        



    } // m end
} // c ed
