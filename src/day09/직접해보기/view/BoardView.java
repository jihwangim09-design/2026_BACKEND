package day09.직접해보기.view;

import java.util.ArrayList;
import java.util.Scanner;

import day09.직접해보기.controller.BoardController;
import day09.직접해보기.model.dto.BoardDto;

public class BoardView {
    private BoardView(){} // 1.
    private static final BoardView instance = new BoardView(); // 2.
    public static BoardView getInstance( ){ return instance; } // 3. 
    private BoardController bc = BoardController.getInstance(); // * view에서 controller 싱글톤 호출
    private Scanner scan = new Scanner( System.in); // * 모든 메소드에서 사용 가능한 입력객체 
    
    // [*] 메인 입출력
    public void run(){
        while(true){ // 무한루프
            System.out.print("1.대기명단 등록 2.대기명단 전체조회 3.대기명단 수정 4.대기명단 삭제: " );
            int ch = scan.nextInt();
            if( ch == 1 ) { save(); }
            else if( ch == 2 ) { findAll(); }
            else if( ch == 3 ) { update(); }
            
        }
    }

    // [1] 명단 작성 입출력
    public void save( ){
        // 1. 입력받기 
        System.out.print("전화번호: "); String 전화번호 = scan.next();
        System.out.print("방문인원수: "); int 방문인원수 = scan.nextInt();
        // 2. 객체화
        BoardDto boardDto = new BoardDto( 전화번호 , 방문인원수 );
        // 3. 컨트롤러에게 요청하고 응답받기
        boolean result = bc.save( boardDto );
        // 4. 처리한다
        if( result ){ System.out.println("등록성공"); }
        else{ System.out.println("등록실패"); }
    } // f end 

    // [2] 명단 전체 조회 출력 
    public void findAll( ){
        // 1. 컨트롤러로부터 모든 명단을 요청하고 받는다.
        ArrayList<BoardDto> result = bc.findAll();
        // 2. 컨트롤러로부터 받은 모든 명단을 출력한다.
        for( BoardDto board : result ){
            System.out.println( 
                "전화번호: " + board.getPhone() + ", " + "방문 인원수: " + board.getReady() );  
        }
    } // f end 

    // [3] 명단 수정 입출력
    public void update( ){
        System.out.print("찾을 전화번호: "); String 전화번호 = scan.next();
        System.out.print("수정할 방문인원수: "); int 수정인원수 = scan.nextInt();
        
        
        boolean result = bc.update( 전화번호, 수정인원수 );

        if( result ){System.out.println("수정성공");}
        else{System.out.println("수정실패");}
    }

    // [4] 명단 삭제 입출력
    public void delete( ){
        System.out.println("찾을 전화번호: "); String 전화번호 = scan.next();
        System.out.println("삭제할 방문인원수: "); int 삭제인원수 = scan.nextInt();

        boolean result = bc.delete( 전화번호, 삭제인원수 );

        if( result ){System.out.println("삭제성공");}
        else{System.out.println("삭제실패");}
    }

} // class end 