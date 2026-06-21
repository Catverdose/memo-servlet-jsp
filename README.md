# Memo Servlet JSP

JDBC, Servlet, JSP, MySQL을 사용하여 기본적인 웹 MVC 구조와 CRUD 흐름을 학습하기 위한 메모 프로젝트

## 프로젝트 목적

프레임워크 없이 Java 웹 애플리케이션을 직접 구성하면서 흐름을 이해 아래

```text
Browser
→ Servlet Controller
→ Service
→ DAO
→ JDBC
→ MySQL
→ JSP
```

이 프로젝트를 단계적으로 확장하여 MyBatis, AJAX, Spring Boot MVC, Filter, Interceptor까지 적용예정

## 기술 스택

* Java 21
* Jakarta Servlet
* JSP
* JDBC
* MySQL
* Apache Tomcat 10.1
* Eclipse

## 현재 구현 기능

* 메모 목록 조회
* Controller, Service, DAO 계층 분리
* JDBC를 이용한 MySQL 연결
* JSP를 이용한 조회 결과 출력
* DB 접속 정보 외부 설정 파일 분리

## 예정 기능

* 메모 상세 조회
* 메모 작성
* 메모 수정
* 메모 삭제
* 회원가입 및 로그인
* 세션 기반 인증
* 트랜잭션 처리
* MyBatis 전환
* AJAX 적용
* Spring Boot MVC 전환
* Filter와 Interceptor 적용
* 클라이언트 측 메모 암호화

## 프로젝트 구조

```text
src/main
├─ java
│  └─ memo
│     ├─ controller
│     ├─ service
│     ├─ dao
│     ├─ dto
│     └─ util
│
├─ resources
│  └─ db.properties.example
│
└─ webapp
   ├─ index.jsp
   └─ WEB-INF
      ├─ web.xml
      ├─ lib
      └─ memo
         └─ views
            ├─ list.jsp
            ├─ detail.jsp
            ├─ write.jsp
            └─ edit.jsp
```

## 실행 전 DB 설정

`src/main/resources/db.properties.example` 파일을 복사하여 같은 위치에 `db.properties`를 생성합니다.

```properties
db.driver=com.mysql.cj.jdbc.Driver
db.url=jdbc:mysql://localhost:3306/memo?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8&useSSL=false
db.user=YOUR_DB_USER
db.password=YOUR_DB_PASSWORD
```

실제 `db.properties` 파일은 Git에 포함되지 않습니다.

## 실행 방법

1. MySQL에 `memo` 데이터베이스를 생성합니다.
2. `db.properties`에 MySQL 접속 정보를 입력합니다.
3. 프로젝트를 Apache Tomcat 10.1 서버에 추가합니다.
4. Eclipse에서 Project Clean 후 Tomcat을 실행합니다.
5. 다음 경로로 접속합니다.

```text
http://localhost:8080/memo-servlet-jsp/
```

## 현재 개발 단계

```text
[완료] JDBC + Servlet + MySQL + JSP 목록 조회
[진행 예정] 상세 조회
[진행 예정] 작성·수정·삭제
[진행 예정] 회원 및 세션 인증
[진행 예정] MyBatis
[진행 예정] AJAX
[진행 예정] Spring Boot MVC
```
