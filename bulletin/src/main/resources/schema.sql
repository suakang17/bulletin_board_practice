CREATE TABLE tbl_bulletin
(
    bulletinId Long auto_increment,
    title      varchar(30) not null,
    content    varchar(30) not null,
    DATE date not null,
    //view_count number default 0,
    name       varchar(30) not null,
    primary key (bulletinId)
);

INSERT INTO tbl_bulletin( title, content, name, DATE ) VALUES ('title1','content1','user1', '2022-07-02');
INSERT INTO tbl_bulletin( title, content, name, DATE ) VALUES ('title2','content2','user2', '2022-07-03');
INSERT INTO tbl_bulletin( title, content, name, DATE ) VALUES ('title3','content3','user3', '2022-07-04');
INSERT INTO tbl_bulletin( title, content, name, DATE ) VALUES ('title4','content4','user4', '2022-07-05');
INSERT INTO tbl_bulletin( title, content, name, DATE ) VALUES ('title5','content5','user5', '2022-07-06');
INSERT INTO tbl_bulletin( title, content, name, DATE ) VALUES ('title6','content6','user6', '2022-07-07');
INSERT INTO tbl_bulletin( title, content, name, DATE ) VALUES ('title7','content7','user7', '2022-07-08');
INSERT INTO tbl_bulletin( title, content, name, DATE ) VALUES ('title8','content8','user8', '2022-07-09');
INSERT INTO tbl_bulletin( title, content, name, DATE ) VALUES ('title9','content9','user9', '2022-07-10');
INSERT INTO tbl_bulletin( title, content, name, DATE ) VALUES ('title10','content10','user10', '2022-07-11');