CREATE TABLE `skill` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `category` varchar(50) NULL COMMENT '类别 0 - 前端 1 - 后端 2 - devops',
  `parentid` bigint(20) NULL COMMENT '父id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

insert into skill (name, category) values ('JavaScript', '0');
insert into skill (name, category) values ('Angular.js', '0');
insert into skill (name, category) values ('Angular', '0');
insert into skill (name, category) values ('React.js', '0');
insert into skill (name, category) values ('Vue.js', '0');
insert into skill (name, category) values ('React Native', '0');
insert into skill (name, category) values ('Node.js', '0');
insert into skill (name, category) values ('C', '1');
insert into skill (name, category) values ('C++', '1');
insert into skill (name, category) values ('Java', '1');
insert into skill (name, category) values ('Python', '1');
insert into skill (name, category) values ('Go', '1');
insert into skill (name, category) values ('Linux', '2');
insert into skill (name, category) values ('Nginx', '2');