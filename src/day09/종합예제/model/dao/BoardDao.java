package day09.종합예제.model.dao;

public class BoardDao {
    private BoardDao(){};
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getinstance (){ return instance;}
}
