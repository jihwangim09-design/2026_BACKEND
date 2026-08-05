package day05;

import java.util.Scanner;

import javax.script.ScriptContext;

public class Practice7 {
    public static void main(String[] args) {
    
    // [1] 객체 생성
    // 3. new 생성자명();
    // 3. 타입 변수명 = new 생성자명();



    Scanner scan = new Scanner(System.in);
    
    // 1. 
    Book b1 = new Book();
    Book b2 = new Book();
    b1.title = "이것이 자바다"; b1.author = "신용권"; b1.price = 30000;
    b2.title = "자바의 정석"; b2.author = "남궁석"; b2.price = 28000;
    System.out.printf("%s %s %d \n" , b1.title , b1.author , b1.price );
    System.out.printf("%s %s %d \n" , b2.title , b2.author , b2.price );

    // 2.
    Pet p1 = new Pet();
    Pet p2 = new Pet();
    p1.name = "초코"; p1.specie = "푸들"; p1.age = 3;
    p2.name = "나비"; p2.specie = "코리안숏헤어"; p2.age = 5;
    System.out.printf( " 이름: [%s] 종류: [%s] 나이: [%d]살 \n" , p1.name , p1.specie , p1.age );
    System.out.printf( " 이름: [%s] 종류: [%s] 나이: [%d]살 \n" , p2.name , p2.specie , p2.age );

    // 3.
    Rectangle R1 = new Rectangle();
    R1.width = 10;
    R1.height = 5;
    System.out.printf( "사각형의 넓이: [%d] \n" , R1.width*R1.height ); 

    // 4.
    BankAccount B1 = new BankAccount();
    B1.accountNumber = "111-2222-3333";
    B1.ownerName = "유재석";
    B1.balance = 10000;
    B1.balance += 5000;
    System.out.printf("입금 후 잔액: [%d] \n" , B1.balance);
    B1.balance -= 3000;
    System.out.printf("출금 후 잔액: [%d] \n" , B1.balance);

    // 5.
    Product P1 = new Product();
    Product P2 = new Product();
    P1.name = "새우깡"; P1.price = 1500;
    P2.name = "콜라"; P2.price = 2000;
    if ( P1.price > P2.price ) {
        System.out.printf(P1.name);
    }else {System.out.println(P2.name);};

    // -- [6] 클래스생성시 주의할점;
    // -- 1) 동일한 패키지(내) 동일한 클래스명은 중복 불가능
    // -- src(개발자코드 . java) ---> bin(컴파일/번역코드 .class)
    // -- 2) 첫글자는 대문자 시작
    // -- 3) 클래스 1개 당 .java 파일 1개 관리 권장 (*디자인패턴*)

    // 6.
    Member M1 = new Member();
    M1.id = "admin";
    M1.isLogin = false;
    System.out.printf("로그인 전 상태: [%b] \n" , M1.isLogin);
    M1.isLogin = true;
    System.out.printf("로그인 후 상태: [%b] \n" , M1.isLogin);


    // 7. 타입(자료형)이란? 자료의 구분
    // 자료란? 데이터들, 리터럴/상수 ( 3 , 3.14 , 'A' , true )
    // 기본타입8가지 vs 참조타입(배열,객체)
    Television T1 = new Television();
    T1.channel = 7;
    T1.volume = 20;

    T1.channel = 11;
    T1.volume = T1.volume - 2;
    System.out.printf("채널: [%d] 볼륨: [%d] \n", T1.channel , T1.volume); 

    // 8.
    Player Pl1 = new Player();
    Player Pl2 = new Player();
    Pl1.name = "손흥민"; Pl1.power = 90; Pl1.speed = 95;
    Pl2.name = "이강인"; Pl2.power = 85; Pl2.speed = 92;
    if (Pl1.power + Pl1.speed > Pl2.power + Pl2.speed) {
        System.out.printf(Pl1.name);
    }else{System.out.println(Pl2.name);}

    // 9.
    MenuItem Me1 = new MenuItem();
    MenuItem Me2 = new MenuItem();
    MenuItem Me3 = new MenuItem();
    Me1.name = "김치찌개"; Me1.price = 8000; Me1.isSignature = true;
    Me2.name = "된장찌개"; Me2.price = 8000; Me2.isSignature = false;
    Me3.name = "계란찜"; Me3.price = 3000; Me3.isSignature = false;
    if (Me1.isSignature == true) {
        System.out.printf("대표메뉴: [%s] 가격: [%d] \n" , Me1.name , Me1.price );
    }
    if (Me2.isSignature == true) {
        System.out.printf("대표메뉴: [%s] 가격: [%d] \n" , Me2.name , Me2.price );
    }
    if (Me3.isSignature == true) {
        System.out.printf("대표메뉴: [%s] 가격: [%d] \n" , Me3.name , Me3.price );
    }
    // 10.
    UserProfile U = new UserProfile();
    System.out.println("이름: "); String 이름 = scan.next();
    System.out.println("나이: "); int 나이 = scan.nextInt();
    System.out.println("MBTI: "); String MBTI = scan.next();
    System.out.println("--- 프로필 ---");
    System.out.println("이름: " + 이름);
    System.out.println("나이: " + 나이);
    System.out.println("MBTI: " + MBTI);

    } // m end
} // c end
// [1] 객체 선언
// 1. 클래스선언 : 기존 class{ } 밖에 새로운 클래스선언{ }
// 2. 멤버변수선언 : {} 안에 멤버변수 선언
class Book{
    String title;
    String author;
    int price;
}
class Pet{
    String name;
    String specie;
    int age;
}
class Rectangle{
    int width;
    int height;
}
class BankAccount{
    String accountNumber;
    String ownerName;
    int balance; 
}
class Product{
    String name;
    int price;
}
class Member{
    String id;
    Boolean isLogin;

}
class Television{
    int channel;
    int volume;
}
class Player{
    String name;
    int power;
    int speed;
}
class MenuItem{
    String name;
    int price;
    boolean isSignature;
}
class UserProfile{
    String name;
    int age;
    String mbti;
}




