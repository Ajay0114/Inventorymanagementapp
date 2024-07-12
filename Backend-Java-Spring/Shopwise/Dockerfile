# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/Schedular-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port that your Spring Boot application uses
EXPOSE 9091

# Command to run the application when the container starts
CMD ["java", "-jar", "app.jar"]
