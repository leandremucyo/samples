# Docker Clean

	docker stop $(docker ps -aq)

	docker rm $(docker ps -aq)

	docker rmi -f $(docker images -q)

# Building and Running Microservices

1. Build Images

	mvn clean package docker:build

2. Running All Microservices

	docker-compose -f docker/docker-compose.yml up

