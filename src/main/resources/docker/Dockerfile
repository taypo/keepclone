FROM java:8
MAINTAINER bahadir.yagan@gmail.com
EXPOSE 8080
CMD java -jar -Djava.security.egd=file:/dev/./urandom keepclone.jar
VOLUME /app/keepclone

# This ment to be run from the build directory
ADD libs/keepclone.jar .
