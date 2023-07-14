# GreenStitch_BackEnd_Assignment

This is the backend implementation for the GreenStitch login and signup REST API with security features and JSON Web Tokens (JWT) authentication.

Project Description
The project is built on the Spring Boot framework and utilizes the H2 database for storing user account information. It provides endpoints for user signup, login, and a protected "Hello" endpoint.

Installation and Setup

1. Clone the repository to your local machine
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse, etc.).
3. Build the project using Maven or your IDE's build tools.
4. Configure the H2 database connection:
     Open the application.properties file in the src/main/resources directory.
     Modify the spring.datasource.url property to set the H2 database connection details.
5. Run the application:
     Execute the main method in the GreenStitchAssignmentApplication class.
     The application will start on the default port 8080.

6. Access the H2 console:
    Open your web browser and go to http://localhost:8080/h2-console.
   Enter the JDBC URL: jdbc:h2:mem:test.
   Username: sa.
   Password: Meer.

API Endpoints
  
  User Signup
    Endpoint: POST /api/auth/signup
    Description: Creates a new user account.
    Request Body:
        {
          "username": "Meer1",
        "password": "Meer@123"
        }
    Response: 201 Created if the user account is created successfully.

  User Login
    Endpoint: POST /api/auth/login
    Description: Authenticates the user and generates a JWT token.
    Request Body:
            {
              "username": "Meer1",
              "password": "Meer@123"
            }
    Response: 200 OK with the JWT token if authentication is successful.

Hello Endpoint
   Endpoint: POST /api/auth/hello
   Description: Returns a "Hello from GreenStitch" message.
   Authorization: Include the JWT token in the Authorization header of the request.        

Additional Dependencies
 
 The project uses the following additional dependencies:
    Spring Security: Provides authentication and authorization features.
    Spring Data JPA: Simplifies database access and management.
    Spring Web: Enables building RESTful APIs.
    H2 Database: In-memory database for development purposes.
    JSON Web Token (JWT): For user authentication and authorization.

Testing
   You can use Postman or any API testing tool to test the endpoints of the application. Make 
   sure to include the necessary request bodies and authorization headers when required.

Conclusion
  This project provides a secure and scalable backend implementation for the GreenStitch login 
  and signup REST API. It utilizes Spring Boot, H2 database, and JWT authentication to ensure 
  data protection and authorized access to protected resources.








  

