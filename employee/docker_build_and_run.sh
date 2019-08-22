#!/bin/bash

mvn clean package -DskipTests
docker build --tag local/em-backend:v1 .
docker run --rm --link employee_database:db_employee --network employee_network -e SPRING_PROFILES_ACTIVE=docker local/em-backend:v1
