CREATE TABLE `user_info` (
  id                   INT                     NOT NULL AUTO_INCREMENT,
  name                 varchar(100)            DEFAULT '' NOT NULL,
  age                  INT                     NOT NULL,
  PRIMARY KEY (id)
) ENGINE = InnoDB CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '用户信息';