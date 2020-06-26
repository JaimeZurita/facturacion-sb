docker container rm facturacionApp
docker stop facturacionApp
docker run --publish 8180:8080 -d --network=dnet1 --rm --name facturacionApp facturacion-sb
