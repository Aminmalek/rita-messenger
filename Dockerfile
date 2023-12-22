# Use a base image with Java 17
FROM openjdk:17 as build
WORKDIR /app

# Copy the project files and build the application
COPY . .
#RUN ./mvnw clean package


# Copy the built JAR file from the build stage
COPY target/rita-0.0.1-SNAPSHOT.jar .

# Set necessary environment variables for Oracle connection
# ENV ...

# Expose the port your application runs on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "rita.jar"]
