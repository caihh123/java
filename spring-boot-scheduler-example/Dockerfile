# 使用OpenJDK作为基础镜像
FROM openjdk:11-jre-slim

# 作者信息
MAINTAINER YourName <yourname@example.com>

# 设置应用程序的工作目录
WORKDIR /app

# 将构建好的JAR文件复制到容器内
COPY target/spring-boot-scheduler-example-1.0-SNAPSHOT.jar app.jar

# 运行Java应用程序
ENTRYPOINT ["java", "-jar", "app.jar"]
