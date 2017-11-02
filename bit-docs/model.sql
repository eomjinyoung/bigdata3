-- 수강신청
drop table if exists lect_appy restrict;

-- 강의
drop table if exists lect restrict;

-- 강사
drop table if exists tcher restrict;

-- 매니저
drop table if exists mgr restrict;

-- 강의실
drop table if exists croom restrict;

-- 학생
drop table if exists stud restrict;

-- 강의실사진
drop table if exists croom_phot restrict;

-- 강사사진
drop table if exists tch_phot restrict;

-- 강사배정
drop table if exists tchr_lect restrict;

-- 회원
drop table if exists memb restrict;

-- 코드조각
drop table if exists code restrict;

-- 콘텐츠
drop table if exists content restrict;

-- 게시판
drop table if exists board restrict;

-- 피드
drop table if exists feed restrict;

-- 태그
drop table if exists tag restrict;

-- 팔로잉
drop table if exists follow restrict;

-- 프로젝트
drop table if exists proj restrict;

-- 프로젝트회원
drop table if exists proj_memb restrict;

-- 자료실
drop table if exists download restrict;

-- 할일
drop table if exists todo restrict;

-- 콘텐츠파일링크
drop table if exists fil_lk restrict;

-- 수강신청
create table lect_appy (
	lano integer  not null comment '수강신청일련번호', -- 수강신청일련번호
	lno  integer  not null comment '강의일련번호', -- 강의일련번호
	sno  integer  not null comment '학생일련번호', -- 학생일련번호
	rdt  datetime not null comment '신청일', -- 신청일
	stat integer  null     comment '상태' -- 상태
)
comment '수강신청';

-- 수강신청
alter table lect_appy
	add constraint pk_lect_appy -- 수강신청 primary key
		primary key (
			lano -- 수강신청일련번호
		);

-- 수강신청 unique index
create unique index uix_lect_appy
	on lect_appy ( -- 수강신청
		lno asc, -- 강의일련번호
		sno asc  -- 학생일련번호
	);

alter table lect_appy
	modify column lano integer not null auto_increment comment '수강신청일련번호';

-- 강의
create table lect (
	lno   integer      not null comment '강의일련번호', -- 강의일련번호
	crmno integer      null     comment '강의실일련번호', -- 강의실일련번호
	mrno  integer      null     comment '매니저일련번호', -- 매니저일련번호
	titl  varchar(255) not null comment '제목', -- 제목
	dscp  text         not null comment '설명', -- 설명
	sdt   date         not null comment '시작일', -- 시작일
	edt   date         not null comment '종료일', -- 종료일
	qty   integer      not null comment '수강가능인원', -- 수강가능인원
	pric  integer      null     comment '수업료', -- 수업료
	thrs  integer      not null comment '총시간' -- 총시간
)
comment '강의';

-- 강의
alter table lect
	add constraint pk_lect -- 강의 primary key
		primary key (
			lno -- 강의일련번호
		);

-- 강의 index
create index ix_lect
	on lect( -- 강의
		titl asc -- 제목
	);

alter table lect
	modify column lno integer not null auto_increment comment '강의일련번호';

-- 강사
create table tcher (
	tno  integer      not null comment '강사일련번호', -- 강사일련번호
	hmpg varchar(255) null     comment '홈페이지', -- 홈페이지
	fcbk varchar(255) null     comment '페이스북', -- 페이스북
	twit varchar(255) null     comment '트위터' -- 트위터
)
comment '강사';

-- 강사
alter table tcher
	add constraint pk_tcher -- 강사 primary key
		primary key (
			tno -- 강사일련번호
		);

-- 매니저
create table mgr (
	mrno integer      not null comment '매니저일련번호', -- 매니저일련번호
	posi varchar(100) null     comment '직급', -- 직급
	fax  varchar(30)  null     comment '팩스', -- 팩스
	path varchar(255) not null comment '사진파일경로' -- 사진파일경로
)
comment '매니저';

-- 매니저
alter table mgr
	add constraint pk_mgr -- 매니저 primary key
		primary key (
			mrno -- 매니저일련번호
		);

