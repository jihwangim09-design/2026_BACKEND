package day09.종합예제.view;

import day04.test;

public class BoardView {
    private BoardView(){};
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){ return instance;}
}
