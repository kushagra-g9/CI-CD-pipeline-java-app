
# Use Eclipse Temurin Java 17 (Alpine version)
FROM eclipse-temurin:17-jre-alpine

ARG artifact=target/spring-boot-app-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app

COPY ${artifact} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
