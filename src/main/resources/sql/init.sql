CREATE DATABASE ds_0;
USE ds_0;
CREATE TABLE t_user (
  id        BIGINT(64)  NOT NULL,
  name      VARCHAR(20) NOT NULL,
  city      VARCHAR(20) NOT NULL,
  db_source VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
INSERT INTO ds_0.t_user (id, city, name, db_source) VALUES (1001, '张三', '北京', database());

CREATE DATABASE ds_1;
USE ds_1;
CREATE TABLE t_user (
  id        BIGINT(64)  NOT NULL,
  name      VARCHAR(20) NOT NULL,
  city      VARCHAR(20) NOT NULL,
  db_source VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
INSERT INTO ds_1.t_user (id, city, name, db_source) VALUES (1002, '李四', '上海', database());

CREATE DATABASE ds_2;
USE ds_2;
CREATE TABLE t_user (
  id        BIGINT(64)  NOT NULL,
  name      VARCHAR(20) NOT NULL,
  city      VARCHAR(20) NOT NULL,
  db_source VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
INSERT INTO ds_2.t_user (id, city, name, db_source) VALUES (1003, '李四', '上海', database());


