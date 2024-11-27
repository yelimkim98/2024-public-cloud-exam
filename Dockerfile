FROM amazoncorretto:17.0.13-alpine3.20

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

ENV RDS_USER=defaultuser
ENV RDS_PASSWORD=defaultpassword

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java -jar -DRDS_USER=${RDS_USER} -DRDS_PASSWORD=${RDS_PASSWORD} app.jar"]
