package day08;

public class Exam2 {
    public static void main(String[] args) {
        // [1]
        User u1 = new User(); // 객체 만들기 new 생성자명
        // u1.name = "유재석"; // 직접 접근 불가!
        u1.setName("유재석"); // 간접 접근 허용! 코로나 시절이랑 비슷함 온도체크
        // System.out.println( u1.name ); 불가능
        System.out.println( u1.getName() ); // 가능

        // [2] 객체 출력하면 객체주소값 반환?
        System.out.println(u1);
        // toString메소드가 존재하는 객체는 주소값 대신에


    } // m ed
} // c ed

class User{ // 클래스란? 객체 설계도 종이
    // 1. 멤버변수 = 상태 = private 사용
    private String name;
    private int age;
    // 2. 생성자 = 초기화
    public User(){}

    public User(String naem, int age){
        this.name = name;
        this.age = age;
    }
    // 3. 메소드 = 행위
    // - private 메소드에 대한 간접접근 메소드
    // setter , getter , set멤버변수 , get멤버변수
    // getter만 존재하면 V(value)O(object) 읽기모드 -> 이거 setter 아닌가?
    // setter/getter 존재하면 D(date)T(transfer)O(object) 읽기/쓰기모드
    public void setName( String name ){
        // 추후에 유효성검사 이용하여 원하는 데이터만 저장
        // 유효성 검사 if (name.length() < 1 ){return;} 
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    // - >오른쪽 클릭 -> 소스 작업 -> setter and getter
    public int getage() { return age;} 
    public void getAge(int age){ this.age =age;}

    // 3. toString : 객체호출시 주소값 대신에 문자열 반환
    // -> 오른쪽 클릭 -> 소스 작업 -> toString
    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }

    // DTO: 데이터베이스에 있는 자료를 프론트엔드로 이동DTO 하는 객체 
    //      1. 관례적으로 멤버변수 모두 private
    //      2. setter/getter 제공한다.
    //      3. toString 제공한다.
    //      4. 생성자에 기본생성자1개, 전체매개변수1개 => 2개
    // MVC패턴 : 소규모가 아닌 체계적인 (약속) 규모 필요할 떄 클래스 역할 나누기 
    /*
        V: VIEW 입출력 담당                     HTML/CSS/JS/REACT/FLUTTER
        C: Controller 제어(백엔드/프론트엔트) 중계  JAVA/PYTHON/NODE.JS
        M: Model 데이터 담당                    DTO,VO (CONTROLLER-외부DB/클라우드)
        1인 식당 운영: 사장이 모든 준비를 다함(서빙 , 요리 , 재료관리 등)
        n인 식당 운영: 서빙담당 요리담당 재료담당

        백엔드  ----> 웹개발 HTML/CSSL/JS
              ----> 앱 FLUTTER/REACT NATIVE
              ----> 소프트웨어 C# C
        데이터분석/AI(PYTHON) 연구쪽 설계가 중요함 코드 한줄을 어떻게 할까를 하루종일 고민함
    
    */         


}; // class end