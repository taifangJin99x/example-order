FROM java:8
ADD ./target/order-1.0.0-SNAPSHOT.jar /app/app.jar
VOLUME /tmp
EXPOSE 9003
ENTRYPOINT ["java","-jar","/app/app.jar"]