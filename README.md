1. Delete unneccessary containers and images
2. for accounts,loans,cards,configserver run to make images using jib
mvn compile jib:dockerBuild
3. run this command to upload docker file to hub
docker image push docker.io/riya0524/configserver:v2 
docker image push docker.io/riya0524/loans:v2
docker image push docker.io/riya0524/cards:v2
docker image push docker.io/riya0524/accounts:v2
4. go to docker-compose and run - so that containers are going to get started
cd docker-compose/
cd default
docker compose up -d
5. 



