CREATE TABLE `user_info` (
  id                   INT                     NOT NULL AUTO_INCREMENT,
  name                 varchar(100)            DEFAULT '' NOT NULL,
  age                  INT                     NOT NULL,
  PRIMARY KEY (id)
) ENGINE = InnoDB CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '用户信息';

CREATE TABLE `directives` (
  id                   INT                     NOT NULL AUTO_INCREMENT,
  name                 varchar(50)            DEFAULT '' NOT NULL,
  code                 varchar(50)            DEFAULT '' NOT NULL,
  arguments            varchar(100)            DEFAULT '' NOT NULL,
  dec                  varchar(100)            DEFAULT '' NOT NULL,
  PRIMARY KEY (id)
) ENGINE = InnoDB CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '指令集合';