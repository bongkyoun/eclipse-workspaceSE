DROP TABLE Review_Table CASCADE CONSTRAINTS;
DROP TABLE Inquiry_Table CASCADE CONSTRAINTS;
DROP TABLE Od_Table CASCADE CONSTRAINTS;
DROP TABLE Notice_Table CASCADE CONSTRAINTS;
DROP TABLE Cart_Table CASCADE CONSTRAINTS;
DROP TABLE Order_Item_Table CASCADE CONSTRAINTS;
DROP TABLE Product_Table CASCADE CONSTRAINTS;
DROP TABLE User_Table CASCADE CONSTRAINTS;

CREATE TABLE User_Table(
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
);

DROP SEQUENCE User_Table_u_no_SEQ;

CREATE SEQUENCE User_Table_u_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER User_Table_u_no_TRG
BEFORE INSERT ON User_Table
FOR EACH ROW
BEGIN
IF :NEW.u_no IS NOT NULL THEN
  SELECT User_Table_u_no_SEQ.NEXTVAL INTO :NEW.u_no FROM DUAL;
END IF;
END;


CREATE TABLE Product_Table(
		p_no                          		NUMBER(10)		 DEFAULT 0		 NOT NULL,
		p_name                        		VARCHAR2(50)		 DEFAULT Null		 NULL ,
		p_price                       		NUMBER(10)		 DEFAULT 0		 NULL ,
		p_exp                         		VARCHAR2(1000)		 DEFAULT Null		 NULL ,
		p_category_b                  		VARCHAR2(50)		 NULL ,
		p_category_s                  		NUMBER(10)		 NULL 
);

DROP SEQUENCE Product_Table_p_no_SEQ;

CREATE SEQUENCE Product_Table_p_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER Product_Table_p_no_TRG
BEFORE INSERT ON Product_Table
FOR EACH ROW
BEGIN
IF :NEW.p_no IS NOT NULL THEN
  SELECT Product_Table_p_no_SEQ.NEXTVAL INTO :NEW.p_no FROM DUAL;
END IF;
END;


CREATE TABLE Order_Item_Table(
		o_no                          		NUMBER(10)		 DEFAULT 0		 NULL ,
		o_date                        		DATE		 DEFAULT sysdate		 NULL ,
		o_state                       		VARCHAR2(30)		 DEFAULT 30		 NULL ,
		u_name                        		VARCHAR2(15)		 NOT NULL,
		u_phone                       		NUMBER(20)		 NOT NULL,
		u_address                     		VARCHAR2(100)		 NOT NULL,
		u_no                          		NUMBER(10)		 DEFAULT Null		 NOT NULL,
		p_no                          		NUMBER(10)		 NULL ,
		d_fee                         		NUMBER(10)		 NULL ,
		d_memo                        		VARCHAR2(3000)		 NULL ,
		p_piece                       		NUMBER(10)		 NULL ,
		p_price                       		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(50)		 NULL 
);

DROP SEQUENCE Order_Item_Table_o_no_SEQ;

CREATE SEQUENCE Order_Item_Table_o_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER Order_Item_Table_o_no_TRG
BEFORE INSERT ON Order_Item_Table
FOR EACH ROW
BEGIN
IF :NEW.o_no IS NOT NULL THEN
  SELECT Order_Item_Table_o_no_SEQ.NEXTVAL INTO :NEW.o_no FROM DUAL;
END IF;
END;


CREATE TABLE Cart_Table(
		c_no                          		NUMBER(10)		 DEFAULT 0		 NOT NULL,
		c_qty                         		NUMBER(10)		 NULL ,
		p_no                          		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(50)		 NULL ,
		p_price                       		NUMBER(10)		 NULL ,
		u_no                          		NUMBER(10)		 NULL 
);

DROP SEQUENCE Cart_Table_c_no_SEQ;

CREATE SEQUENCE Cart_Table_c_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER Cart_Table_c_no_TRG
BEFORE INSERT ON Cart_Table
FOR EACH ROW
BEGIN
IF :NEW.c_no IS NOT NULL THEN
  SELECT Cart_Table_c_no_SEQ.NEXTVAL INTO :NEW.c_no FROM DUAL;
END IF;
END;


CREATE TABLE Notice_Table(
		n_tite                        		VARCHAR2(100)		 NULL ,
		n_date                        		DATE		 DEFAULT sysdate		 NULL ,
		n_content                     		VARCHAR2(3000)		 NULL 
);

DROP SEQUENCE Notice_Table_n_tite_SEQ;

CREATE SEQUENCE Notice_Table_n_tite_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER Notice_Table_n_tite_TRG
BEFORE INSERT ON Notice_Table
FOR EACH ROW
BEGIN
IF :NEW.n_tite IS NOT NULL THEN
  SELECT Notice_Table_n_tite_SEQ.NEXTVAL INTO :NEW.n_tite FROM DUAL;
END IF;
END;


CREATE TABLE Od_Table(
		od_no                         		NUMBER(10)		 NULL ,
		p_piece                       		NUMBER(10)		 NULL ,
		u_no                          		NUMBER(10)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);

DROP SEQUENCE Od_Table_od_no_SEQ;

