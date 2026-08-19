package day13;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.naming.InvalidNameException;

public class Exam2 {
    public static void main(String[] args) {
        // [1] 래퍼 클래스: 기본타입 --> 참조타입 표현, 참조타입은 상태/기능 갖는다.
        int value1 = 100;   // System.out.println( value1.toString ); 에러남
        Integer value2 = 100;  System.out.println( value2.toString() );
        // 즉 기본타입은 기능이 없으니까 참조타입으로 변환해서 기능 사용하자
        // 1. 언박싱과 오토박싱
        int value3 = value2;            // Interger(참조) --> int(기본) 변환 랩으로 포장한것을 풀어준다? 기본타입 8가지가 가능하다 < 언박싱 >
        Integer value4 = value1;        // int(기본) --> Integer(참조)  변환 < 오토박싱 >
        // 2. 타입변환( csv, excel, api, python, json, xml 등등 )
        // XXXX.parseXXX( 문자열 ) , 유사(JDBC): rs.getXXX(. ) = 데이터베이스에있는거를 자바로 바꾸는게 rs.getXXX임
        int valus5 = Integer.parseInt("100"); // "100" --> 100 , 스프링은자동
        double vlaue6 = Double.parseDouble("3.14"); // "3.14" --> 3.14
        boolean vlaue7 = Boolean.parseBoolean("true"); // "true" --> true
        // 기본타입 --> 문자열 변환 , String.valueOf( 리터럴 )
        String s1 = 100+""; // 공백없이 문자열 더하기 , 100 -> "100"
        String s2 = String.valueOf(100); // 100 -> "100"
        
        // [2] 날짜/시간 클래스
        // 1. 현재 날짜 가져오기
        LocalDate localDate = LocalDate.now(); // now가 스태틱(정적)메소드라서 new를 안쓴다?
        System.out.println( localDate ); // 2026-08-19
        // 2. 현재 시간 가져오기
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 11:07:48.001959
        // 3. 현재 날짜/시간 가져오기
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // 2026-08-19T11:08:45.463945
        // 4. 정해진 날짜/시간 객체 생성 LocalDateTime.of( 연도,월,일,시,분,초 ): 오버로딩(매개변수 개수에 따른 메소드 여러개)
        LocalDateTime localDateTime2 = LocalDateTime.of( 2026 , 8 , 19 , 11 ,11 , 30 );
        System.out.println(localDateTime2); // 2026-08-19T11:11:30
        // 5. 정해진 형식으로 날짜/시간 표현 , DateTimeFormatter.ofPattern(패턴);
        // 패턴: y연도 M월 d일 h시 m분 s초 , 날짜/시간객체.format( 패턴객체 );
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "y년M월d일 h시m분s초"); // y년MM월d일 h시mm분s초 이렇게 두개를 넣으면 8이 아니라 08로 나옴 
        System.out.println( localDateTime2.format( formatter ) );
        // 6. 날짜 계산 , 날짜/시간객체.plusXXX( 숫자 ) , 날짜/시간객체.minusXXX( 숫자 )
        LocalDateTime result = localDateTime2.plusDays(20);
        System.out.println( result ); // 2026-08-29T11:11:30        20일 증가시키면 2026-09-08T11:11:30 이렇게 나옴 달이 바뀜
        LocalDateTime result2 = localDateTime2.minusDays(20);
        System.out.println( result2 ); // 2026-07-30T11:11:30
        // 7. 특정한 날짜/시간 추출 , .getXXX()
        System.out.println( localDateTime2.getYear() ); // 연도 2026
        System.out.println( localDateTime2.getMonth() ); // .getMonth() 영문 AUGUST
        System.out.println( localDateTime2.getMonthValue() ); // .getMonthValue() 정수 8
        System.out.println( localDateTime2.getDayOfMonth() ); // 19
        System.out.println( localDateTime2.getSecond() ); // 30
        
        // DTO: 포장(래퍼), 정보 많으니까  쇼핑하면 쇼핑백에 담음 왜 많으니까
    } // m ed
} // c ed
