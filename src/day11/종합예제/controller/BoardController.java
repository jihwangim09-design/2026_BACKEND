package day11.종합예제.controller;

import java.util.ArrayList;

import day11.종합예제.model.dao.BoardDao;
import day11.종합예제.model.dao.IBaseDao;
import day11.종합예제.model.dto.BoardDto;
import day11.종합예제.model.dto.ProductDto;

public class BoardController {
    private BoardController() {}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance() { return instance; }

    private IBaseDao ib = BoardDao.getInstance();


    // TODO 1: boardDto 전달받아 DAO의 save()를 호출하고 결과 반환
    public boolean save(BoardDto boardDto) {
        return ib.save(boardDto);
    }

    // TODO 2: DAO의 findAll() 호출하여 결과 반환
    public ArrayList<BoardDto> findAll() {
        ArrayList<BoardDto> list = new ArrayList<>();
        for (Object obj : ib.findAll()) {
            list.add((BoardDto) obj);
        }
        return list;
    }

}