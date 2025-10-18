# Step 1: Chọn image Java
FROM eclipse-temurin:17-jdk-alpine

# Step 2: Tạo thư mục cho ứng dụng
WORKDIR /app

# Step 3: Copy file jar đã build vào container
COPY target/MovieTicker-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Expose cổng ứng dụng
EXPOSE 8080

# Step 6: Chạy ứng dụng Spring Boot
ENTRYPOINT ["java","-jar","app.jar"]
