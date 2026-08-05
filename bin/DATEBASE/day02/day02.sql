DROP DATABASE IF EXISTS mydb0805; # [1] 데이터베이스 삭제 # ctrl+엔터 (맥북은 커맨더+엔터)

CREATE DATABASE mydb0805; #[2] 데이터베이스 생성

SHOW DATABASES; #[3] 데이터베이스 목록

USE mydb0805; # [4] 사용할 데이터베이스 선택
#DDL : CREATE ALTER DROP TRUNCATE RENAME
#DML : SELECT INSERT DELETE UPDATE
#DCL : GRANT REVOKE
#TCL : ROLLBACK COMMIT
#---------------------------------------------------------------------------------#
# DDL : 데이터베이스/테이블 생성/삭제/수정 질의어 ( ** 트랜잭션 불가능 ** )
# 1) 테이블 생성 : 1. 테이블생성할 데이터베이스활성화 = USE mydb0805;(이거하라는거) 2) create table 테이블명(속성명 타입, 속성명 타입);
CREATE Table test1( 필드명1 int , 필드명2 double , 필드명3 text ); /* 테이블명(필드명 타입, 필드명 타입, ...) */

# 2) 테이블 목록 조회
show tables; /* 현재 DB 안에 있는 테이블 목록 전체 출력 */

# 3) 특정 테이블 정보 조회
DESCRIBE test1; /* 해당 테이블의 필드명/타입/제약조건 등 구조 확인 */

# 4) 특정 테이블 삭제
DROP table test1; /* 테이블 통째로 삭제(구조+데이터 다 사라짐) */

# 5) 테이블 수정
# 5.1) 필드/속성 추가
alter table test1 add 필드명4 float; /* 테이블명 add 새필드명 타입 → 기존 테이블에 필드(컬럼) 추가 */
# 5.2) 필드/속성 수정
alter table test1 MODIFY 필드명3 longtext; /* 테이블명 MODIFY 필드명 새타입 → 필드명은 그대로, 타입만 변경 */

# 5.3) 필드/속성명 , 타입 수정
alter table test1 change 필드명1 필드명5 bigint; /* 테이블명 change 기존필드명 새필드명 새타입 → 필드명+타입 둘 다 변경 */

# 6) 테이블 이름 변경
rename table test1 to new_test1; /* 기존 테이블명 to 새로운테이블명 */ 

# 7) 테이블내 모든 레코드(행/데이터)삭제
TRUNCATE table new_test1;
#---------------------------------------------------------------------------------#
# 테이블의 속성/필드 타입 *DBMS 회사마다 차이가 있음*

USE mydb0805;
CREATE Table test2( 
    정수필드1 TINYINT , 정수필드2 SMALLINT  , 정수필드3 MEDIUMINT , 
    정수필드4 INT     , 정수필드5 BIGINT    , 정수필드6 int UNSIGNED ,
    -- UNSIGNED = 부호없다. TINYINT(1바이트 -128~127) --> 0 ~ 255
    실수필드7 FLOAT   , 실수필드8 DOUBLE    , 실수필드9 DECIMAL ,
    -- decimal 문자타입 이면서 소수점 오차 없음
    날짜필드1 date    , 시간필드1 time      , 날짜시간필드 DATETIME ,
    문자필드1 char(3) , 문자필드2 VARCHAR(3), 문자필드3 text , 문자필드4 longtext ,
    -- char (문자 고정길이) vs -- VARCHAR( 문자 가변길이 )
    -- 예) "수박" --> char( [수][박][x] ) vs varchar( [수][박] )
    -- 사진이 포함된 게시물 내용 저장시 : 4G 까지 가능한 longtext 권장
    논리필드 BOOLEAN -- 마지막 필드타입 뒤로 , 넣지 않기!
);

DESCRIBE test2; -- 테이블 속성 확인

#---------------------------------------------------------------------------------#
# 속성/필드 제약조건

