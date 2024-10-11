

FROM openjdk:17

COPY target/usrmgmt.jar usrmgmt.jar

EXPOSE 8080 

ENTRYPOINT ["java", "-jar", "usrmgmt.jar"]  