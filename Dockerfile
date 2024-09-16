FROM openjdk:17
EXPOSE 8083
ADD target/DockerKuber.jar DockerKuber.jar
ENTRYPOINT ["java","-jar","/DockerKuber.jar"]