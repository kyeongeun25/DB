show databases ;

-- 데이터 저장소 생성
-- TABLE 생성
-- 데이터를 저장할 공간을 설정하는 것
-- 데이터 저장할때 필요한 최소한의 공간을 만들며 데이터를 입력 할 때 잘못된 데이터가 입력되지 않도록 하고,
-- 데이터를 검색 할 때 올바른 데이터가 검색되도록 하기 위해 조건을 설정하는 것
create table student(
	id int(10) primary key auto_increment,	
		-- id라는 필드를 만드는데 정수형 3자리만 입력되도록
		-- 데이터 수정, 삭제 할 때 내가 꼭 필요한 데이터만 수정, 삭제 되도록 하고자 할 때 기본 조건으로 사용할 필드
		-- 이 필드에 저장될 데이터는 절대 중복되면 안된다. 또한, 이 필드는 공백(null)이어서도 안된다.
		-- 이런 조건들을 설정 할 때 primary key라는 옵션을 준다.
		-- 그리고, primary key 조건을 만족하면서 데이터를 쉽게 추가 할 수 있도록
		-- auto increment 옵션을 추가한다. >> 데이터를 insert 할 때마다 자동으로 값을 증가(++)해서 추가
	num int(3) not null,		
		-- num라는 필드를 정수형 3자리만 입력되도록
		-- 학번 필드가 비어있으면 그 데이터는 문제가 있는 데이터이다. 
		-- 그래서 insert를 할 때 학번필드를 생략하면 데이터가 insert 되지 않도록 설정 >> not null
	name varchar(20) not null,
		-- name라는 필드를 문자열 20자리까지 입력되도록
		-- 이름 필드가 비어있으면 그 데이터는 문제가 있는 데이터이다.
		-- 그래서 insert 할 때 이름 필드를 생략하면 데이터가 insert 되지 않도록 설정 >> not null
		-- varchar는 가변길이 문자열이라고 하며 최대 20글자까지 insert가 되지만 
		-- 만약 20글자보다 작은 데이터가 추가되면 나머지 공간을 없애서 데이터 저장 공간을 절약한다.
	age int(3)		-- age라는 필드를 정수형 3자리만 입력되도록
);

-- 테이블 확인
show tables ;

-- 테이블이 잘 만들어졌나 확인
desc student ;

-- 데이터 추가
insert into student values(0,1,'홍길동',22);

-- 추가된 데이터 확인
select * from student;

-- 7번째 추가된 데이터 삭제
delete from student where id = 7;

-- 6번째 데이터의 나이를 12로 변경
update student set age = 12 where id = 6;