DROP DATABASE IF EXISTS mydb0807;
CREATE DATABASE mydb0807;
USE mydb0807; -- ctrl+shift+enter, 맥북은 커맨드쉬프트엔터 : 전체실행 , ctrl+enter : 한줄실행
CREATE Table test( -- create table 테이블명( 속성명 타입 제약조건 , 속성명 타입 제약조건 )
    번호 int AUTO_INCREMENT ,
    constraint PRIMARY KEY ( 번호 ),
    이름 VARCHAR(30) NOT NULL UNIQUE ,
    개수 int DEFAULT 2
   

);
-- DML : 조작어 , 1) insert 레코드 삽입 2) select 레코드 조회 3) update 레코드 수정 4) delete 레코드 삭제
-- 레코드란? 테이블내 행/가로 단위
# [1] insert into 테이블명( 속성명1 , 속성명2 ) values ( 값1 , 값2 )
INSERT INTO test( 번호, 이름 , 개수 ) VALUES ( 1 , "유재석" , 10 );
INSERT INTO test( 이름 , 개수 ) VALUES( "강호동" , 20 ); -- 번호 값 제외한 삽입 , AUTO_INCREMENT 자동번호
INSERT INTO test( 이름 ) VALUES( "신동엽" ); -- 번호(auto) , 개수(defalut) 제외한 삽입
-- INSERT INTO test( 이름 ) VALUES( "유재석" ) ; -- 이름은 중복 불가능 / 오류
INSERT INTO test VALUES( 4, "하하" , 30 ); -- 모든 속성값을 정의 순서대로 값 대입시 속성명 생략
INSERT INTO test( 이름 ) VALUES( "박명수" ) , ( "수박" ) , ( "바나나" ); -- 3개의 레코드를 한번에 삽입

# [2] select : select * from 테이블명 where 조건
SELECT * from test; -- 테이블내 모든 속성의[*(와일드카드)] 레코드 조회
SELECT 이름 from test; -- 테이블내 '이름' 속성명의 레코드
SELECT 이름 , 개수 from test; -- '이름' '개수' 속성명의 레코드 조회
SELECT * FROM test WHERE 이름 = "유재석"; -- 프로그래밍이 아니라 대입이 없음 그래서 =은 대입이 아니라 같다 라는 의미
SELECT * FROM test WHERE 개수 >= 5; -- 개수 속성명의 값이 5이상이면 조회

# [3] update : update 테이블명 set 속성명 = 새로운값 , 속성명 = 새로운값 where 조건
UPDATE test SET 개수 = 10; -- 조건이 없으므로 테이블내 '개수'속성들의 값이 모두 10으로 수정
UPDATE test SET 개수 = WHERE 이름 = "유재석"; -- 이름 속성값이 유재석 이면 개수 속성값을 10으로 수정
UPDATE test SET 개수 = 40 , 이름 = "강호동2" WHERE 번호 = 2; -- 번호속성값이 2이면 개수속성값을 40, 이름속성값을 강호동2 수정

# [4] delete : delete from 테이블명 where 조건
-= delete from test; -- 조건이 없으므로 테이블내 모든 레코드 제거
DELETE from test where 이름 = "유재석"; -- 이름 속성값이 "유재석"이면 삭제
delete from test WHERE 번호 =  2; -- 번호 속성값이 2 이면 삭제
-- (DML) delete : 테이블내 레코드 삭제 [vs] (DML) truncate table : 테이블내 레코드 삭제 [vs] drop table : 테이블 자체 삭제
-- DDL은 취소(ROLLBACK)불가능 , DML은 취소(ROLLBACK)가능
