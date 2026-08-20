package day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam2 {
    public static void main(String[] args) {
        // 제네릭: 클래스내 타입들을 인스턴스 생성시 정한다.
        /*
            컬렉션(수집)프레임(틀)워크(일)
                - 정의: 데이터 수집(목록) 하는 자료구조(방법) 미리 만들어둔 인터페이스/클래스들 
                - 목적: 복잡한 자료들을 편리하게 제공받아 사용
                - 종류
                    List 인터페이스 :   구현체: ArrayList,Vector,LinkedList,Stack 등
                    Set 인터페이스 :    구현체: HashSet, TreeSet 등
                    Map 인터페이스 :    구현체: HashMap, HashTable, TreeMap 등
                * 인터페이스란? 서로 다른 클래스들을 하나의 타입으로 조작
                * 구현체란? 인터페이스내 추상메소드 구현한 클래스들을
                * 다형성이란? (캐스팅) 하나의 자료가 서로 다른 타입으로 변환 
        */

        // [1] List 인터페이스
        ArrayList<String> list1 = new ArrayList<>();
        // list1 = new LinkedList(); // 불가능~ // 형제끼리 타입변환 불가능. 
        List<String> list2 = new ArrayList<>();
        list2 = new LinkedList<>(); // 다형성!!


        // [2] List 인터베이스 타입으로 구현체 메소드 사용가능 < day09 Exam1 > 가능한 이유는 오버라이딩 
        list2.add("유재석");
        System.out.println( list2.get(0));


    } // m ed
} // c ed
