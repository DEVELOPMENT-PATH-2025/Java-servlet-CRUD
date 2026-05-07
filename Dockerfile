# Use Tomcat 10.1 with Java 17
FROM tomcat:10.1-jdk17

# Remove default Tomcat webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file to Tomcat webapps
COPY target/Java-servlet-CRUD-1.0.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]