# SpringCloud
## 基于SpringCloud进行微服务系统的构建

1. SpringBootAdmin         服务监控

2. SpringBootConfig        配置中心

3. SpringBootApiGetWay     网关

4. SpringBootNetflix       注册中心

5. SpringBootOne           一个服务者

## 所需要的其他基础设施

```bash

docker run -d --hostname rabbitmq1 --name rabbitmq -p 15672:15672 -p 5672:5672 -e RABBITMQ_DEFAULT_USER=user -e RABBITMQ_DEFAULT_PASS=123456 rabbitmq

docker run --name mongo -v /Users/Angle/project/dockerData/mongo:/data/db -p 27017:27017 -d mongo

docker run --name mysql -v /Users/Angle/project/dockerData/mysql:/var/lib/mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mysql

docker run --name redis -p 6379:6379 -d redis
```