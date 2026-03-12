# ServletDemo – Java Servlet Login Application

## Overview

**ServletDemo** is a simple Java Web Application built using **Java Servlets**, **Maven**, and **Apache Tomcat**.
The project demonstrates how to create a basic servlet-based web application that handles HTTP requests, processes user input from a login form, performs validation, and returns responses to the browser.

This project was created as part of learning **Java Web Development fundamentals**, including servlets, web application deployment, and WAR packaging.

---

## Technologies Used

* Java
* Servlets (Jakarta Servlet API)
* Apache Maven
* Apache Tomcat
* HTML
* Git & GitHub

---

## Project Features

* Basic **Servlet-based web application**
* Login form using HTML
* Username validation
* Password validation using regex
* Servlet request handling (`doGet`, `doPost`)
* Maven build and WAR packaging
* Deployment to Apache Tomcat

---

## Project Structure

```
ServletDemo
│
├── src
│   └── main
│       ├── java
│       │   └── com.jay
│       │       ├── FirstServlet.java
│       │       └── LoginServlet.java
│       │
│       └── webapp
│           ├── index.html
│           └── login.html
│
├── pom.xml
└── target
```

---

## Servlet Flow

```
Browser Request
      ↓
Tomcat Web Container
      ↓
Servlet (LoginServlet / FirstServlet)
      ↓
Validation & Processing
      ↓
Response sent to Browser
```

---

## Login Validation Rules

### Username Rules

* Must start with a **capital letter**
* Minimum **3 characters**

Example:

```
Admin
John
Alice
```

### Password Rules

* Minimum **8 characters**
* Must contain **1 uppercase letter**
* Must contain **1 number**
* Must contain **exactly 1 special character**

Example:

```
Admin123@
```

---

## How to Build the Project

Using Maven:

```
mvn clean package
```

This generates a **WAR file** inside:

```
target/ServletDemo-1.0-SNAPSHOT.war
```

---

## Deployment

Copy the WAR file to the Tomcat webapps directory:

```
cp target/ServletDemo-1.0-SNAPSHOT.war /opt/homebrew/Cellar/tomcat/11.0.18/libexec/webapps
```

Start Tomcat:

```
/opt/homebrew/opt/tomcat/bin/catalina run
```

---

## Access the Application

Open in browser:

Login Page:

```
http://localhost:8080/ServletDemo-1.0-SNAPSHOT/login.html
```

First Servlet:

```
http://localhost:8080/ServletDemo-1.0-SNAPSHOT/hello
```

---

## Learning Objectives

This project demonstrates:

* Understanding of Java Servlets
* Handling HTTP Requests and Responses
* Form handling in web applications
* Input validation using Java
* Packaging web applications using Maven
* Deploying applications on Apache Tomcat

---

## Future Improvements

* Add JSP pages for UI
* Implement session management
* Connect with a database
* Add user authentication

Author

Jayanthi

Java Web Development Practice Project
