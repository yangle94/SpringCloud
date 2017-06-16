FROM java:8
VOLUME /tmp
ADD springboot-admin.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","--spring.cloud.config.profile=prod"]