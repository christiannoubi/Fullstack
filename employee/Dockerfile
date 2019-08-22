FROM openjdk:8-jdk-alpine

RUN mkdir /employee
WORKDIR /employee
COPY target/employee.jar .

EXPOSE 8080
CMD ["java", "-jar", "employee.jar"]