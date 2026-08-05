DROP DATABASE IF EXISTS mvdb0805; # [1] 데이터베이스 삭제 # ctrl+엔터 (맥북은 커맨더+엔터)

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
