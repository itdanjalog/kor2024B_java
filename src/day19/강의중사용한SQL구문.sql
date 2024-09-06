# SQL 주석 
# 아래와 같이 입력후 ;세미콜론 마침.

# 한줄실행 : 실행할 명령어에 커서를 두고 ctrl+enter 
show databases; # 데이터베이스 목록 조회 

# 데이터베이스 생성 # create database DB명
create database java; # 입력후 CTRL+ENTER 실행

# 데이터베이스 활성화 # 지정한 데이터베이스를 사용 활성화 한다.
use java;

# 테이블 생성 # create table 테이블명( 속성명 타입 ); 
create table members( 
	name text # 'members' 테이블내 'name'필드(열) 'text'타입으로 정의
);

# 테이블내 레코드/행 삽입 # insert into 테이블명(속성명1,속성명2),values(값,값)
	# 1. 'members' 테이블내 레코드/행 삽입 
insert into members( name ) values( "유재석" );

# 테이블내 레코드/행 조회 #
select * from members;

# 테이블내 속성의 값 수정 # update 테이블명 set 수정할속성명 = 수정할값 where 조건( 속성명 = 조건값 )
update members set name = '유재석2' where name = '유재석'; # 만약에 name 이 유재석 이면 유재석2로 수정 하겠다는 뜻

# 테이블내 레코드 삭제 # delete from 테이블명 where 조건( 속성명 = 조건값 )
delete from members where name = '유재석2';  # 만약에 name 이 유재석2 이면 레코드/행 삭제 





















