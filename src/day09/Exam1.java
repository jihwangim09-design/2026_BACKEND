package day09;

import java.util.ArrayList;

public class Exam1 {
    public static void main(String[] args) {
        /*
            배열 : 여러개 (동일한타입)자료들을 저장하는 타입, 정적길이
            ArrayList 클래스: 컬렉션(수정) 프레임(틀)워크(일), 자료 수집관련 클래스/기능 제공
                1. 컬렉션(수집) 프레임(틀)워크(일), 자료 수집관련 클래스/기능 재공
                2. 목적: 가변길이, 배열 관련된 기능(메소드) 제공한다. <편리하다>
                3. 사용법
                    ArrayList<제네릭타입> 변수명 = new ArrayList<>();
                    - 제네릭타입: 리스트내 저장할 요소들의 타입, 즉 <String> 리스트에 여러개 String 저장
                    - 주의할점: <제네릭타입>은 기본타입이 불가능하다. int -> integer 래퍼타입( 기본타입을 클래스타입 )
        */
        // 사용법: [1] 리스트 생성
        ArrayList< String > 변수명1 = new ArrayList<>(); // String 타입 여러개 저장하는 리스트
        // 사용법: [2] 리스트 요소 추가
        변수명1.add("유재석");  변수명1.add("강호동");  변수명1.add("신동엽");
        // 사용법: [3] 리스트 전체 출력
        System.out.println( 변수명1 ); // [유재석, 강호동, 신동엽]
        // 사용법: [4] 리스트 중간 삽입
        변수명1.add(1, "하하"); // 1번 인덱스(두번째) 자리에 요소 추가
        System.out.println( 변수명1 ); // [유재석, 하하, 강호동, 신동엽]
        // 사용법: [5] 리스트 요소 수정
        변수명1.set(1, "서장훈");
        System.out.println( 변수명1 ); // [유재석, 서장훈, 강호동, 신동엽]
        // 사용법: [6] 리스트 요소 총개수
        System.out.println( 변수명1.size() ); // 4
        // 사용법: [7] 리스트 특정 요소 출력
        System.out.println( 변수명1.get(1)); // 1번인덱스(두번쨰) 요소 값 호출 // 서장훈
        // 사용법: [8] 리스트 요소 삭제
        변수명1.remove(1); // 1번인덱스(두번쨰) 요소 값 삭제
        System.out.println( 변수명1 ); // [유재석, 강호동, 신동엽]
        // 사용법: [9] 리스트 요소 찾기
        System.out.println( 변수명1.indexOf("강호동")); // '강호동' 찾을값의 인덱스 반환 없으면 -1
        System.out.println( 변수명1.contains("강호동")); // '강호동' 찾을값이 있으면 true 없으면 false
        // 사용법: [10] 반복문과 리스트 관게
        // 1. 일반 for문
        for (int index = 0 ; index <= 변수명1.size() - 1 ; index++){ String str = 변수명1.get(index);}
        // 2. 향상된 for문 , :콜론기준 오른쪽 리스트내 요소 *하나씩* 왼쪽에 (반복)대입
        for ( String str : 변수명1){ } // 오른쪽에 있는 리스트를 왼쪽인 str에 하나씩 대입함 인덱스 사용x
        // 사용법: [11] 리스트 전체 삭제
        변수명1.clear();
        // 사용법: [12] 리스트 요소 여부 확인
        System.out.println( 변수명1.isEmpty()); // 리스트내 요소가 하나도 없으면 true 요소가 비어있는지 확일 할 떄 isEmpty 사용

    } // m ed
} // c ed
