FROM openjdk:17-jdk-slim-buster
VOLUME /tmp
COPY build/libs/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]
EXPOSE 8081