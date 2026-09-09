# 📝 Spring Boot Tasks Management REST API

A lightweight RESTful Web Service built with Spring Boot, Spring Data JPA, and H2 In-Memory Database to manage task operations (CRUD).

---

##  Tech Stack & Tools

* **Language:** Java 17+
* **Framework:** Spring Boot 3.x
* **Data Access:** Spring Data JPA / Hibernate
* **Database:** H2 In-Memory Database
* **Utilities:** Lombok
* **Build Tool:** Maven

---

##  Project Structure

```text
src/main/java/com/example/demo/
├── controller/     # REST Endpoints Layer
├── service/        # Business Logic Layer
├── repository/     # Data Access Layer (Spring Data JPA)
└── model/
    ├── entity/     # JPA Entities (Database Models)
    └── dto/        # Data Transfer Objects

## Getting Started

```text 
Prerequisites
JDK 17 or higher

Maven 3.8+ installed (or use the included mvnw wrapper)

## Run the Application
```text
1 - Clone the repository:
.bash/
    git clone [https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git](https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git)
cd YOUR_REPOSITORY_NAME
2 - Run using Maven:
./mvnw spring-boot:run

The application will start on http://localhost:8080

3 - H2 Database Console
You can access the embedded H2 Database console in your browser while the application is running:

URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:hr_db
Username: sa
Password: (Leave Empty)

Method,Endpoint,Description
GET,/tasks/get-task?id={id},Fetch a task by ID
POST,/tasks/save-task,Create a new task
PUT,/tasks/update-task,Update an existing task
DELETE,/tasks/delete-task?id={id},Delete a task by ID