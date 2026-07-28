package day01;

public class Exam3 { // class start

    public static void main(String[] args) { // main s

        // [1] 출력함수
        // System(컴퓨터).out(출력객체).print(출력함수)
        // 1. System.out.println(); 출력 후 자동 출바꿈
        System.out.println( "자바안녕1" ); // so+엔터
        // 2. System.out.print(); 출력 줄바꿈 x
        System.out.print( "자바안녕2" );

        // [2] 이스케이프/제어 문자 : \백슬래시 이용한 특수기능
        // \n줄바꿈 , \t들여쓰기 , \' = 작은따옴표 문자로 표현, \" = 큰따옴표문자로표현, \\ = 백슬래시 자체 출력
        System.out.println( "\n자바안녕3\t자바안녕4\"\'\\");

        // 3. System.out.println( "형식" , "자료" )
        // %s : 문자열이 들어갈 자리 , %c : 문자가 들어갈 자리
        // %d : 정수가 들어갈 자리 , %f : 실수가 들어갈 자리
            // %자릿수d : 자릿수 만큼 자리 차지 , 만일 비어있으면 공백 , 오른쪽정렬
            // %-자릿수d : 자릿수 만큼 자리 차지 , 만일 비어있으면 공백 , 왼쪽정렬
            // %0자릿수d : 자릿수 만큼 자리 차지 , 만일 비어있으면 0채움
            // %전체자릿수.소수자릿수f ex) %5.2f 넣고 123.456789치면 총 5자리 123.??이고 소수점 뒤에는 2자리까지니까123.46 5가 아니라 6이냐면 반올림

        System.out.printf( "저는 %s 이고 나이는 %d 입니다" , "유재석",40); // %s 에는 유재석, %d에는 40이 매칭된다.
        System.out.printf( "\n저는 %s 이고 나이는 %6d 입니다\n", "유재석",40); // so + 엔터치면 println으로 나오는데 이거를 printf로 바꾸기
        System.out.printf( "저는 %s 이고 나이는 %-6d 입니다\n" , "유재석",40);
        System.out.printf( "저는 %6s 이고 나이는 %06d 입니다\n" , "유재석",40);
        System.out.printf( "저는 %-6s 이고 나이는 %5.2f 입니다\n" , "유재석",123.456789);


    } // main e

} //class e
