1. mvn clean install
2. copy mvc-simple.war from target to images/payara
3. in the top of the projet: run docker-compose up --build

## challange2

1. test avec 5000 thread de 100 boucles appelant la page http://localhost:8080/mvc-simple/challenge . rapidement, certaines requetes
font des java.net.SocketException: Socket closed. et java.net.NoRouteToHostException: Cannot assign requested address (Address not available)
c'est la limite de port que le serveur peut ouvrir qui crée ce problème.
Se je n'avais pas coché l'option keepAlive dans le httpRequest cela aurait planté avec moins de request



 
