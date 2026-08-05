package day06;

public class Exam1 {
    public static void main(String[] args) {
        /*
            생성자 : 인스턴스(객체) 생성할 때 사용되는 키워드
            선언하는 방법
                1) 클래스 내부
                2) 클래스명과 동일 , 만일 다르면 메소드명과 동일해짐
                3) 오버로딩 지원: 동일한 이름으로 여러개 선언 , 조건
            목적 : 1) 빠른 초기화 2) 객체생성 규칙/유효성검사
            종류 : 1) 기본생성자(매개변수없는) 2) 매개변수있는생성자 

        */

        // [1] 기본생성자로 객체 생성 , new 생성자명() [new 뒤에 오는게 생성자명임 ]
        Phone p1 = new Phone( ); // new Phone( )에서 Phone이 생성자명
        p1.model = "갤럭시"; // 객체내 멤버변수 초기화
        
        // [2] 정의생성자로 객체 생성 , new 생성자명( 값1 , 값2 );
        Phone p2 = new Phone("아이폰", "파랑");

        // [3] 정의생성자로 객체 생성
        Phone p3 = new Phone("갤럭시탭", "블랙", 36000);





    } // m ed

} // c ed 

class Phone{
    // 선언되는 변수 위치에 따라 이름이 다르다
    // 1)지역변수 : if/for/func(함수) { }안에서 선언된 변수
    // 2)멤버변수 : 클래스/설계도{ }안에서 선언되고 객체(인스턴스)내 변수
    //          this: 해당 생성자/메소드 호출한 객체(인스턴스) 가리킴
    // 3)매개변수 : 생성자/메소드 호출하면서 인수값들을 저장하는 변수
    // *** 클래스 가족(멤버들) ***
    // 1. 멤버변수
    String model;
    String color;
    int price;
    // 2. 생성자
    // 생성자가 1개 없으면 *자동으로 기본생성자 생성* 
    // 생성자명은 중복이 안된다. 
    //     -> 오버로딩(매개변수 계수/타입/순서 다르면) 중복 가능
    // this란? 멤버변수식별,
    //     -> 매개변수명이랑 멤버변수명 같을 경우 멤버변수명 앞에 this
    // 매개변수와 인자값의 타입/개수는 일치해야함
    // 메소드와 다르게 생성자는 반환이 없다. ( 생성된 객체 주소값 ) retrun; 쓰지마셈
    // 1) 기본생성자 : 매개변수가 없는
    Phone( ){ }     // Phone( ){ } = 얘를 기본 생성자라고 함
    // 2) 정의생성자 : 매개변수가 있는
    Phone( String model, String color ){
        this.model = model; // 왼쪽 model이 멤버변수 , 오른쪽 model이 매개변수 매개변수 이름을 model이라고 지어서 둘다 매개변수로 model로 인식하기 때문에 this를 붙힘
        this.color = color;
    }
    // 3)
    Phone( String model, String color , int 가격 ){
        this.model = model;
        this.color = color;
        price = 가격;
    }


    // 3. 메소드/함수

}
