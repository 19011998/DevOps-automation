FROM openjdk:8
EXPOSE 8081
ADD target/Jenkins-Automation.jar Jenkins-Automation.jar
ENTRYPOINT ["java","-jar","/Jenkins-Automation.jar "]