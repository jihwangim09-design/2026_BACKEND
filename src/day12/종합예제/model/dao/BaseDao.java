package day12.종합예제.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
    // 여러개 DAO 클래스들에게 JDBC 연동 인스턴스 상속 
    // 상속을 안하면 Dao 개수만큼 연동코드가 중복이 된다. DB주소나 비번이 바뀌면 DAO클래스 전부 돌아다니면서 수정해야함
    // 1. 연동 정보
    private String url = "jdbc:mysql://127.0.0.1:3306/mydb0813";
    private String user = "root";
    private String password = "1234";
    // 2. 연동 인터페이스 , protected: 상속관계이면 다른패키지도 접근허용 // private은 자식도 안된다??
    protected Connection conn;
    // 3. 연동 메소드
    private void connect(){
        try{    // 3-1: mysql Driver 클래스 로드 한다.
                Class.forName("com.mysql.cj.jdbc.Driver");
                // 3-2: 데이터베이스 서버와 연동 후 성공하면 conn(인터페이스) 대입
                conn = DriverManager.getConnection(url , user, password);
        }catch( Exception e ){System.out.println("DB연동실패" + e);}
    }
    // 4. 기본생성자에 연동메소드 실행 , BaseDAO 클래스로부터 상속받은 DAO들은 자동 connect
    protected BaseDao() { connect(); }

} // class end


