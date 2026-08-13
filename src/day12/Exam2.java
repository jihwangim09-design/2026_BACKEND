package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exam2 {
    public static void main(String[] args) {
        // JDBC 란 ? 자바와 데이터베이스 연동 제공하는 인터페이스
        // 1. 프로젝트내 lib 폴더에 'mysql-connector-j-26.7.0.jar' 파일 저장한다.
        // [연동]
        // [1] MYSQL 회사에서 제공하는 Driver 구현체 (동적) 로드 *예외처리 필수*
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver 연동성공");
            //[2] 데이터베이스 서버 연동 * 예외처리 필수 *
            // DriverManager.getConnection( "jdbc:mysql://ip번호:3306/데이터베이스명" , "계정명" , "비밀번호" )
            String url = "jdbc:mysql://127.0.0.1:3306/mydb0813";
            String user = "root"; String password = "1234";
            Connection conn = DriverManager.getConnection( url , user , password ); // DriverManager가 구현체 
            // [3] 데이터베이스 내 DML(insert,select,update,delete) 조작
            System.out.println("데이터베이스 연동성공");
        }catch( ClassNotFoundException e ){
            System.out.println("드라이버가 존재하지 않습니다."+ e); // 라이브러리 설치 안함
        }catch( SQLException e ){
            System.out.println("DB서버와 연동 실패했다." + e);
        }
    }
    
}
