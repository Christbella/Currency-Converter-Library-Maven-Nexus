# Project Setup and Execution Guide

## Currency Converter Library (Without Nexus)

### Setup
- Navigate to the `without nexus` folder.
- Open the currency converter library project.

### Build
- Execute: `mvn clean install`

### Test
- Ensure Javadocs and unit tests are complete.
- Run tests as part of the build process.

## Spring Boot Application (Without Nexus)

### Setup
- Open the Spring Boot application in the `without nexus` folder.

### Integration
- Add the currency converter library as a dependency.

### Execution
- Run the application: `mvn spring-boot:run`
- Test the endpoint: `localhost:8080/convert?from=EUR&to=RWF&amount=50`

## Currency Converter Library (With Nexus)

### Nexus Setup
- Set up and configure Nexus Repository Manager.

### Maven Configuration
- In the `currency-converter` folder, update `settings.xml` for Nexus.

### Build and Deploy
- Execute: `mvn clean deploy`

## Spring Boot Application (With Nexus)

### Setup
- Open the `currency-converter-app` project.

### Nexus Dependency
- Configure to use the library from Nexus.

### Execution and Testing
- Start the application: `mvn spring-boot:run`
- Test the `/convert` endpoint.