-- 강의실
create table croom (
	crmno integer      not null comment '강의실일련번호', -- 강의실일련번호
	name  varchar(100) not null comment '이름' -- 이름
)
comment '강의실';

-- 강의실
alter table croom
	add constraint pk_croom -- 강의실 primary key
		primary key (
			crmno -- 강의실일련번호
		);

-- 강의실 unique index
create unique index uix_croom
	on croom ( -- 강의실
		name asc -- 이름
	);

alter table croom
	modify column crmno integer not null auto_increment comment '강의실일련번호';

-- 학생
create table stud (
	sno      integer      not null comment '학생일련번호', -- 학생일련번호
	work     char(1)      not null comment '재직여부', -- 재직여부
	lst_schl varchar(100) null     comment '최종학력', -- 최종학력
	schl_nm  varchar(100) null     comment '학교명', -- 학교명
	pst_no   varchar(10)  null     comment '우편번호', -- 우편번호
	bas_adr  varchar(255) null     comment '기본주소', -- 기본주소
	det_adr  varchar(255) null     comment '상세주소', -- 상세주소
	path     varchar(255) null     comment '사진파일경로' -- 사진파일경로
)
comment '학생';

-- 학생
alter table stud
	add constraint pk_stud -- 학생 primary key
		primary key (
			sno -- 학생일련번호
		);

-- 강의실사진
create table croom_phot (
	cpno  integer      not null comment '강의실사진일련번호', -- 강의실사진일련번호
	crmno integer      not null comment '강의실일련번호', -- 강의실일련번호
	path  varchar(255) not null comment '파일경로' -- 파일경로
)
comment '강의실사진';

-- 강의실사진
alter table croom_phot
	add constraint pk_croom_phot -- 강의실사진 primary key
		primary key (
			cpno -- 강의실사진일련번호
		);

alter table croom_phot
	modify column cpno integer not null auto_increment comment '강의실사진일련번호';

-- 강사사진
create table tch_phot (
	tpno integer      not null comment '강사사진일련번호', -- 강사사진일련번호
	tno  integer      not null comment '강사일련번호', -- 강사일련번호
	path varchar(255) not null comment '파일경로' -- 파일경로
)
comment '강사사진';

-- 강사사진
alter table tch_phot
	add constraint pk_tch_phot -- 강사사진 primary key
		primary key (
			tpno -- 강사사진일련번호
		);

alter table tch_phot
	modify column tpno integer not null auto_increment comment '강사사진일련번호';

-- 강사배정
create table tchr_lect (
	lno integer not null comment '강의일련번호', -- 강의일련번호
	tno integer not null comment '강사일련번호' -- 강사일련번호
)
comment '강사배정';

-- 강사배정
alter table tchr_lect
	add constraint pk_tchr_lect -- 강사배정 primary key
		primary key (
			lno, -- 강의일련번호
			tno  -- 강사일련번호
		);

-- 회원
create table memb (
	mno   integer      not null comment '회원일련번호', -- 회원일련번호
	name  varchar(100) not null comment '이름', -- 이름
	tel   varchar(30)  not null comment '전화', -- 전화
	email varchar(40)  not null comment '이메일', -- 이메일
	pwd   varchar(50)  not null comment '암호' -- 암호
)
comment '회원';

-- 회원
alter table memb
	add constraint pk_memb -- 회원 primary key
		primary key (
			mno -- 회원일련번호
		);

-- 회원 unique index
create unique index uix_memb
	on memb ( -- 회원
		email asc -- 이메일
	);

-- 회원 index
create index ix_memb
	on memb( -- 회원
		name asc -- 이름
	);

alter table memb
	modify column mno integer not null auto_increment comment '회원일련번호';

-- 코드조각
create table code (
	cdno  integer     not null comment '콘텐츠일련번호', -- 콘텐츠일련번호
	conts text        not null comment '코드', -- 코드
	pl    varchar(10) null     comment '프로그래밍언어' -- 프로그래밍언어
)
comment '코드조각';

-- 코드조각
alter table code
	add constraint pk_code -- 코드조각 primary key
		primary key (
			cdno -- 콘텐츠일련번호
		);

