FROM tomcat:8.5.77-jre8-temurin
LABEL container="henry200amaya@gmail.com"

COPY ./target/taller.war  /usr/local/tomcat/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]
