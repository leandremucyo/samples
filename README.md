# Running The App
   
   - Pre-requisite
       
       Secret configuration configurations are encrypted with ANYVALUE. Export the encryption key or add to env variables of the host
       
       key : ENCRYPT_KEY,      value : ANYVALUE
       
       Ex: LINUX-MAC 
         
         export ENCRYPT_KEY=ANYVALUE 
       
# Docker Clean

   docker stop $(docker ps -aq)

   docker rm $(docker ps -aq)

   docker rmi -f $(docker images -q)

# Building and Running Microservices

1. Build Images

   mvn clean package docker:build

2. Running All Microservices

   docker-compose -f docker/docker-compose.yml up


