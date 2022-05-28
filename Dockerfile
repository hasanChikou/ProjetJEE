FROM openjdk:17
ADD target/annoncemanager-0.0.1-SNAPSHOT.jar annoncemanager.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar" , "annoncemanager.jar"]