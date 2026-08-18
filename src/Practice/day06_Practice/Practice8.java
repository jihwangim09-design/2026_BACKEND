package Practice.day06_Practice;


import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        
    // 1.
    Book b1 = new Book("이것이 자바다", "신용권", 30000);
    Book b2 = new Book("자바의 정석", "남궁성", 28000);
    System.out.println(b1.title + "," + b1.author + "," + b1.price);
    System.out.println(b2.title + "," + b2.author + "," + b2.price);
    // 2.
    Rectangle r1 = new Rectangle(10, 5);
    System.out.println(r1.width + "," + r1.heigth);

    // 3.
    BankAccount B1 = new BankAccount("111-222-3333", "유재석", 10000);
    System.out.println(B1.accountNumber + "," + B1.awnerName + "," + B1.balance);

    // 4.
    Goods G1 = new Goods();
    System.out.println(G1.name + "," + G1.price);
    Goods G2 = new Goods("콜라", 2000);
    System.out.println();

    // 5.
    Member m = new Member();
    System.out.println("id: " + m.id);
    System.out.println("isLogin: " + m.isLogin);


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

class Rectangle{
    double width;
    double heigth;

    Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }
}

class BankAccount{
    String accountNumber;
    String awnerName;
    int balance;

    BankAccount(String accountNumber, String awnerName, int balance) {
    this.accountNumber = accountNumber;
    this.awnerName = awnerName;
    this.balance = balance;
    }
}

class Goods{
    String name;
    int price;

    Goods(){
        name = "미정";
        price = 0;
    }

    Goods(String name , int price) {
        this.name = name;
        this.price = price;
    }

}

class Member{
    String id;
    boolean isLogin;
    
    Member(){
        id = "guset";
        isLogin = false;
    }
}
    