/*[문제 1] Book 클래스를 만드세요. 이 클래스는 title(문자열), author(문자열), price(정수) 멤버 변수를 가집니다.
1. main 함수에서 Book 객체 2개를 생성하세요.
2. 첫 번째 객체에는 "이것이 자바다", "신용권", 30000을, 두 번째 객체에는 "자바의 정석", "남궁성", 28000을 각각 저장하세요.
3. 두 객체의 모든 정보를 각각 출력하세요.*/

/*[문제 2] Pet 클래스를 만드세요. name(문자열), species(문자열, 품종), age(정수) 멤버 변수를 가집니다.
1. main 함수에서 Pet 객체 2개를 생성하세요.
2. 첫 번째 객체에는 "초코", "푸들", 3을, 두 번째 객체에는 "나비", "코리안숏헤어", 5를 각각 저장하세요.
3. "이름: [이름], 종류: [품종], 나이: [나이]살" 형식으로 각 반려동물의 프로필을 출력하세요.*/

/*[문제 3] Rectangle 클래스를 만드세요. width(정수)와 height(정수) 멤버 변수를 가집니다.
1. main 함수에서 Rectangle 객체를 하나 생성하고, width에 10, height에 5를 저장하세요.
2. 해당 객체의 width와 height 값을 곱하여 "사각형의 넓이: [넓이]"를 출력하세요.*/

/*[문제 4] BankAccount 클래스를 만드세요. accountNumber(문자열), ownerName(문자열), balance(정수, 잔액) 멤버 변수를 가집니다.
1. main 함수에서 BankAccount 객체를 하나 생성하고, 계좌번호는 "111-222-3333", 예금주는 "유재석", 초기 잔액은 10000으로 저장하세요.
2. balance에 5000을 더하여 입금 상황을 구현하고, "입금 후 잔액: [잔액]"을 출력하세요.
3. 다시 balance에서 3000을 빼서 출금 상황을 구현하고, "출금 후 잔액: [잔액]"을 출력하세요.*/

/*[문제 5] Product 클래스를 만드세요. name(문자열)과 price(정수) 멤버 변수를 가집니다.
1. main 함수에서 Product 객체 2개를 생성하고, 각각 "새우깡", 1500과 "콜라", 2000 정보를 저장하세요.
2. if문을 사용하여 두 객체의 price를 비교하고, 더 비싼 상품의 이름을 출력하세요.*/

/*[문제 6] Member 클래스를 만드세요. id(문자열)와 isLogin(boolean) 멤버 변수를 가집니다.
1. main 함수에서 Member 객체를 하나 생성하고, 아이디는 "admin", isLogin은 false로 초기화하세요.
2. "로그인 전 상태: [isLogin 값]"을 출력하세요.
3. 객체의 isLogin 값을 true로 변경하여 로그인 상황을 구현하세요.
4. "로그인 후 상태: [isLogin 값]"을 출력하세요.*/

/*[문제 7] Television 클래스를 만드세요. channel(정수)과 volume(정수) 멤버 변수를 가집니다.
1. main 함수에서 Television 객체를 생성하고, channel은 7, volume은 20으로 초기화하세요.
2. 객체의 channel 값을 11로 변경하고, volume 값은 2 감소시킨 뒤, 변경된 채널과 볼륨을 출력하세요.*/

/*[문제 8] Player 클래스를 만드세요. name(문자열), power(정수), speed(정수) 멤버 변수를 가집니다.
1. main 함수에서 Player 객체 2개를 생성하세요.
2. 첫 번째 객체에는 "손흥민", 90, 95를, 두 번째 객체에는 "이강인", 85, 92를 각각 저장하세요.
3. 두 객체의 power와 speed의 합을 각각 계산하고, 합이 더 높은 선수의 이름을 출력하세요.*/

/*[문제 9] MenuItem 클래스를 만드세요. name(문자열), price(정수), isSignature(boolean, 대표메뉴 여부) 멤버 변수를 가집니다.
1. main 함수에서 MenuItem 객체 3개를 생성하고, 첫 번째는 "김치찌개", 8000, true, 두 번째는 "된장찌개", 8000, false, 세 번째는 "계란찜", 3000, false로 저장하세요.
2. if문을 사용하여 isSignature가 true인 메뉴 객체를 찾아, "[대표메뉴] [메뉴이름] : [가격]원" 형식으로 출력하세요.*/

/*[문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열) 멤버 변수를 가집니다.
1. main 함수에서 UserProfile 객체를 하나 생성하세요.
2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 순서대로 입력받으세요.
3. 입력받은 값들을 생성된 객체의 각 멤버 변수에 저장하세요.
3. 모든 정보가 저장된 객체의 멤버 변수들을 가져와 "--- 프로필 ---", "이름: [이름]", "나이: [나이]", "MBTI: [MBTI]" 형식으로 출력하세요.*/
