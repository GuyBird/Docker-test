FROM openjdk:7
COPY . /guybird/src/docker_test
WORKDIR /guybird/src/docker_test
RUN javac DockerTestProgram.java
CMD ["java", "DockerTestProgram"]