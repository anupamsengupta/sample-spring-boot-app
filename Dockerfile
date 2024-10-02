# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR file from the target directory to the container
ARG JAR_FILE
COPY ${JAR_FILE} app.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]

#TO RUN
#docker run -p 8080:8080 anupamsen/sb-application-hw:0.0.1-SNAPSHOT

#TO TAG
#docker tag anupamsen/sb-application-hw:0.0.1-SNAPSHOT anupamsen/sb-application-hw:latest

#TO PUSH
#docker push anupamsen/sb-application-hw:latest
