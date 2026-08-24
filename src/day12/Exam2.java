package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            // 1. insert 하기
            String sql = "insert into test( name ) values('유재석') "; // 자바 문자열에  SQL 작성(자동완성 안된다.)
            PreparedStatement ps = conn.prepareStatement(sql); 
            // conn(연동된인터페이스).prepareStatement( 기재할SQL ); , 기재된 인터페이스 표현
            // PreparedStatement( SQL이 기재된 인터페이스 )
            int result = ps.executeUpdate(); // ps.executeUpdate() , ( SQL기재된 인터페이스에서 SQL 실행),
            System.out.println( result ); // 1:성공 , 0:실패
            System.out.println("레코드 등록 성공");
            // 2. select 하기 , select 필드명 from 테이블명;
            String sql2 = "select * from test";
            PreparedStatement ps2 = conn.prepareStatement(sql2); // 작성한 SQL 기재한다. 
            ResultSet rs = ps2.executeQuery(); // 기재된 SQL 실행 , 결과물 rs(ResultSet) 인터페이스 대입
            rs.next(); // 커서를 다음 레코드로 이동 시킴 왜 하냐면 
            // 커서 시작 위치
            // no=1, name=유재석
            // no=2, name=박명수 이렇게 되있어서 커서를 다음행(첫번째)로 넘겨야 리턴값이 나옴
            System.out.println(rs.getInt("no")); //rs.get타입("속성명");
            System.out.println(rs.getString("name")); //rs.get타입("속성명");
            System.out.println("레코드 조회 성공");


        }catch( ClassNotFoundException e ){
            System.out.println("드라이버가 존재하지 않습니다."+ e); // 라이브러리 설치 안함
        }catch( SQLException e ){
            System.out.println("DB서버와 연동 실패했다." + e);
        }
    }
    
}
