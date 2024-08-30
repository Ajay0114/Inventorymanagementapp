FROM openjdk:17-jdk-alpine

RUN apk update && \
    apk add --no-cache python3 py3-pip && \
    pip3 install --upgrade pip awscli && \
    apk del py-pip && \
    rm -rf /var/cache/apk/*

WORKDIR /app

COPY target/ShopClues-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
