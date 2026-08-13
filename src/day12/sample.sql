-- day12 Exam2와 연동할 DB 생성
DROP DATABASE IF EXISTS mydb0813;
CREATE DATABASE mydb0813;
use mydb0813;
CREATE TABLE board( 
    no int AUTO_INCREMENT ,
    content VARCHAR(255),
    writer VARCHAR(30),
    constraint PRIMARY KEY ( no )
);
INSERT into board( content, writer )values( "안녕하세요", "유재삭" ),( "하하", "강호동"); -- 샘플 데이터2개
CREATE Table test( no int AUTO_INCREMENT PRIMARY KEY , name VARCHAR(30) );


