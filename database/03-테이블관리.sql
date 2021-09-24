-- 포켓몬스터 정보를 저장하기 위한 테이블을 생성
CREATE TABLE monster(
monster_no number(3),
monster_name varchar2(24),
monster_type varchar2(9)
);
-- 만든 테이블 삭제
drop table monster;

-- 데이터를 다루는 작업은 데이터베이스를 이용하는 핵심 이유 중 하나
-- 데이터 추가(Create), 데이터 조회(Read), 데이터 수정(Update), 데이터 삭제(Delete) = CRUD
-- 만들어진 테이블에 데이터 추가
-- insert into monster(컬럼명) valuses(데이터)
insert into monster(monster_no, monster_name, monster_type) values(1, '이상해씨','풀');
insert into monster(monster_no, monster_name, monster_type) values(2, '이상해풀','풀');
insert into monster(monster_no, monster_name, monster_type) values(3, '이상해꽃','풀');

-- 형식 순서 또는 개수를 바꿔서 넣어도 가능
-- 형식을 알려주지 않으면 테이블에 작성된 컬럼 순서대로 전부 추가하겠다는 의미
insert into monster values(1, '이상해씨', '풀');
insert into monster values(2, '이상해풀', '풀');
insert into monster values(3, '이상해꽃', '풀');

-- 잘 안 보일 경우 컬럼의 표시 크기를 변경(SQL  커맨드 라인)
column monster_no format 999;
column monster_name format a10;
column monster_type format a10;

-- 데이터가 잘 들어가 있는 지 조회
select*from monster;

-- 데이터베이스는 "다수의 사용자가 데이터를 관리"할 수 있도로 구성된 저장소
-- 각자의 사용자가 동시에 접근해서 데이터를 추가, 조회, 수정, 삭제할 수 있다.
-- 이 중에서 추가(C), 수정(U), 삭제(D)는 문제의 소지가 있다.
-- 이런 상황을 방지하기 위해서 DBMS에서는 "2단계 저장구조"를 가진다.
-- 1차적으로 작업한 내용을 트랜잭선(Transaction)이라고 부르고, 작업을 마치면 트랜잭션을 저장/취소 할 수 있다.

-- 데이터 삭제
rollback;

--데이터 저장
commit;

/*
	KH 계정에 생성
 	<MENU>
	메뉴 이름은 한글 10글자 이내로 작성된다.
	메뉴 가격은 가장 비싼게 100만원이다.
	메뉴 종류는 식사. 안주, 음료, 디저트 중 하나가 저장된다.
*/

CREATE TABLE menu(
menu_name varchar2(30),
menu_price number(7),
menu_type varchar2(9)
);


insert into menu values('아메리카노',3000,'coffee');
insert into menu values('카페라떼',3500,'coffee');
insert into menu values('카푸치노',3500,'coffee');
insert into menu values('카페모카',4000,'coffee');
insert into menu values('바닐라라떼',4000,'coffee');
insert into menu values('헤이즐넛라떼',4000,'coffee');

commit;

/*
	<EPL>
	순위는 1부터 20위까지 존재한다.
	승점은 최대 108점까지 획득할 수 있다.
*/

CREATE TABLE EPL(
EPL_RANK number(2),
CLUB_NAME varchar2(36),
GAME_TOTAL number(2),
GAME_VICTORY number(2),
GAME_DEFEAT number(2),
GAME_DRAW number(2),
VITORY_POINT number(3)
);

