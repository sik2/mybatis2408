##  Spring Boot + Mybatis + MariaDB Board CRUD API

### 게시물 다건 조회
/api/v1/boards

### 게시물 단건 조회
/api/v1/boards/1

### 게시물 삭제
/api/v1/boards/1

### 게시물 등록
/api/v1/boards
- request body
```json
{
  "subject": "제목",
  "content": "내용",  
}
```

### 게시물 수정
/api/v1/boards/1
- request body
```json
{
  "subject": "제목",
  "content": "내용",  
}
```