-- 사용자
drop table if exists iot_user restrict;

-- 장비
drop table if exists iot_device restrict;

-- 사용자
create table iot_user (
  uno   integer      not null comment '일련번호', -- 일련번호
  email varchar(40)  null     comment '이메일', -- 이메일
  name  varchar(50)  null     comment '이름', -- 이름
  pwd   varchar(50)  null     comment '암호', -- 암호
  token varchar(255) null     comment '토큰' -- 토큰
)
comment '사용자';

-- 사용자
alter table iot_user
  add constraint pk_iot_user -- 사용자 기본키
    primary key (
      uno -- 일련번호
    );

-- 사용자 유니크 인덱스
create unique index uix_iot_user
  on iot_user ( -- 사용자
    email asc -- 이메일
  );

-- 사용자 유니크 인덱스2
create unique index uix_iot_user2
  on iot_user ( -- 사용자
    token asc -- 토큰
  );

alter table iot_user
  modify column uno integer not null auto_increment comment '일련번호';

-- 장비
create table iot_device (
  dno integer     not null comment '일련번호', -- 일련번호
  sno varchar(20) null     comment '시리얼번호', -- 시리얼번호
  uno integer     null     comment '일련번호2' -- 일련번호2
)
comment '장비';

-- 장비
alter table iot_device
  add constraint pk_iot_device -- 장비 기본키
    primary key (
      dno -- 일련번호
    );

-- 장비 유니크 인덱스
create unique index uix_iot_device
  on iot_device ( -- 장비
    sno asc -- 시리얼번호
  );

alter table iot_device
  modify column dno integer not null auto_increment comment '일련번호';

-- 장비
alter table iot_device
  add constraint fk_iot_user_to_iot_device -- 사용자 -> 장비
    foreign key (
      uno -- 일련번호2
    )
    references iot_user ( -- 사용자
      uno -- 일련번호
    );