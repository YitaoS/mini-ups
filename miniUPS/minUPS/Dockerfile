FROM gradle:6.3.0-jdk14
RUN mkdir /deploy
WORKDIR /deploy/
ADD . /deploy/
EXPOSE 12345
EXPOSE 45678
ENTRYPOINT ["gradle", "bootRun"]