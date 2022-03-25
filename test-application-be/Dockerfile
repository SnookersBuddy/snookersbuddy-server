FROM openjdk:18 as build
WORKDIR /workspace/app

COPY mvnw pom.xml .
COPY src/ src/
COPY .mvn .mvn

RUN ./mvnw clean package


FROM openjdk:18
VOLUME /tmp
COPY --from=build /workspace/app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