-- 콘텐츠
create table content (
	cono   integer  not null comment '콘텐츠일련번호', -- 콘텐츠일련번호
	mno    integer  not null comment '회원일련번호', -- 회원일련번호
	rdt    datetime not null comment '등록일', -- 등록일
	vw_cnt integer  not null comment '조회수' -- 조회수
)
comment '콘텐츠';

-- 콘텐츠
alter table content
	add constraint pk_content -- 콘텐츠 primary key
		primary key (
			cono -- 콘텐츠일련번호
		);

alter table content
	modify column cono integer not null auto_increment comment '콘텐츠일련번호';

-- 게시판
create table board (
	bdno  integer      not null comment '콘텐츠일련번호', -- 콘텐츠일련번호
	titl  varchar(255) not null comment '제목', -- 제목
	conts text         not null comment '내용' -- 내용
)
comment '게시판';

-- 게시판
alter table board
	add constraint pk_board -- 게시판 primary key
		primary key (
			bdno -- 콘텐츠일련번호
		);

-- 피드
create table feed (
	fdno  integer not null comment '콘텐츠일련번호', -- 콘텐츠일련번호
	conts text    not null comment '피드내용' -- 피드내용
)
comment '피드';

-- 피드
alter table feed
	add constraint pk_feed -- 피드 primary key
		primary key (
			fdno -- 콘텐츠일련번호
		);

-- 태그
create table tag (
	tgno   integer     not null comment '태그일련번호', -- 태그일련번호
	cono   integer     not null comment '콘텐츠일련번호', -- 콘텐츠일련번호
	tag_nm varchar(50) not null comment '태그명' -- 태그명
)
comment '태그';

-- 태그
alter table tag
	add constraint pk_tag -- 태그 primary key
		primary key (
			tgno -- 태그일련번호
		);

-- 태그 index
create index ix_tag
	on tag( -- 태그
		tag_nm asc -- 태그명
	);

alter table tag
	modify column tgno integer not null auto_increment comment '태그일련번호';

-- 팔로잉
create table follow (
	fowr_no integer not null comment '회원일련번호', -- 회원일련번호
	fwng_no integer not null comment '팔로잉대상회원일련번호' -- 팔로잉대상회원일련번호
)
comment '팔로잉';

-- 팔로잉
alter table follow
	add constraint pk_follow -- 팔로잉 primary key
		primary key (
			fowr_no, -- 회원일련번호
			fwng_no  -- 팔로잉대상회원일련번호
		);

-- 프로젝트
create table proj (
	pjno  integer      not null comment '콘텐츠일련번호', -- 콘텐츠일련번호
	titl  varchar(255) not null comment '프로젝트명', -- 프로젝트명
	conts text         not null comment '내용', -- 내용
	sdt   date         not null comment '시작일', -- 시작일
	edt   date         not null comment '종료일', -- 종료일
	path  varchar(255) null     comment '로고' -- 로고
)
comment '프로젝트';

-- 프로젝트
alter table proj
	add constraint pk_proj -- 프로젝트 primary key
		primary key (
			pjno -- 콘텐츠일련번호
		);

-- 프로젝트 index
create index ix_proj
	on proj( -- 프로젝트
		titl asc -- 프로젝트명
	);

-- 프로젝트회원
create table proj_memb (
	mno  integer     not null comment '회원일련번호', -- 회원일련번호
	pjno integer     not null comment '콘텐츠일련번호', -- 콘텐츠일련번호
	rol  varchar(10) null     comment '역할' -- 역할
)
comment '프로젝트회원';

-- 프로젝트회원
alter table proj_memb
	add constraint pk_proj_memb -- 프로젝트회원 primary key
		primary key (
			mno,  -- 회원일련번호
			pjno  -- 콘텐츠일련번호
		);

-- 자료실
create table download (
	dnno integer      not null comment '콘텐츠일련번호', -- 콘텐츠일련번호
	path varchar(255) not null comment '파일경로' -- 파일경로
)
comment '자료실';

-- 자료실
alter table download
	add constraint pk_download -- 자료실 primary key
		primary key (
			dnno -- 콘텐츠일련번호
		);

