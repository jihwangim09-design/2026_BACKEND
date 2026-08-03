package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        
        // 1. 타입[] 변수명 = { 값1 , 값2 , 값3 } , 배열변수[인덱스]
        int[ ] numbers1 = { 10, 20, 30, 40, 50 }; System.out.println( numbers1[2] );

        // 2. 타입[] 변수명 = new 타입[ 총개수 ];
        String[ ] season = new String[ 3 ];
        season[0] = "봄";   season[1] = "여름";     season[2] = "가을";
        System.out.println( Arrays.toString(season) );

        // 3. for vs 향상된for문 
        String[ ] fruits = {"사과", "바나나", "포도", "딸기"};
        for( int index = 0 ; index <= fruits.length - 1 ; index++ ){ System.out.println( fruits[index] ); } 
        // vs
        for( String str : fruits ){ System.out.println( str ); }

        // 4. 배열변수명.length : 배열내 요소총길이 , 자동타입변환 : 연산시 두 항의 자료타입중 더 큰 타입으로 결과
        int[ ] scores1 = {85, 92, 78, 65, 95};
        int 합계4 = 0;
        for( int score : scores1 ){ // :콜론 기준으로 오른쪽에 배열 , 왼쪽에는 타입 반복변수명 
            합계4 += score;
        }
        System.out.printf( "합계: %d , 평균: %f \n" , 합계4 , 합계4 / (double)scores1.length ); // 5 -> 5.0

        // 5.
        /* 
        int[] scores2 = {77, 82, 100, 54, 96}; 
        for ( int q = 0 ; q <= scores2.length - 1 ; q++){ 
            if ( scores2[q] == 100 ) { System.out.println("100점 만점자를 찾았습니다!"); break; } 
        }
        */
        //vs
        int[] scores2 = {77, 82, 100, 54, 96}; 
        for ( int score : scores2){
            if (score == 100 ) { System.out.println( "만점자!"); break;}
        }

        // 6.
        int sum = 0;
        String[] bloodTypes = {"A", "B", "O", "AB", "A", "B", "A"};
        for ( int w = 0; w <= bloodTypes.length -1 ; w++ ){
            if ( bloodTypes[w] == "A" ) { 
                sum += 1;
            }
        }
        System.out.println(sum);


        // 7.
        int[] numbers2 = {23, 5, 67, 12, 88, 34};
        int maxnum = numbers2[0];
        for ( int e = 0 ; e <= numbers2.length - 1; e++){
            if ( maxnum < numbers2[e] )
                maxnum = numbers2[e];
        }
        System.out.println(maxnum);

        // 8.
        Scanner scan = new Scanner(System.in); // 1.입력객체
        int[] stock = {10, 5, 20};
        String[] products = {"볼펜", "노트", "지우개"};
        System.out.println("구매할 상품명"); String 상품명 = scan.next();
        System.out.println("구매할 수량"); int 수량 = scan.nextInt();
        boolean find = false; // false = 동일한 제품명 없다 , true 있다
        for ( int r = 0 ; r <= products.length - 1 ; r++) {
            if( 상품명.equals(products[r] ) ) { // 입력받은 상품명과 r번째 상품명과 같으면
                find = true; // 동일한 제품명 찾음 기록
                if( 수량 <= stock[r] ) { // 입력받은 수량과 r번째 수량보다 이하이면
                    stock[r] -= 수량;   // 수량 차감
                } else { System.out.println("재고가 부족합니다.");}
            }
        }
        if (find == false ) {System.out.println("없는 제품명 입니다.");};


        // 9.
        String[] movieNames = {"히든페이스", "위키드", "글래디에이터2", "청설"};
        int[] movieRatings = {8, 4, 7, 6};
        for ( int t = 0; t <= movieNames.length - 1 ; t++) {
            // [1] 영화 이름들을 하나씩 출력
            String name = movieNames[t];
            System.out.println( name );
            // [2] 별점 출력 1~10
            for ( int star = 1; star <= 10 ; star++) {
                // 현재 별 보다 t번째 평점이 더 크면 
                if (star <= movieRatings[t]) {
                    System.out.println("★");
                }else{System.out.println("☆");}
            }
            System.out.println(); // 줄바꿈
        }
        

        // 10.
        String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234"};
        int[] usageMinutes = {65, 30, 140, 420};

        // [1] 차량번호 출력
         // [1] 차량번호 출력 
        for( int index = 0 ; index <= carNumbers.length-1; index++ ){
            System.out.print( carNumbers[index] +": ");
            // [2] 주차분 출력 
            System.out.print( usageMinutes[index]+"분 " );
            // [3] 주차요금 출력 
            int fee = 1000;
            if( usageMinutes[index] >= 30 ){
                // 30분 제외하고 나누기 10 ( 일단위 제거 ) 곱하기 500원 
                fee += ( usageMinutes[index]-30 ) / 10 * 500 ;
                // 만약에 2만원 넘어가면 2만원으로 고정 아니면 그대로
                fee = fee >= 20000 ? 20000 : fee; 
            }
            System.out.println( fee + "원" );
        }
    
        
    } // main end 
} // class end 

