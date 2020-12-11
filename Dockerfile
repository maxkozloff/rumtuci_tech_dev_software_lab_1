FROM maven:3.5.2-jdk-8-alpine

COPY /target/lab1-1.0.jar mylab.jar
ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom","-jar","/mylab.jar"]