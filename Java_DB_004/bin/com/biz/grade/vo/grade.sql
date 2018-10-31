-- 테이블 생성
-- grade 생성

CREATE TABLE grade(

	num int(5)	PRIMARY KEY,	-- ;	// 학번, PK
	kor int(3),		-- ;	// 국어점수
	eng int(3),		-- ;	// 영어점수
	math int(3),		-- ;	// 수학점수
	total int(5),	-- ;	// 총점
	avg  int(3)		-- ;	// 평균
	
);

-- 테이블 확인
DESC grade;

-- 테스트 데이터를 입력
-- 컬럼의 일부만 데이터로 채울 경우
-- table(칼럼리스트) 형식으로 표현해야 한다.
INSERT INTO grade(num, kor, eng, math)
VALUES(1,89,78,67);

-- INSERT 후 확인
SELECT * FROM grade;