FROM java:8
VOLUME /tmp
ADD docker-day1-1.0.jar app.jar
#运行的时候对外提供的端口默认是8090，即便你在这里声明了3000也不会改变默认的端口8090
EXPOSE 8090
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
