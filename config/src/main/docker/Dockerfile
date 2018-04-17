FROM java:8
VOLUME /tmp
ADD config.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT java $JAVA_OPTIONS -Djava.security.egd=file:/dev/./urandom -jar /app.jar