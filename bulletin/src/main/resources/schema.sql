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

INSERT INTO tbl_bulletin( title, content, name, DATE )
VALUES ('테스트','테스트 내용입니다.','테스트유저', '2022-07-02')