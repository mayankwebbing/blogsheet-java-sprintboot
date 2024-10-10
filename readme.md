# Blogsheet Project - README

## Project Overview

**Blogsheet** is a Spring Boot-based project designed for creating and managing social blogs. It uses a variety of Spring Boot starters to handle different functionalities such as web, security, data persistence, and more. This project is configured to run with Java 21 and uses Microsoft SQL Server as the database. Additionally, the project integrates JWT-based authentication and authorization.

## Requirements

To build and run this project, ensure that you have the following installed:

- Java 21
- Maven 3.8+
- A Microsoft SQL Server instance

## Dependencies

Below is a list of the major dependencies configured in the `pom.xml` file:

- **Spring Web** (for REST APIs)
- **Spring Data JPA** (for database access)
- **MS SQL Driver** (for MS SQL database)
- **Spring Security** (for authentication and authorization)
- **Spring Boot DevTools** (for hot reloading)
- **Lombok** (for reducing boilerplate code)
- **Spring Boot Actuator** (for monitoring and metrics)
- **Spring Boot Validation** (for input validation)
- **JJWT (Java JWT)** (for JWT-based authentication)
- **Spring Boot Test** (for testing)
- **Spring Security Test** (for security testing)

## Building the Project

To build the Blogsheet project, follow these steps:

1. **Clone the Repository** (if applicable)

   ```bash
   git clone https://github.com/mayankwebbing/blogsheet-java-sprintboot.git
   cd blogsheet
   ```

2. **Build the Project**
   Run the following Maven command to build the project, install the dependencies and skip tests:

   ```bash
   mvn clean
   mvn install -DskipTests
   ```

3. **Running the Project**
   After successfully building the project, you can run it with the following command:
   ```bash
   mvn spring-boot:run -X
   ```

## Testing the Project

To run the tests configured in the project, execute:

```bash
mvn test
```

## Rebuilding the Project

In case you want to rebuild the project from scratch, follow these steps:

1. Clean the project to remove any previous build files:

   ```bash
   mvn clean
   ```

2. Build the project again with:
   ```bash
   mvn install
   ```

## Database Configuration

This project uses Microsoft SQL Server as the default database. Make sure to configure your `application.properties` (or `application.yml`) to point to your database instance:

```properties
spring.datasource.url=jdbc:sqlserver://<your-database-url>;databaseName=<db-name>
spring.datasource.username=<db-username>
spring.datasource.password=<db-password>
spring.jpa.hibernate.ddl-auto=update
```

## Additional Information

- **Java Version**: 21
- **Spring Boot Version**: 3.3.4
- **Build Tool**: Maven 3.8+
- **Database**: Microsoft SQL Server

If you run into any issues or have questions, feel free to refer to the official [Spring Boot documentation](https://spring.io/projects/spring-boot) or contact the project maintainers.
