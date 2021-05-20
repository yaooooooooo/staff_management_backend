CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) NOT NULL COMMENT '用户名',
  `eid` varchar(20) NOT NULL COMMENT '用户eid',
  `sex` varchar(5) NULL COMMENT '性别',
  `tel` varchar(50) NULL COMMENT '电话',
  `level` varchar(20) NULL COMMENT '级别',
  `parentid` bigint(20) NULL COMMENT '父id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


insert into user (name, eid) values ('陈庚', 'geng.a.chen');
insert into user (name, eid) values ('林睿', 'rui.a.lin');
insert into user (name, eid) values ('张飞', 'fei.zhang');
insert into user (name, eid) values ('吕布', 'bu.lv');