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

3. Rerruning a single service
   
   Build the service
   mvn clean package docker:build

   Run the service and specify the service name 
      add --no-deps to prevent restarting linked services, 
      add -d to running the service in detached mode

   docker-compose -f "docker/docker-compose.yml" up --build userservice





