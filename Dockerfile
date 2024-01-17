FROM openjdk:17-alpine
COPY . .
COPY target/com.springdemo-0.0.1-SNAPSHOT.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","/com.springdemo-0.0.1-SNAPSHOT.jar"]
