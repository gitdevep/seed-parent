# seed-parent
数据分析平台

#### 技术使用

[x] | 技术名 | 版本  
 :---: | :---: | :---:  
[x] | SpringBoot | 2.2.5.RELEASE   
[x] | JDBC(spring-boot-starter-jdbc) | 2.0.2.RELEASE  
[x] | Mybatis(tk.mybatis) | 4.1.5  
[x] | Druid(druid-spring-boot-starter) | 1.1.19   
[x] | lombok | 1.18.12    
[x] | Swagger2(springfox.swagger2) | 2.8.0   
[x] | Dubbo| 2.7.5  
[x] | Kafka(spring-kafka)| 2.4.2.RELEASE 
[x] | Zookeeper(dubbo-dependencies-zookeeper)| 2.7.5   
 
#### 使用说明

1. 项目使用了lombok，scala，因此开发使用的IDE需要安装lombok,scala的插件
2. 问题处理，参照 https://stackoverflow.com/

#### 开发环境

服务器 | c1 | c2  | c3 | c4 | c5 | c6
 :---: | :---: | :---:  | :---: | :---:  | :---: | :---:
zookeeper| √ | √  | √ | - | - | - 
kafka    | √ | √  | √ | - | - | - 
kafka    | √ | √  | √ | - | - | - 
hadoop   | √ | √  | √ | √ | - | - 
hbase    | - | √  | √ | √ | - | - 
hive     | - | -  | - | √ | - | - 
es       | - | -  | - | - | √ | - 
spark    | - | -  | - | - | √ | - 
redis    | - | -  | - | - | √ | - 
msyql    | - | -  | - | - | - | √ 
canal    | - | -  | - | - | - | √ 
 