/*[문제 5] 점수 배열에서 100점 만점자가 처음 나타나면, "100점 만점자를 찾았습니다!"라고 출력하고 반복문을 즉시 종료하는 프로그램을 작성하시오.
선언 코드: int[] scores2 = {77, 82, 100, 54, 96};*/

/*[문제 6] 다음 배열에서 'A'형 혈액형을 가진 사람이 몇 명인지 for 반복문을 통해 세고, 그 수를 콘솔에 출력하시오.
선언 코드: String[] bloodTypes = {"A", "B", "O", "AB", "A", "B", "A"};*/

/*[문제 7] 주어진 숫자 배열에서 가장 큰 값을 찾아 콘솔에 출력하는 프로그램을 작성하시오.
선언 코드: int[] numbers2 = {23, 5, 67, 12, 88, 34};*/

/*[문제 8] products(상품 목록)와 stock(재고 수량) 배열이 있습니다. (*상품명과 재고수량 인덱스가 같다는 가정 )
Scanner를 이용해 사용자로부터 구매할 상품명과 수량을 입력받아, 재고가 충분하면 "구매 완료!"를 출력하고 재고를 차감하세요.
재고가 부족하면 "재고가 부족합니다."를, 없는 상품이면 "없는 제품명입니다."를 출력합니다.
선언 코드:
String[] products = {"볼펜", "노트", "지우개"};
int[] stock = {10, 5, 20};*/

/*[문제 9] 주어진 영화 이름과 평점 배열을 이용하여, 각 영화의 평점을 별(★, ☆)로 시각화하여 출력하는 프로그램을 작성하시오.(* 영화명과 평점 인덱스가 같다는 가정 )
요구 조건: 각 영화의 평점(10점 만점)만큼 꽉 찬 별(★)을, 나머지 점수만큼 빈 별(☆)을 출력합니다.
예시: 평점이 8점이면 ★★★★★★★★☆☆ (총 10개의 별)
선언 코드:
String[] movieNames = {"히든페이스", "위키드", "글래디에이터2", "청설"};
int[] movieRatings = {8, 4, 7, 6};
출력 예시:
히든페이스 ★★★★★★★★☆☆
위키드 ★★★★☆☆☆☆☆☆
글래디에이터2 ★★★★★★★☆☆☆
청설 ★★★★★★☆☆☆☆*/

/*[문제 10] 차량별 주차 시간 데이터가 주어졌을 때, 아래의 요금 규정에 따라 각 차량이 지불해야 할 최종 주차 요금을 계산하여 출력하시오.(* 차량번호 와 이용시간 인덱스가 같다는 가정 )
요금 규정:
기본 요금: 최초 30분까지 1,000원
추가 요금: 30분 초과 시, 매 10분마다 500원씩 추가
일일 최대 요금: 20,000원 (아무리 오래 주차해도 20,000원을 초과할 수 없음)
선언 코드:
String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234"};
int[] usageMinutes = {65, 30, 140, 420};
출력 예시:
210어7125: 65분 주차, 최종 요금: 2500원
142가7415: 30분 주차, 최종 요금: 1000원
888호8888: 140분 주차, 최종 요금: 6500원
931나8234: 420분 주차, 최종 요금: 20000원*/