-- 할일
create table todo (
	tdno  integer      not null comment '할일일련번호', -- 할일일련번호
	mno   integer      null     comment '회원일련번호', -- 회원일련번호
	seq   integer      not null comment '순서', -- 순서
	conts varchar(255) not null comment '내용', -- 내용
	stat  varchar(10)  null     comment '상태', -- 상태
	stdt  datetime     null     comment '상태설정일', -- 상태설정일
	pjno  integer      null     comment '콘텐츠일련번호' -- 콘텐츠일련번호
)
comment '할일';

-- 할일
alter table todo
	add constraint pk_todo -- 할일 primary key
		primary key (
			tdno -- 할일일련번호
		);

-- 콘텐츠파일링크
create table fil_lk (
	cono integer not null comment '콘텐츠일련번호', -- 콘텐츠일련번호
	dnno integer not null comment '자료실파일일련번호' -- 자료실파일일련번호
)
comment '콘텐츠파일링크';

-- 콘텐츠파일링크
alter table fil_lk
	add constraint pk_fil_lk -- 콘텐츠파일링크 primary key
		primary key (
			cono, -- 콘텐츠일련번호
			dnno  -- 자료실파일일련번호
		);

-- 수강신청
alter table lect_appy
	add constraint fk_lect_to_lect_appy -- 강의 -> 수강신청
		foreign key (
			lno -- 강의일련번호
		)
		references lect ( -- 강의
			lno -- 강의일련번호
		);

-- 수강신청
alter table lect_appy
	add constraint fk_stud_to_lect_appy -- 학생 -> 수강신청
		foreign key (
			sno -- 학생일련번호
		)
		references stud ( -- 학생
			sno -- 학생일련번호
		);

-- 강의
alter table lect
	add constraint fk_mgr_to_lect -- 매니저 -> 강의
		foreign key (
			mrno -- 매니저일련번호
		)
		references mgr ( -- 매니저
			mrno -- 매니저일련번호
		);

-- 강의
alter table lect
	add constraint fk_croom_to_lect -- 강의실 -> 강의
		foreign key (
			crmno -- 강의실일련번호
		)
		references croom ( -- 강의실
			crmno -- 강의실일련번호
		);

-- 강사
alter table tcher
	add constraint fk_memb_to_tcher -- 회원 -> 강사
		foreign key (
			tno -- 강사일련번호
		)
		references memb ( -- 회원
			mno -- 회원일련번호
		);

-- 매니저
alter table mgr
	add constraint fk_memb_to_mgr -- 회원 -> 매니저
		foreign key (
			mrno -- 매니저일련번호
		)
		references memb ( -- 회원
			mno -- 회원일련번호
		);

-- 학생
alter table stud
	add constraint fk_memb_to_stud -- 회원 -> 학생
		foreign key (
			sno -- 학생일련번호
		)
		references memb ( -- 회원
			mno -- 회원일련번호
		);

-- 강의실사진
alter table croom_phot
	add constraint fk_croom_to_croom_phot -- 강의실 -> 강의실사진
		foreign key (
			crmno -- 강의실일련번호
		)
		references croom ( -- 강의실
			crmno -- 강의실일련번호
		);

-- 강사사진
alter table tch_phot
	add constraint fk_tcher_to_tch_phot -- 강사 -> 강사사진
		foreign key (
			tno -- 강사일련번호
		)
		references tcher ( -- 강사
			tno -- 강사일련번호
		);

-- 강사배정
alter table tchr_lect
	add constraint fk_tcher_to_tchr_lect -- 강사 -> 강사배정
		foreign key (
			tno -- 강사일련번호
		)
		references tcher ( -- 강사
			tno -- 강사일련번호
		);

-- 강사배정
alter table tchr_lect
	add constraint fk_lect_to_tchr_lect -- 강의 -> 강사배정
		foreign key (
			lno -- 강의일련번호
		)
		references lect ( -- 강의
			lno -- 강의일련번호
		);

