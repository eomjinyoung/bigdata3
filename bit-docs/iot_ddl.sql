-- 사용자
DROP TABLE IF EXISTS iot_user RESTRICT;

-- 장비
DROP TABLE IF EXISTS iot_device RESTRICT;

-- 사용자
CREATE TABLE iot_user (
  uno   INTEGER      NOT NULL COMMENT '일련번호', -- 일련번호
  email VARCHAR(40)  NULL     COMMENT '이메일', -- 이메일
  name  VARCHAR(50)  NULL     COMMENT '이름', -- 이름
  pwd   VARCHAR(50)  NULL     COMMENT '암호', -- 암호
  token VARCHAR(255) NULL     COMMENT '토큰' -- 토큰
)
COMMENT '사용자';

-- 사용자
ALTER TABLE iot_user
  ADD CONSTRAINT PK_iot_user -- 사용자 기본키
    PRIMARY KEY (
      uno -- 일련번호
    );

-- 사용자 유니크 인덱스
CREATE UNIQUE INDEX UIX_iot_user
  ON iot_user ( -- 사용자
    email ASC -- 이메일
  );

-- 사용자 유니크 인덱스2
CREATE UNIQUE INDEX UIX_iot_user2
  ON iot_user ( -- 사용자
    token ASC -- 토큰
  );

ALTER TABLE iot_user
  MODIFY COLUMN uno INTEGER NOT NULL AUTO_INCREMENT COMMENT '일련번호';

-- 장비
CREATE TABLE iot_device (
  dno INTEGER     NOT NULL COMMENT '일련번호', -- 일련번호
  sno VARCHAR(20) NULL     COMMENT '시리얼번호', -- 시리얼번호
  uno INTEGER     NULL     COMMENT '일련번호2' -- 일련번호2
)
COMMENT '장비';

-- 장비
ALTER TABLE iot_device
  ADD CONSTRAINT PK_iot_device -- 장비 기본키
    PRIMARY KEY (
      dno -- 일련번호
    );

-- 장비 유니크 인덱스
CREATE UNIQUE INDEX UIX_iot_device
  ON iot_device ( -- 장비
    sno ASC -- 시리얼번호
  );

ALTER TABLE iot_device
  MODIFY COLUMN dno INTEGER NOT NULL AUTO_INCREMENT COMMENT '일련번호';

-- 장비
ALTER TABLE iot_device
  ADD CONSTRAINT FK_iot_user_TO_iot_device -- 사용자 -> 장비
    FOREIGN KEY (
      uno -- 일련번호2
    )
    REFERENCES iot_user ( -- 사용자
      uno -- 일련번호
    );