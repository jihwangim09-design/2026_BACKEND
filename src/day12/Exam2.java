package day12;

import java.sql.DriverManager;

public class Exam2 {
    public static void main(String[] args) {
        // JDBC 란 ? 자바와 데이터베이스 연동 제공하는 인터페이스
        // 1. 프로젝트내 lib 폴더에 'mysql-connector-j-26.7.0.jar' 파일 저장한다.
        // [연동]
        // [1] MYSQL 회사에서 제공하는 Driver 구현체 (동적) 로드 *예외처리 필수*
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver 연동성공");
            //[2] 데이터베이스 서버 연동
            // DriverManager.getConnection( "jdbc:mysql://ip번호:3306/데이터베이스명" , "계정명" , "비밀번호" )
        }catch( ClassNotFoundException e ){
            System.out.println("드라이버가 존재하지 않습니다."+e); // 라이브러리 설치 안함
        }
    }
    
}
