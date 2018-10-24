#Docker Clean

docker stop $(docker ps -aq)

docker rm $(docker ps -aq)

docker rmi -f $(docker images -q)

#Building and Running Applications

1. Switch to working directory of the app

   cd /Users/cpt/degisa/dev/tut/apps/apps

2. Build Images

	mvn clean package docker:build
3. View Images

	docker images all

4. Running All Microservices

	docker-compose -f docker/docker-compose.yml up

