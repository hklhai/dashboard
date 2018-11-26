create table LINE_SOURCE
(
  sid        NUMBER(20) not null,
  showkey    VARCHAR2(20),
  showvalue  NUMBER(10,2),
  showvalue1 NUMBER(10,2),
  showvalue2 NUMBER(10,2),
  showvalue3 NUMBER(10,2),
  showvalue4 NUMBER(10,2)
);
INSERT INTO   line_source   VALUES ('1', 'Forest', '320.00', '332.00', '301.00', '334.00', '390.00');
INSERT INTO   line_source   VALUES ('2', 'Steppe', '220.00', '182.00', '191.00', '234.00', '290.00');
INSERT INTO   line_source   VALUES ('3', 'Desert', '150.00', '232.00', '201.00', '154.00', '190.00');
INSERT INTO   line_source   VALUES ('4', 'Wetland', '98.00', '77.00', '101.00', '99.00', '40.00');
commit;

CREATE TABLE   pie_source   (
    sid   number(20) NOT NULL  ,
    showkey   varchar(20) DEFAULT NULL,
    showvalue   number(10,2) DEFAULT NULL
);
INSERT INTO   pie_source   VALUES ('1', '直接访问', '21.00');
INSERT INTO   pie_source   VALUES ('2', '邮件营销', '16.00');
INSERT INTO   pie_source   VALUES ('3', '联盟广告', '38.00');
INSERT INTO   pie_source   VALUES ('4', '视频广告', '42.00');
INSERT INTO   pie_source   VALUES ('5', '搜索引擎', '12.00');
INSERT INTO   pie_source   VALUES ('6', '简介访问', '35.00');
INSERT INTO   pie_source   VALUES ('7', '抖音广告', '47.00');
commit;



CREATE TABLE   pie_source_double   (
    sid   number(20) NOT NULL  ,
    showkey   varchar(20) DEFAULT NULL,
    showvalue   number(10,2) DEFAULT NULL,
    showvalue2   number(10,2) DEFAULT NULL
);
INSERT INTO   pie_source_double   VALUES ('1', '直接访问', '21.00', '21.00');
INSERT INTO   pie_source_double   VALUES ('2', '邮件营销', '16.00', '16.00');
INSERT INTO   pie_source_double   VALUES ('3', '联盟广告', '38.00', '38.00');
INSERT INTO   pie_source_double   VALUES ('4', '视频广告', '42.00', '42.00');
INSERT INTO   pie_source_double   VALUES ('5', '搜索引擎', '12.00', '12.00');
INSERT INTO   pie_source_double   VALUES ('6', '简介访问', '35.00', '35.00');
INSERT INTO   pie_source_double   VALUES ('7', '抖音广告', '47.00', '47.00');
commit;



create table BAR_SOURCE
(
  sid        NUMBER(20) not null,
  showkey    VARCHAR2(20),
  showvalue  NUMBER(10,2),
  showvalue1 NUMBER(10,2),
  showvalue2 NUMBER(10,2),
  showvalue3 NUMBER(10,2),
  showvalue4 NUMBER(10,2)
);
INSERT INTO   BAR_SOURCE   VALUES ('1', 'Forest', '320.00', '332.00', '301.00', '334.00', '390.00');
INSERT INTO   BAR_SOURCE   VALUES ('2', 'Steppe', '220.00', '182.00', '191.00', '234.00', '290.00');
INSERT INTO   BAR_SOURCE   VALUES ('3', 'Desert', '150.00', '232.00', '201.00', '154.00', '190.00');
INSERT INTO   BAR_SOURCE   VALUES ('4', 'Wetland', '98.00', '77.00', '101.00', '99.00', '40.00');
commit;


create view  view_bar_source as select * from  bar_source;
create view  view_line_source as select * from  line_source;
create view  view_pie_source as select * from  pie_source;
create view  view_pie_source_double as select * from  pie_source_double;