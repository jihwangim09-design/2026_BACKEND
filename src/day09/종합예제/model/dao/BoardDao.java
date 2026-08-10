package day09.종합예제.model.dao;

public class BoardDao {
    private BoardDao(){};
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance (){ return instance;}
    // *추후에 MYSQL 서버와연동*
}
