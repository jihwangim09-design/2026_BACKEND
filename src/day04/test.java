package day04;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        
        // [1] 배열
        int [ ] array = new int [0]; // 0개 저장 가능한 배열

        // [2] 배열내 꼬리(마지막인덱스)에 요소 추가 , array.length-1
        array[ array.length - 1 ] = 30;  // index - 1 out of bounds for length 0 = 즉 인데스 없다ㄷ.

        // [3] 현재 배열내 +1 증가한 새로운 배열 만들기 , 
        int[] newArray = new int [ array.length + 1 ];

        // [*] 기존배열내 요소들의 값들을 새로운배열에 복사 -> 이동
        for ( int index = 0 ; index <= array.length - 1; index ++) {
            newArray[index] - array[index]; //오른쪽 기존배열 index값을 왼쪽 새로운 배열 index에 대입
        }

        // [4] [2] 반복
        newArray[ newArray.length - 1 ] = 30;

        // [5] 기존배열변수에 새로운 배열 대입
        array = newArray;

        // [*] 
        System.out.println(Arrays.toString (array) );
    } // m ed

}// c ed
