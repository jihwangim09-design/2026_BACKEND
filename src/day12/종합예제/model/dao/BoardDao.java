
package day12.종합예제.model.dao;

import java.sql.DriverManager;

public class BoardDao extends BaseDao {
    private BoardDao(){} // 이게 호출되면 자동으로 super()가 실행되서 protected BaseDao() { connect(); } 이거를 실행하고 
// connect();를 실행하면 
// private void connect(){
//  try{// 3-1: mysql Driver 클래스 로드 한다.
//  Class.forName("com.mysql.cj.jdbc.Driver");
//  // 3-2: 데이터베이스 서버와 연동 후 성공하면 conn(인터페이스) 대입
//  conn = DriverManager.getConnection(url , user, password);
//  }catch( Exception e ){System.out.println("DB연동실패" + e);}
// } 이거를 실행해서 자동 연동이 된다.
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){ return instance; }
}