FROM maven:3-openjdk-17 as build

WORKDIR /workspace/app

COPY src/ src/
COPY pom.xml ./

# XXX: Don't compile and run tests as long as the tests require a working JDBC connection.
RUN mvn -B -Dmaven.test.skip=true -f pom.xml clean package


FROM openjdk:17-slim

VOLUME /tmp
COPY --from=build /workspace/app/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
