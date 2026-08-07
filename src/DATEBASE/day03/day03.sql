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
INSERT INTO test( 이름 ) VALUES( "박명수" ) , ( "수박" ) , ( "바나나" );

# [2] select : select * from 테이블명
SELECT * from test;
