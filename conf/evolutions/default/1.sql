# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table copyofcustomfieldvalue (
  id                        bigint auto_increment not null,
  issue                     bigint,
  customfield               bigint,
  parentkey                 varchar(255),
  stringvalue               varchar(255),
  numbervalue               bigint,
  textvalue                 varchar(255),
  datevalue                 datetime,
  valuetype                 varchar(255),
  constraint pk_copyofcustomfieldvalue primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table copyofcustomfieldvalue;

SET FOREIGN_KEY_CHECKS=1;

