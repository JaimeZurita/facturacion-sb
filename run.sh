docker container rm facturacionApp

docker run --publish 8180:8080 -d --rm --name facturacionApp facturacion-sb
