# DB 생성
DROP DATABASE IF EXISTS board_dev;
CREATE DATABASE board_dev;
USE board_dev;

CREATE TABLE board (
	id bigint UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	subject VARCHAR(100) NOT NULL,
	content VARCHAR(100) NOT NULL,
	createdDate DATETIME NOT NULL,
	modifiedDate DATETIME NOT NULL
)

INSERT INTO board
SET subject = "제목1",
content = "내용1",
createdDate = now(),
modifiedDate = now();

INSERT INTO board
SET subject = "제목2",
content = "내용2",
createdDate = now(),
modifiedDate = now();

INSERT INTO board
SET subject = "제목3",
content = "내용3",
createdDate = now(),
modifiedDate = now();