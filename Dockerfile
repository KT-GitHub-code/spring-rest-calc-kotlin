FROM openjdk:18-jdk-alpine
VOLUME /tmp
COPY target/RestCalcKotlin-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