CREATE table test3(
    필드명1 TINYINT NOT NULL,   -- 해당 필드/속성에는 null을 저장할 수 없도록 설정 *값이 null 이면 오류발생*
    필드명2 SMALLINT UNIQUE ,   -- 해당 필드/속성에는 중복값을 저장할 수 없도록 설정 *값이 다른 레코드와 같다면 오류발생*
    필드명3 int DEFAULT 100 ,   -- 해당 필드/속성에 레코드(행) 추가시 기본값 10 대입된다. *값이 다른 레코드와 같다면 오류발생*
    필드명4 DATETIME DEFAULT now(), -- 예) 레코드 삽입시 현재날짜/시간now() 자동 대입된다.
    필드명5 BIGINT AUTO_INCREMENT ,
    constraint PRIMARY key( 필드명5 ) -- 특정 필드/속성 pk로 설정한다.
    -- AUTO_INCREMENT : 레코드(행) 삽입 시 자동으로 번호 순서번호 설정 , 1 2 3 4 5 6 ~
    -- PRIMARY ket(pk) : 기본/식별 키 , 식별가능한 고유한 값을 가지는 필드 ( not null + unique 내장됨 )
        -- 주로 쓰이는 곳 : 학번,           사번 ,            ~~코드/번호들 등등
    -- FOREIGN key(fk): 참조/외래 키 (pk가 다른테이블에 위치한 경우), 다른 테이블의 기본키를 참조하는 키 
);      -- 주로 쓰이는 곳 : 수강신청한학번,    급여지급사번 ,      판매된 제품 코드 등등
        -- 참조 옵션 : PK가 삭제/수정된 경우 FK 어떻게??
            -- on delete/update casecade : pk가 삭제/수정되면 fk도 같이 삭제/수정
            -- on delete/update set null : pk가 삭제/수정되면 fk은 null로 수정
            -- on delete/update restrict : (생략시 기본값) pk가 fk로부터 참조 중이면 삭제/수정 불가능

CREATE table test4( 필드명1 BIGINT, 
constraint FOREIGN KEY( 필드명1 ) REFERENCES test3(필드명5) ON delete CASCADE on update CASCADE
);

DESCRIBE test4;

# 예제 회원제 게시판 서비스 --------------------------------#

drop DATABASE if EXISTS boardService0805; #1) 데이터베이스 존재하면 삭제한다.

CREATE DATABASE boardService0805; #2) 데이터베이스 생성한다.

use boardService0805; #3) 데이터베이스 활성화한다.

CREATE table member( #4 ) 회원테이블 생성한다.
    mno int AUTO_INCREMENT , -- 자동회원번호 
    constraint PRIMARY KEY ( mno ) , --회원번호 pk 설정
    mid varchar(30) not null UNIQUE , -- 회원아이디 이면서 최대 30글자, 공백불가능, 중복불가능 설정
    mpwd varchar(20) not null , --회원비밀번호 이면서 최대20글자 , 공백불가능 , 중복가능 설정
    mname varchar(10) not null , --회원닉네임
    mdate datetime DEFAULT now() --회원가입날짜/시간 , 현재날짜/시간 자동으로 기본값 설정
);
create table board( #5) 게시물테이블 생성한다.
    bno int AUTO_INCREMENT ,
    constraint PRIMARY key( bno ) , -- 게시물번호 pk 설정 * 테이블1개당 pk1개이상 권장 *
    btitle VARCHAR(255) , -- 게시물제목
    bcontent longtext , -- 게시물내용 , 대용량(사진)포함한 최대 4G 까지
    bdate DATETIME DEFAULT now() , -- 게시물작성일
    bview int DEFAULT 0 , -- 조회수
    mno int , --작성자(mid/회원아이디가 아니고 mno/회원번호) , 관례적으로 PK-FK 필드명 동일
    constraint FOREIGN KEY( mno_fk ) REFERENCES member( mno_pk )
