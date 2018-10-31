-- 기존에 있던 학생정도 table을 삭제
DROP TABLE student;
-- DROP으로 삭제된 table은 다시 복구 할 수 없기 때문에
-- 삭제 할 때는 매우 신중하게 실행

-- student 정보를 저장할 table 생성
CREATE TABLE student(
	num int(5) PRIMARY KEY,
	engName varchar(20),
	korName varchar(50)
);

-- 생성된 table의 구조를 확인
DESC student; -- MySQL에서만 사용되는 명령어

SELECT * FROM student;

DELETE FROM student;