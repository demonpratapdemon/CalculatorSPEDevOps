FROM openjdk:8
MAINTAINER Pratap Kumar Chandra
COPY ./target/CalculatorSPEDevOps-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "CalculatorSPEDevOps-0.0.1-SNAPSHOT-jar-with-dependencies.jar"]