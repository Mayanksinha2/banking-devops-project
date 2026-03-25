FROM eclipse-temurin:17-jdk
COPY target/BankingSystem-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]