# ShopSphere

A backend e-commerce platform built using Java, Spring Boot, Spring Security, Spring Data JPA, Hibernate, and MySQL.

## Features

* User registration and login authentication
* Secure API endpoints with Spring Security
* Product management (add, view, update, delete)
* RESTful API architecture
* Database integration with MySQL
* Layered architecture (Controller, Service, Repository)

## Tech Stack

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* MySQL
* Maven

## Project Structure

* `controller/` - Handles API requests
* `service/` - Business logic
* `repository/` - Database access
* `entity/` - Database models
* `config/` - Security and app configuration

## How to Run

1. Clone the repository.
2. Open the project in your IDE.
3. Configure MySQL database in `application.properties`.
4. Run the Spring Boot application.
5. Test APIs using Postman.

## Sample API Endpoints

* `GET /api/products` - View all products
* `POST /api/products` - Add product
* `GET /api/viewUsers` - View users
* `POST /api/auth/login` - Login

## Future Improvements

* JWT authentication
* Order management
* Payment integration
* Admin dashboard

## Author

Built by Pavan Dharme.

