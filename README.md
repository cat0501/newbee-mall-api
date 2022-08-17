## 1 后端项目搭建

### 创建 maven 项目、添加依赖

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.6.4</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>


```

### 创建启动类 Bootstrap、包

```
----controller
----service
----dao
----common
----config
----util
```



### 初始化数据库

- 执行脚本 `newbee_mall_db_v2_schema.sql`

### 初始化配置文件

```properties
server.port=8001

spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/newbee_mall_db_v2?useUnicode=true&serverTimezone=Asia/Shanghai&characterEncoding=utf8&autoReconnect=true&useSSL=false&allowMultiQueries=true
spring.datasource.username=root
spring.datasource.password=123456
```

### 配置Swagger







## 2 前端项目搭建

- 地址：https://github.com/cat0501/newbee-mall-api/tree/master/newbee-mall-vue3-app-main

- Vue 项目启动

```bash
npm install

npm run serve
```





























































