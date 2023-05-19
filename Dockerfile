FROM java:8
EXPOSE 8082
COPY target/Agence-de-voyage-WS-1.0.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
