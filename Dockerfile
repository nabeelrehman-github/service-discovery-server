FROM openjdk:8-alpine

COPY target/server-0.0.1-SNAPSHOT.jar test-server.jar
WORKDIR /
VOLUME /tmp
EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/test-server.jar"]

