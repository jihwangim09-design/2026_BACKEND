package day12.종합예제.controller;

import java.util.ArrayList;

import day12.종합예제.model.dao.BoardDao;
import day12.종합예제.model.dto.BoardDto;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){ return instance; }
    //[*] MVC패턴 흐름의 dao 싱글톤 호출
    private BoardDao bd = BoardDao.getInstance();

    // [1] 등록 Controller
    public boolean save( BoardDto boardDto ){
        boolean result = bd.save( boardDto );
        return result;
    }

    // [2] 전체조회 Controller
    public ArrayList<BoardDto> findAll(){
        ArrayList<BoardDto> result = bd.findAll();
        return result;
    }

    // [3] 개별수정 Controller 
    public boolean update( BoardDto boardDto ){
        return bd.update( boardDto );
    }

    
    // [4] 개별삭제 Controller
    public boolean delete( int no ){
        return bd.delete( no );
    }
}