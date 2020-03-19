drop table if EXISTS  order_info;
create table order_info(
	order_id  varchar(20) PRIMARY key COMMENT '订单编号',
goods_id varchar(20) not null COMMENT '商品编号',
	price  FLOAT(10,2) not null COMMENT '单价',
	amount int(10) not null COMMENT '数量',
	state  tinyint(4)  not null COMMENT '状态',
	create_date TIMESTAMP COMMENT '创建时间',
	creat_by varchar(10) COMMENT '创建人',
	update_date TIMESTAMP COMMENT '更新时间',
	update_by varchar(10) COMMENT '更新人'
)