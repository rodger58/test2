FROM openjdk
COPY . /app
WORKDIR /app
RUN javac Calculator.java
CMD ["java","Calculator"]
