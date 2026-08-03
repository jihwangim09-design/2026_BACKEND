package day04;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Practice6 {
    Scanner scan = new Scanner(System.in)
    public static void main(String[] args) {
    
    // 1. 타입[ ] 변수명 = (값1, 값2 ,값3) , 배열변수[인덱스]
    int[ ]bumbers1 = { 10, 20, 30, 40 ,50 }; System.out.println(bumbers1[2]);

    // 2. 타입[ ] 변수명 = new 타입[ 총개수 ];
    String[] season = new String[ 3 ];
    season[0] = "봄";  season[1] = "여름";  season[2] = "가을";
    System.out.println( Arrays.toString(season));

    // 3. for vs 향상된 for문
    String[] fruits = {"사과", "바나나", "포도", "딸기"};
    for ( int index = 0 ; index <= fruits.length - 1 ; index++) {
        System.out.println( fruits[index]);
    }

    // VS
    for( String str : fruits ){System.out.println( str );}

    // 4.
    int[] scores1 = { 85, 92, 78, 65, 95 };
    int 합계4 = 0;
    for (int score : scores1 ){ // : 콜론 기준으로 오른쪽에 배열, 왼쪽에는 타입 반복변수명 
        합계4 += score;    
    }
    System.out.printf("합계: %d , 평균: %f \n" , 합계4 , 합계4 /scores1.length );

    // 5. 
    int[] scores2 = {77, 82, 100, 54, 96};
    for ( int q = 0 ; q <= scores2.length - 1 ; q++){
        if ( scores2[q] == 100 ) {
            System.out.println("100점 만점자를 찾았습니다!");
            break;
        }
    }

    // 6.

    // 7.

    // 8.

    // 9.

    // 10.

    // 11.

    // 12.

    // 13.

    // 14.






    }
}
