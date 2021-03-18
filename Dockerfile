FROM ubuntu:18.04

RUN adduser projobj
WORKDIR /home/projobj

RUN apt-get update && apt-get upgrade -y
RUN apt install -y vim curl gnupg git dpkg wget

# JAVA
RUN apt install -y openjdk-8-jdk

# SCALA
RUN apt-get update && apt-get upgrade -y
RUN wget https://downloads.lightbend.com/scala/2.12.8/scala-2.12.8.deb 
RUN dpkg -i scala-2.12.8.deb

#NPM
RUN apt-get install -y npm
RUN npm install -g n
RUN n latest
# RUN apt-get update && apt-get upgrade -y
# RUN apt install -y nodejs
# RUN npm install -g npm@latest

#SBT
RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list
RUN curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | apt-key add

RUN apt-get update && apt-get upgrade -y
RUN apt-get install sbt

USER projobj

VOLUME /home/projobj/host_data

EXPOSE 3000
EXPOSE 9000
