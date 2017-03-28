FROM centos_base_java:latest
ADD registry.jar /opt/jar/
ENV JAVA_HOME /opt/jdk1.8.0_121
ENV PATH $PATH:$JAVA_HOME/bin
CMD ["java","-jar","/opt/jar/registry.jar"]