CREATE SEQUENCE Od_Table_od_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER Od_Table_od_no_TRG
BEFORE INSERT ON Od_Table
FOR EACH ROW
BEGIN
IF :NEW.od_no IS NOT NULL THEN
  SELECT Od_Table_od_no_SEQ.NEXTVAL INTO :NEW.od_no FROM DUAL;
END IF;
END;


CREATE TABLE Inquiry_Table(
		i_no                          		NUMBER(20)		 NOT NULL,
		i_title                       		VARCHAR2(100)		 NOT NULL,
		i_date                        		DATE		 DEFAULT sysdate		 NOT NULL,
		i_content                     		VARCHAR2(2000)		 NULL ,
		u_id                          		VARCHAR2(10)		 NULL ,
		u_phone                       		NUMBER(20)		 NOT NULL,
		u_email                       		VARCHAR2(40)		 NOT NULL
);

DROP SEQUENCE Inquiry_Table_i_no_SEQ;

CREATE SEQUENCE Inquiry_Table_i_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER Inquiry_Table_i_no_TRG
BEFORE INSERT ON Inquiry_Table
FOR EACH ROW
BEGIN
IF :NEW.i_no IS NOT NULL THEN
  SELECT Inquiry_Table_i_no_SEQ.NEXTVAL INTO :NEW.i_no FROM DUAL;
END IF;
END;


CREATE TABLE Review_Table(
		r_no                          		NUMBER(10)		 NULL ,
		r_image                       		VARCHAR2(10)		 NULL ,
		r_content                     		VARCHAR2(3000)		 NOT NULL,
		r_wdate                       		DATE		 DEFAULT sysdate		 NOT NULL,
		r_rating                      		NUMBER(10)		 NOT NULL,
		p_no                          		NUMBER(10)		 NOT NULL,
		u_no                          		NUMBER(10)		 NULL ,
		u_name                        		VARCHAR2(50)		 NULL ,
		o_date                        		DATE		 DEFAULT sysdate		 NULL 
);

DROP SEQUENCE Review_Table_r_no_SEQ;

CREATE SEQUENCE Review_Table_r_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER Review_Table_r_no_TRG
BEFORE INSERT ON Review_Table
FOR EACH ROW
BEGIN
IF :NEW.r_no IS NOT NULL THEN
  SELECT Review_Table_r_no_SEQ.NEXTVAL INTO :NEW.r_no FROM DUAL;
END IF;
END;



ALTER TABLE User_Table ADD CONSTRAINT IDX_User_Table_PK PRIMARY KEY (u_no);
ALTER TABLE User_Table ADD CONSTRAINT  UNIQUE (u_id);

ALTER TABLE Product_Table ADD CONSTRAINT IDX_Product_Table_PK PRIMARY KEY (p_no);

ALTER TABLE Order_Item_Table ADD CONSTRAINT IDX_Order_Item_Table_PK PRIMARY KEY (o_no);
ALTER TABLE Order_Item_Table ADD CONSTRAINT IDX_Order_Item_Table_FK0 FOREIGN KEY (u_no) REFERENCES User_Table (u_no);
ALTER TABLE Order_Item_Table ADD CONSTRAINT IDX_Order_Item_Table_FK1 FOREIGN KEY (p_no) REFERENCES Product_Table (p_no);

ALTER TABLE Cart_Table ADD CONSTRAINT IDX_Cart_Table_PK PRIMARY KEY (c_no);
ALTER TABLE Cart_Table ADD CONSTRAINT IDX_Cart_Table_FK0 FOREIGN KEY (u_no) REFERENCES User_Table (u_no);
ALTER TABLE Cart_Table ADD CONSTRAINT IDX_Cart_Table_FK1 FOREIGN KEY (p_no) REFERENCES Product_Table (p_no);

ALTER TABLE Notice_Table ADD CONSTRAINT IDX_Notice_Table_PK PRIMARY KEY (n_tite);

ALTER TABLE Od_Table ADD CONSTRAINT IDX_Od_Table_PK PRIMARY KEY (od_no);
ALTER TABLE Od_Table ADD CONSTRAINT IDX_Od_Table_FK0 FOREIGN KEY (u_no) REFERENCES User_Table (u_no);
ALTER TABLE Od_Table ADD CONSTRAINT IDX_Od_Table_FK1 FOREIGN KEY (p_no) REFERENCES Product_Table (p_no);

ALTER TABLE Inquiry_Table ADD CONSTRAINT IDX_Inquiry_Table_PK PRIMARY KEY (i_no);
ALTER TABLE Inquiry_Table ADD CONSTRAINT IDX_Inquiry_Table_FK0 FOREIGN KEY (u_id) REFERENCES User_Table (u_no);
ALTER TABLE Inquiry_Table ADD CONSTRAINT IDX_Inquiry_Table_1 UNIQUE (u_id);

ALTER TABLE Review_Table ADD CONSTRAINT IDX_Review_Table_PK PRIMARY KEY (r_no);
ALTER TABLE Review_Table ADD CONSTRAINT IDX_Review_Table_FK0 FOREIGN KEY (u_no) REFERENCES User_Table (u_no);
ALTER TABLE Review_Table ADD CONSTRAINT IDX_Review_Table_FK1 FOREIGN KEY (p_no) REFERENCES Product_Table (p_no);

