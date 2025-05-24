
# Use Eclipse Temurin Java 17 (Alpine version)
FROM eclipse-temurin:17-jre-alpine


WORKDIR /opt/app

COPY target/app.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
