# FROM maven:3.8.5-openjdk-17 # for Java 17
FROM maven:3.1.4-jdk-17

WORKDIR /46330755Vehicleproject
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run