# Use official OpenJDK image as base image
FROM openjdk:22

# Set the working directory in the container
LABEL authors="KVSP"	
VOLUME /tmp
# Copy the JAR file into the container at /app
COPY target/hvaultApp-0.0.1-SNAPSHOT.jar app.jar

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]
