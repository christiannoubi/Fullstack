#!/bin/bash

mvn clean package -DskipTests
docker build --tag local/em-backend:v1 .
docker run --rm --link employee_database:db_employee --network employee_network local/em-backend:v1


docker build --tag local/em-frontend:v1 --no-cache .
docker run -d local/em-frontend:v1


docker-compose build --no-cache
docker-compose up






