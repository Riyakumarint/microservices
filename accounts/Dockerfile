# Start with a base image containing java runtime
FROM openjdk:17-jdk-slim

#Information around who maintains the image
MAINTAINER riyakumaribkj@gmail.com

# Add the application's22 jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]