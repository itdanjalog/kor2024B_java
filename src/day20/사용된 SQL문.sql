# #주석
# 실행 : 명령어에 커서를 두고 ctrl+엔터

# 데이터베이스 삭제 			# drop database [DBName];
drop database java;
# 데이터베이스 생성 			# create database [DBName];
create database java;
# 데이터베이스 사용 활성화 	# use [DBName];
use java;

# 테이블 생성 				# create table [tableName] ( 필드명 타입 , 필드명2 타입 )
create table phonebook( phone text , name text );