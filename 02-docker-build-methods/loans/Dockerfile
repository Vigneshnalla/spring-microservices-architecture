# starts with a base image contaningn Java runtime
FROM openjdk:17-jdk-slim

#Information around who maintains the image
LABEL MAINTAINER="vigneshnalla999@gmail.com"

# Add the application's jar to the image
COPY target/loans-0.0.1-SNAPSHOT.jar loans-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "loans-0.0.1-SNAPSHOT.jar"]