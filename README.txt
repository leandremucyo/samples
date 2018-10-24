
github account
leandremucyo@gmail.com

Docker readiness
	sudo -i 							#get admin privelege on command line
	docker-machine restart				#start docker-machine if not running
	docker-machine env 					#view docker machine IP
	eval $(docker-machine env) 			#configure the command line for docker-machine ip

Switch to working directory of the app
	cd /Users/cpt/degisa/dev/tut/apps/apps
Build Image
	mvn clean package docker:build
View Image
	docker images all
run the image
	docker-compose -f docker/docker-compose.yml up

