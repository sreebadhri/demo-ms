FROM eclipse-temurin:17

WORKDIR /app

COPY target/demo-ms-0.0.1-SNAPSHOT.jar /app/demo-ms.jar

ENTRYPOINT ["java", "-jar", "demo-ms.jar"]

#docker run -d -p 8080:8080 demo-ms
#docker build -t demo-ms .