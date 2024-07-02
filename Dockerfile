FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/Java_PonteParaOMercado-0.0.1-SNAPSHOT.jar app.jar
COPY src/main/resources/application-mysql.properties application-mysql.properties

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar","--spring.profiles.active=mysql"]