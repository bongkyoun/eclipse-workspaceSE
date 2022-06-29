--USER_TABLE insert
/*
        u_no                          		NUMBER(10)		 NOT NULL,
		u_id                          		VARCHAR2(10)		 NOT NULL,
		u_pw                          		VARCHAR2(20)		 NOT NULL,
		u_name                        		VARCHAR2(15)		 NOT NULL,
		u_email                       		VARCHAR2(40)		 NOT NULL,
		u_phone                       		VARCHAR2(20)		 NOT NULL,
		u_address                     		VARCHAR2(100)		 NOT NULL,
		u_birth                       		VARCHAR2(20)		 NOT NULL,
		u_job                         		VARCHAR2(20)		 DEFAULT Null		 NULL ,
		u_joindate                    		DATE		 DEFAULT sysdate		 NOT NULL
*/

--회원 추가
insert into user_table (u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)
VALUES ('1', 'itwill1', '1111', '김첨지', 'a@www.a.com', '11111111111', '사랑시고백구행복동','19500625',null,sysdate);
insert into user_table (u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)
VALUES ('2', 'itwill2', '2222', '도요토미', 'b@www.b.com', '22222222222', '당나라','sysdate',null,sysdate);
insert into user_table (u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)
VALUES ('3', 'itwill3', '3333', '최배달', 'c@www.c.com', '33333333333', '부여성','20000102',null,sysdate);
insert into user_table (u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)
VALUES ('4', 'itwill4', '4444', '미륵', 'd@www.d.com', '44444444444', '감비아','18810405',null,sysdate);
/*
insert into user_table (u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)--
VALUES ('', 'itwill4', '4444', '미륵', 'd@www.d.com', '44444444444', '감비아','18810405',null,sysdate);
*/ --ORA-01400: cannot insert NULL into ("JDEVELOPER02"."USER_TABLE"."U_NO")
--회원정보 수정
update user_table set u_phone = '112', u_address = '경상북도 울진' where u_no = '1';

--회원 탈퇴
delete user_table where u_no = '1';

--회원 정보
select * from user_table;


