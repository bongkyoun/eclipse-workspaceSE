DROP TABLE TABLE_1 IF EXISTS;

CREATE TABLE TABLE_1(
		board_no NUMERIC(10),
		board_title VARCHAR(100),
		board_content VARCHAR(512),
		board_wday DATE,
		board_read_count INTEGER
);


ALTER TABLE TABLE_1 ADD CONSTRAINT IDX_TABLE_1_PK PRIMARY KEY (board_title);

