FROM openjdk
COPY . /app
WORKDIR /app
CMD javac Calculator.java
