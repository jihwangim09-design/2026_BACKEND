package day09.종합예제.view;

import day04.test;
import day09.종합예제.controller.BoardController;

public class BoardView {
    private BoardView(){};
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){ return instance;}
    private BoardController bc = BoardController.getInstance(); // *view에서 controller 싱글톤 호출*
}