-- 코드조각
alter table code
	add constraint fk_content_to_code -- 콘텐츠 -> 코드조각
		foreign key (
			cdno -- 콘텐츠일련번호
		)
		references content ( -- 콘텐츠
			cono -- 콘텐츠일련번호
		);

-- 콘텐츠
alter table content
	add constraint fk_memb_to_content -- 회원 -> 콘텐츠
		foreign key (
			mno -- 회원일련번호
		)
		references memb ( -- 회원
			mno -- 회원일련번호
		);

-- 게시판
alter table board
	add constraint fk_content_to_board -- 콘텐츠 -> 게시판
		foreign key (
			bdno -- 콘텐츠일련번호
		)
		references content ( -- 콘텐츠
			cono -- 콘텐츠일련번호
		);

-- 피드
alter table feed
	add constraint fk_content_to_feed -- 콘텐츠 -> 피드
		foreign key (
			fdno -- 콘텐츠일련번호
		)
		references content ( -- 콘텐츠
			cono -- 콘텐츠일련번호
		);

-- 태그
alter table tag
	add constraint fk_content_to_tag -- 콘텐츠 -> 태그
		foreign key (
			cono -- 콘텐츠일련번호
		)
		references content ( -- 콘텐츠
			cono -- 콘텐츠일련번호
		);

-- 팔로잉
alter table follow
	add constraint fk_memb_to_follow -- 회원 -> 팔로잉
		foreign key (
			fowr_no -- 회원일련번호
		)
		references memb ( -- 회원
			mno -- 회원일련번호
		);

-- 팔로잉
alter table follow
	add constraint fk_memb_to_follow2 -- 회원 -> 팔로잉2
		foreign key (
			fwng_no -- 팔로잉대상회원일련번호
		)
		references memb ( -- 회원
			mno -- 회원일련번호
		);

-- 프로젝트
alter table proj
	add constraint fk_content_to_proj -- 콘텐츠 -> 프로젝트
		foreign key (
			pjno -- 콘텐츠일련번호
		)
		references content ( -- 콘텐츠
			cono -- 콘텐츠일련번호
		);

-- 프로젝트회원
alter table proj_memb
	add constraint fk_proj_to_proj_memb -- 프로젝트 -> 프로젝트회원
		foreign key (
			pjno -- 콘텐츠일련번호
		)
		references proj ( -- 프로젝트
			pjno -- 콘텐츠일련번호
		);

-- 프로젝트회원
alter table proj_memb
	add constraint fk_memb_to_proj_memb -- 회원 -> 프로젝트회원
		foreign key (
			mno -- 회원일련번호
		)
		references memb ( -- 회원
			mno -- 회원일련번호
		);

-- 자료실
alter table download
	add constraint fk_content_to_download -- 콘텐츠 -> 자료실
		foreign key (
			dnno -- 콘텐츠일련번호
		)
		references content ( -- 콘텐츠
			cono -- 콘텐츠일련번호
		);

-- 할일
alter table todo
	add constraint fk_proj_memb_to_todo -- 프로젝트회원 -> 할일
		foreign key (
			mno,  -- 회원일련번호
			pjno  -- 콘텐츠일련번호
		)
		references proj_memb ( -- 프로젝트회원
			mno,  -- 회원일련번호
			pjno  -- 콘텐츠일련번호
		);

-- 할일
alter table todo
	add constraint fk_content_to_todo -- 콘텐츠 -> 할일
		foreign key (
			tdno -- 할일일련번호
		)
		references content ( -- 콘텐츠
			cono -- 콘텐츠일련번호
		);

-- 콘텐츠파일링크
alter table fil_lk
	add constraint fk_content_to_fil_lk -- 콘텐츠 -> 콘텐츠파일링크
		foreign key (
			cono -- 콘텐츠일련번호
		)
		references content ( -- 콘텐츠
			cono -- 콘텐츠일련번호
		);

-- 콘텐츠파일링크
alter table fil_lk
	add constraint fk_download_to_fil_lk -- 자료실 -> 콘텐츠파일링크
		foreign key (
			dnno -- 자료실파일일련번호
		)
		references download ( -- 자료실
			dnno -- 콘텐츠일련번호
		);