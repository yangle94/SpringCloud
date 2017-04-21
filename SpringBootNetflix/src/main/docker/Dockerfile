FROM java:8
VOLUME /tmp
ADD springboot-netflix.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","-spring.profiles.active=pord"]