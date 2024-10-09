# Step 1: Build the JAR inside the Docker image
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Copy the JAR from the build stage into the final image
FROM amazoncorretto:17
WORKDIR /app
COPY --from=build /app/target/api-gateway-0.0.1-SNAPSHOT.jar /app/api-gateway.jar

# Expose the port the service will run on
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/api-gateway.jar"]