FROM adoptopenjdk/openjdk11:latest

ENV PROFILE_ACTIVE=docker

COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar
CMD java -jar -Dspring.profiles.active=${PROFILE_ACTIVE} app.jar