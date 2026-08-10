package day09.종합예제.controller;

public class BoardController {
    private BoardController(){};
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){ return instance;}
}
