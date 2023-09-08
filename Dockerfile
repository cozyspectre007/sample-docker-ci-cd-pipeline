FROM localhost:8083/openjdk:8
EXPOSE 8080
ADD target/sample-docker-ci-cd-pipeline.jar sample-docker-ci-cd-pipeline.jar
ENTRYPOINT ["java","-jar","/sample-docker-ci-cd-pipeline.jar"]