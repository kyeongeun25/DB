show tables;	-- mydb에 어떤 table들이 있나?

-- word table의 구조가 어떻게 되어 있나?
desc word ;

-- table 삭제
drop table word ;

-- word table 생성
create table word(
	id int(10) auto_increment primary key,	-- 자동 증가하고, pk선언
	word varchar(100),
	meaning varchar(255)
);

select * from word ;
delete from word ;

select count(*) from word ;

