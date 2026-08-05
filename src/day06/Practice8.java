package day06;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        
    // 1.
    Book b1 = new Book("이것이 자바다", "신용권", 30000);
    Book b2 = new Book("자바의 정석", "남궁성", 28000);
    

    // 2.

    // 3.

    // 4.

    // 5.

    } // m ed
} // c ed
class Book{

    // 1.멤버변수
    String title;
    String author; 
    int price;
    // 2.생성자 : 
    // 자동 : 클래스내 빈공간 오른쪽 -> 소스 작업 -> constructor -> 멤버변수 체크 -> [확인]
    Book( String title , String author , int price ) {
    this.title = title; // this는 멤버변수를 의미함.
    this.author = author;
    this.price = price;
    }
}
    
