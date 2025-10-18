# ===== Stage 1: Build =====
FROM maven:3.9.3-eclipse-temurin-17 AS build

# Set working directory
WORKDIR /app

# Copy pom.xml và source code
COPY pom.xml .
COPY src ./src

# Build the Spring Boot application
RUN mvn clean package -DskipTests

# ===== Stage 2: Run =====
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy jar từ stage build
COPY --from=build /app/target/*.jar app.jar

# Expose port
EXPOSE 8080


# Run Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
