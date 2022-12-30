FROM openjdk:17

COPY config/build/libs/ardito-cicdhandson-application.jar /var/ardito-cicdhandson-application.jar



CMD ["java","-jar","ardito-cicdhandson-application.jar"]