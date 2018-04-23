# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table game (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  age                           varchar(255),
  description                   varchar(255),
  category_id                   bigint,
  constraint pk_game primary key (id)
);

create table review (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  description                   varchar(255),
  name                          varchar(255),
  constraint pk_review primary key (id)
);

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table game add constraint fk_game_category_id foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_game_category_id on game (category_id);


# --- !Downs

alter table game drop constraint if exists fk_game_category_id;
drop index if exists ix_game_category_id;

drop table if exists category;

drop table if exists game;

drop table if exists review;

drop table if exists user;

