# README SpringMVCRestWithJetty

Simple user management system that performs CRUD operations.
Available features are,

* View current users
* Add a new user
* Delete an existing user
* Edit an existing user

Environment
-----------

* java 1.8.0_171
* Spring MVC 4.3.4.RELEASE
* Maven 3.2.1
* MySQL 5.6.28
* Jetty 9.3.8.v20160314
* Hibernate 5.3.2.Final

How to build
------------

* Import project.
* Build the project.
* To start the api,
    * Go to api -> main -> java -> com.hms.controller -> run the Application.java class to start the Jetty server.
    * Jetty Server will start on port 8081
    * To change the port, 
        * Go to api -> main -> resources -> embedded-jetty-context.xml and refer the bean class "com.hms.controller.EmbeddedServer" and you can find the argument with name "port" and change the value.
* To start the web-service,
    * Simply deploy the webservice:war exploded artifact in Tomcat Server and define a different port like 8080.
* index.html will start on localhost:8080 port and will listen to api calls from localhost:8081.

How to set up the project
-------------------------

Create a database using mysql.
Import the given database.sql configuration file using a mysql client.
Database and Table creation query can be found in databaseSQL.txt file. 


