/***************회원******************/
--회원정보보기(select pk)
select * from userinfo where userid='guard1';
--회원정보수정(update pk)
update userinfo set password='1111',name='김변경',email='change@naver.com' where userid='guard1';
--회원탈퇴(delete pk)
delete userinfo where userid='guard4';



/****************제품*****************/
--제품리스트
select * from product;
--제품상세보기
select * from product where p_no=1;
--제품수정(X)
--제품삭제(X)
--제품추가(X)

/**************cart******************/
--guard1 멤버한사람의  카트에 제품번호 존재여부
select count(*) as "cnt" from cart where userid='guard1' and p_no=7;
select count(*) as "cnt" from cart where userid='guard1' and p_no=1;
select count(*)  as p_count from cart  where u.userid='guard1' and c.p_no=1;
--로그인한멤버(guard1) 의 카트아이템리스트(cart)
select * from cart where userid='guard1';
--로그인한멤버(guard1) 의 카트아이템리스트(cart + product)
select * from cart c join product p on c.p_no=p.p_no where userid='guard1';
--select * from cart c join product p on c.p_no=p.p_no join userinfo u on c.userid=u.userId where c.userid='guard1';
--로그인한멤버(guard1) 의 카트아이템한개삭제(pk) 
delete from cart where cart_no=1;
--로그인한멤버(guard1) 의 카트아이템 제품1개의수량변경(pk)
update cart set cart_qty = 8 where  cart_no = 2;
--로그인한멤버(guard1) 의 카트아이템 리스트에 제품의수 


--로그인한멤버(guard1)의 카트에제품추가시에수정
update cart set cart_qty = cart_qty+1 where p_no=7 and userid='guard1';
desc cart;


--1. 멤버 한사람의 주문전체목록
select * from orders where userid='guard1';

--2. 주문한개(멤버 한사람의) 
select * from orders where o_no=1;


--3. 주문한개의  주문상세 여러개(주문상세)
select * from order_item where o_no = 1;

--4. 주문한개의 주문상세,제품정보 여러개(주문상세,제품)
select * from orders o join order_item oi on o.o_no=oi.o_no  join  product p on oi.p_no=p.p_no 
where o.userid='guard1' and o.o_no=1;

--5. 주문한개삭제(주문1개삭제,주문상세삭제)
--on delete cascade
--delete from order_item where o_no=1;
delete from orders where o_no=1;
--rollback;
--6. 멤버한사람의 주문내역전체삭제
----on delete cascade
--select o_no from orders where userid='guard1';
delete from order_item where o_no in(select o_no from orders where userid='guard1');
delete from orders where userid='guard1';

--rollback;













