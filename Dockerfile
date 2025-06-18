# Etapa 1: Compilar con Maven + Java 21
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests
RUN jar tf /app/target/*.jar | grep postgresql

# Etapa 2: Ejecutar el .jar
FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app

# 👉 Agregá esto para test de red:
RUN apk add curl && \
    curl https://google.com && \
    curl https://db.nvyqvesaqtvvuwwwbkua.supabase.co:5432 || echo "🔥 No se pudo contactar Supabase"

COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