insert into EPL(EPL_RANK, CLUB_NAME,GAME_TOTAL,GAME_VICTORY,GAME_DEFEAT,GAME_DRAW,VITORY_POINT)values(1,'첼시',5,4,1,0,13);
insert into EPL(EPL_RANK, CLUB_NAME,GAME_TOTAL,GAME_VICTORY,GAME_DEFEAT,GAME_DRAW,VITORY_POINT)values(2,'리버풀',5,4,1,0,13);
insert into EPL(EPL_RANK, CLUB_NAME,GAME_TOTAL,GAME_VICTORY,GAME_DEFEAT,GAME_DRAW,VITORY_POINT)values(3,'맨유',5,4,1,0,13);
insert into EPL(EPL_RANK, CLUB_NAME,GAME_TOTAL,GAME_VICTORY,GAME_DEFEAT,GAME_DRAW,VITORY_POINT)values(4,'브라이턴',5,4,0,1,12);
insert into EPL(EPL_RANK, CLUB_NAME,GAME_TOTAL,GAME_VICTORY,GAME_DEFEAT,GAME_DRAW,VITORY_POINT)values(5,'맨시티',5,3,1,1,10);

commit;


-- 기존에 만든 monster 테이블에 고유번호 발급기(시퀀스, Sequence)를 적용시켜 데이터를 추가
-- 기존의 데이터를 삭제하고 진행
truncate table monster;

-- 시퀀스(Sequence) 
-- monster 테이블 용 시퀀스(Sequence) 생성
create sequence monster_seq 
-- minvalue 1 maxvalue 가장 큰 숫자(38자리) // 옵션을 줄 수 있지만 안주면 기본 옵션으로 자동 설정
-- start with 1 increment by 1;
-- cache 20 (기본값)


-- 만들어진 시퀀스를 이용하여 번호를 생성해가며 데이터를 추가
-- 번호 생성 명령 : monster_seq.nextval

insert into monster (monster_no, monster_name, monster_type)values(monster_seq.nextval,'이상해씨','풀');
insert into monster (monster_no, monster_name, monster_type)values(monster_seq.nextval,'이상해풀','풀');
insert into monster (monster_no, monster_name, monster_type)values(monster_seq.nextval,'이상해꽃','풀');


-- 시퀀시 조회
select*from user_squences;

-- 삭제
drop sequence monster_seq;




/*
 	<MELON>
 	테이블 CHART
 	음원 고유 번호는 sequence를 사용하여 부여(chart_seq)
 	*/

 CREATE TABLE CHART(
music_no number(2),
music_rank number(2),
music_name varchar2(42),
singer_name varchar2(21),
album_name varchar2(42),
like_count number(4)
);


 
 create sequence chart_seq;
 
 insert into chart (music_no, music_rank, music_name, singer_name, album_name, like_count)values(chart_seq.nextval, 1, 'Congratulation','DAY6','1th mini',6666);
 insert into chart (music_no, music_rank, music_name, singer_name, album_name, like_count)values(chart_seq.nextval, 2, 'Queendom','Red Velvet','6th mini',5555);
 insert into chart (music_no, music_rank, music_name, singer_name, album_name, like_count)values(chart_seq.nextval, 3, 'Blue Flame','Astro','6th mini',5436);
 insert into chart (music_no, music_rank, music_name, singer_name, album_name, like_count)values(chart_seq.nextval, 4, 'Sunset','엔플라잉','6th mini',4567);
 insert into chart (music_no, music_rank, music_name, singer_name, album_name, like_count)values(chart_seq.nextval, 5, 'LO$ER=LO♡ER','Tomorrow X Togetter','fight',4321);
 insert into chart (music_no, music_rank, music_name, singer_name, album_name, like_count)values(chart_seq.nextval, 6, 'Windy Day','오마이걸','WindyDay',3789);
 insert into chart (music_no, music_rank, music_name, singer_name, album_name, like_count)values(chart_seq.nextval, 7, 'ASAP','STACY','STAYDOM',2899);
 insert into chart (music_no, music_rank, music_name, singer_name, album_name, like_count)values(chart_seq.nextval, 8, 'Bad guy','Billie Eilish','WHEN WE',2222);
 insert into chart (music_no, music_rank, music_name, singer_name, album_name, like_count)values(chart_seq.nextval, 9, 'Another Love','Tom Odell','another love',2000);
 insert into chart (music_no, music_rank, music_name, singer_name, album_name, like_count)values(chart_seq.nextval, 10, '파도가 끝나는 곳까지','DAY6','The book of Us',1000);
 
