FROM openjdk
COPY . /app
WORKDIR /app
CMD node Calculator.java
