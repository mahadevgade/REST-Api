

FROM openjdk:20-jdk

COPY target/REST-APIs_SB.jar REST-APIs_SB.jar

EXPOSE 8080 

ENTRYPOINT ["java", "-jar", "REST-APIs_SB.jar"]  
