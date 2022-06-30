--회원정보 수정
update userinfo set u_id = 'itwill5', 
u_pw = '5555', 
u_name = '도요토미', 
u_email = 'e@www.japan.com', 
u_phone = '5555555555', 
u_address = '몽골', 
u_birth = '20020202',
u_job = '독립운동가'
where u_no = '5';

--아이디 찾기
select u_id from userinfo where u_email = 'e@www.japan.com';

--비밀번호 찾기

select u_pw from userinfo where u_name = '도요토미' and u_email = 'e@www.japan.com';

/*--탈퇴 할 회원 생성
insert into userinfo (u_no, u_id, u_pw, u_name, u_email, u_phone, u_address, u_birth, u_job, u_joindate)
VALUES (userinfo_u_no_seq.nextval, 'itwill7', '7777', '7', 'g@www.g.com', '77777777', '집','77777777','거지',sysdate);

--회원 탈퇴
delete userinfo where u_id = 'itwill7';
*/

--회원 정보
select * from userinfo;
