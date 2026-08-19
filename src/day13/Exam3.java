package day13;

import java.util.Arrays;

public class Exam3 {
    public static void main(String[] args) {
        // String 클래스
        // 1. 문자열은 배열이다.
        char str1 = '유'; // char 타입은( ' ' )은 1글자만 가능!
        char[ ] str2 = { '유' , '재' , '석' }; // char 타입의 배열
        String str3 = "유재석"; // String 클래스는 배열의 멤버변수 가짐.
        // 2. 문자 변환 , 아스키코드(일부 특수문자 + 영문 ) + 유니코드(여러개언어지원 한국어포함)
        char str4 = 65; System.out.println(str4); // 65대신에 A가 나옴 아스키코드
        char[] str5 = { 74 , 65 , 86 , 65 }; System.out.println(str5); // JAVA
        char str6 = '유'; System.out.println( (int)str6 ); // 50976 문자열을 다 정수로 표현할수있다.
        // 정수 -char(규칙)-> 문자 -배열-> 문자열
        // 3. 문자열 비교
        // **** == 은 참조 주소를 비교하는거고 equals는 안에 값을 비교함 ****
        System.out.println("유재석" == "유재석" ); // true
        System.out.println( new String("유재석") == "유재석"); // false 래핑에 차이가 있음
        System.out.println( new String("유재석").equals("유재석")); // true
        // 4. 문자열A.concat(문자열B) , 문자열 연결 , 연결된 새로운 문자열 반환 ( 주소값 생성 )
        String str7 = "자바"; String str8 = "프로그래밍";
        System.out.println( str7.concat(str8)); // 자바프로그래밍
        System.out.println( str7 + str8 ); // 자바프로그래밍
        // 5. StringBuilder , append( ) , 문자열(리터럴)은 불변(수정금지)이다. , 빌더주소값 1개지정하여 새로운문자열 연결 3+3 =6 3이 6으로 된게 아니라 6이라는 새로운값이 생김
        StringBuilder builder = new StringBuilder();
        builder.append( str7 );
        builder.append( str8 );
        System.out.println( builder ); // 자바프로그래밍
        // 6. .charAt( 인덱스 ) , 문자 1개 추출
        String str9 = "자바프로그래망"; System.out.println(str9.charAt(2)); // 프
        // 7. .length() : 문자열내 문자 개수 반환
        System.out.println( str9.length() );    // 7
        // 8. .replace( 기존문자 , 새로운문자 ) : 만일 기존문자가 존재하면 새로운문자로 치환하여 밚완
        System.out.println( str9.replace("자바", "JAVA")); // JAVA프로그래망 자바를 JAVA로 바꿈
        // 9. substring( 시작인덱스, [끝인덱스] ) , 시작인덱스 부터 끝인덱스 전까지 문자열 추출
        String str10 = "0123456-12345678";
        System.out.println( str10.substring(6)); // 6번째 인덱스까지 짤림 6-12345678 5까지는 짤리고 그 뒤부터 나옴
        System.out.println( str10.substring(6 , 6)); // 0부터 6전까지 , 012345
        // 10. .split( 기준문자 ) , 기준문자 기준으로 문자열 분해하여 배열 반환
        System.out.println( str10.split("-") ) ; // [Ljava.lang.String;@7ad041f3
        String[ ] strAry = str10.split("-"); // [0]012345 , [1]1230123
        System.out.println( strAry[0] ); // 012345
        System.out.println( strAry[1] ); // 12345678
        // 11. .indexOF(찾을문자) , 만일 찾을 문자가 존재하면 인덱스 , 없으면 -1
        //   . .contains(찾을문자) , 만일 찾을 문자가 존재하면 true , 없으면 -false
        System.out.println( "자바 프로그래밍 언어".indexOf("프로")); // 3
        System.out.println( "자바 프로그래밍 언어".contains("프로")); // true
        // 12. .getBytes() , 문자열내 문자들을 바이트 배열 반환
        byte[ ] strAry2 = "ABC".getBytes();
        System.out.println( Arrays.toString(strAry2)); // "ABC" -->  [ 65 , 66 , 67 ]
        System.out.println( new String( strAry2)); // [65, 66, 67] --> "ABC"
    } // m ed
} // c ed
