FROM openjdk:11-jre-alpine
ARG JAR_PATH=./build/lib/*.jar
COPY ${JAR_PATH} app.jar
ENTRY ["java","-jar","./app.jar"] 