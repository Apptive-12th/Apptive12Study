# 데이터베이스
데이터 베이스<br>
데이터 : 자료, 어떤 정보들<br>
베이스 : 기초, 토대, 통<br>
<br>
데이터 베이스는<br>
어떤 자료들을 담는 통<br>
<br>
이 데이터 베이스는 구현할 수 있는 방법<br>
대표적으로 2개

### RDBMS (Relation Data Base Manager System)
관계형 데이터 베이스<br>
이것을 다루는 프로그램은<br>
1. MYSQL(중소규모 ),
2. MSSQL(Microsoft)
3. ORACLE
4. PostageSQL (무료)
5. ROOM DB
6. SQLite (Local 형식의 데이터 베이스)
<br>SQL이라는 언어를 씁니다.
<br>이 언어는 데이터 베이스 전용 언어
<br>C, C++, JAVA 이런거랑은 다름
<br>쉽다고하면 쉬운데, 어려움
<br>관계형 데이터 베이스는 데이터가 어떤 형식에 따라서 입출력이 이루어지는거에요
<br>관계라고 설정된 형식에 맞게끔 데이터를 넣어야 되요
<br>
테이블안에 로우와 컬럼(필드)로 이루어져 있다고 보면 됩니다.<br>
테이블명: 성적표<br>
이름	석차 (컬럼=field)<br>
김씨(row) <—	1<br>
이씨	2<br>
형씨	3<br>
강씨	2<br>
김씨 1 한 행 row<br>
석차 1 2 3 이부분을 컬럼<br>
field라고도 함<br>
<br>
SQL문은 이 Field와 SQL문이 제공하는 질의문(Query)로 데이터를 데이터베이스에 저장하고 관리 합니다.
### SQL 간단한 문법들
CREATE 테이블을 생성하는것 ( 어떤 필드를 가지고 있는지 명시하면서) <br>
SELECT 데이터를 가져오는것 (테이블 명, 필드 명) <br>
UPDATE 기존의 데이터를 수정하는 것 <br>
DROP 테이블을 삭제하는것 <br>
<br>
CREATE TABLE 테이블명 (필드명,타입) <br>
CREATE TABLE 성적표(석차 Integer,과학 Integer,비고 varchar(20))<br>
테이블은 초반 한번만 생성하면 삭제하지 않는 한 남아있음 <br>
<br>
Insert (‘ 데이터’,’데이터2’,’데이터3’); <br>
<br>
<br>SELECT * FROM 테이블명 WHERE 필드='조건' AND 필드2='조건2'
<br>
<br>SELECT *(모든것) FROM 성적표 석차=“1”
<br>김씨 의 데이터
<br>SELECT 석차 =“2”
<br>이씨
<br>강씨의 데이터를 불러 오는 것
<br>김씨의 데이터만 불러올 수 있는 게 아니라
<br>
<br>SQLite는 이 데이터를 한번에 하나만 처리 할 수 있음.
<br>이씨 강씨 두개의 데이터를 불러왔는데
<br>데이터를 처리 할 때는 하나만
<br>
<br>Cursor
<br>이씨~~ <— 얘를 불러와요
<br>강씨~~
<br>
<br>Cursor 다음으로 가라 라는 명령어가 있음
<br>이씨
<br>강씨 <—
<br>
<br>Update
<br>
<br>DROP얘는 테이블삭제
<br>
<br>안드로이드에서 SQLite 기본 제공
<br>그 기본클래스 SQLiteOpenHelper 얘를 이용
<br>
<br>SQL문을 쓴다고 했음
<br>안드로이드느 자바를 씀
<br>
<br>
<br>
<br>
<br>김씨 석차 
<br>이씨
<br>No SQL 
<br>비관계형 데이터 베이스
<br>SQL 을 쓰지 않고 하는데 쉬움
<br>JSON 형식을 사용함.
<br>(JavaScript Object Notation)
<pre>
<code>
김씨:
{
“이름” : “apptive”
 “취미” : “개발”
}

이씨:{
	“취미” :”apptive”
}
</code>
</pre>

SQL 문법을 안써도 된다는거 자체가 메리트

RDBMS 보다는 불안정함
