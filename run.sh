docker container rm facturacionApp

docker run --publish 8081:8081 -d  --name facturacionApp facturacion-sb
