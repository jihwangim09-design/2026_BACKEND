package day09.직접해보기.model.dao;

import java.util.ArrayList;
import day09.직접해보기.model.dto.BoardDto;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){ return instance; }
    // * 데이터베이스 대신에 ArrayList 사용하여 데이터베이스 표/데이터 역할 * 
    // * 추후에 MYSQL 서버와 연동 *
    private ArrayList< BoardDto > boardList = new ArrayList<>(); 

    // [1] 명단 작성 로직 
    public boolean save( BoardDto boardDto ){
        // 1. controller 으로 부터 저장할 정보 객체 받는다.
        // * 추후에 insert 이용한 db에 저장
        // 2. 리스트에 저장
        boardList.add( boardDto );
        // 3. 성공반환
        return true;
    }
    
    // [2] 명단 전체 조회 로직
    public ArrayList<BoardDto> findAll( ){
        // 1. controller 에게 매개변수 받는다.현재는 없음
        // * 추후에 select 이용한 db 조회
        // 2. 리스트 전체 반환
        return boardList;
    }
    // [3] 명단 수정
    public boolean update(String phone, int newReady){
        for(BoardDto dto : boardList){
            if(dto.getPhone().equals(phone)){   
                dto.setReady(newReady);          
                return true;
            }
        }
        return false;
    }
    // [4] 명단 삭제
    public boolean delete(String phone){
        for(BoardDto dto : boardList){
            if(dto.getPhone().equals(phone)){
                boardList.remove(dto);
                return true;
            }
        }
        return false;
    }

} // class end 