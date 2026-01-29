🚀 || Microservices Architecture with Spring Boot || 

📌 About the Project

This project showcases a production-ready microservices architecture built with Spring Boot and Spring Cloud, following real-world enterprise design principles. It demonstrates key architectural patterns such as API Gateway, Service Discovery, Centralized Configuration, and Circuit Breaker to achieve scalability, resilience, and clean separation of concerns.

Each microservice is independently deployable and communicates via RESTful APIs, ensuring loose coupling, fault tolerance, and maintainability. The project is well-suited for learning microservices, technical interviews, and as a reference implementation for enterprise-grade applications.

⭐ If you find this project useful, please consider giving it a star!

-------------------------------------------

🧩 System Components

- User Service – Manages user-related operations  
- Address Service – Manages address-related operations  
- Config Server – Centralized configuration management  
- Eureka Server – Service discovery and registration  
- API Gateway – Intelligent request routing and resilience handling  

--------------------------------------------------

🏗 Architecture


- Single entry point via API Gateway
- Dynamic service discovery with Eureka
- Inter-service communication via Feign Client
- Fault tolerance using Circuit Breaker (Resilience4j)
- Centralized configuration using Spring Cloud Config

<img width="743" height="404" alt="image" src="https://github.com/user-attachments/assets/7b6c7e73-8285-49b3-8751-d0d99eed3ca5" />









------------------------------------

🧪 Service Details:

🔹 User Service >>
Port: 8081 >>
Responsibility: User creation and retrieval >>
Communication: Uses Feign Client to access Address Service

🔹 Address Service >>
Port: 8082 >>
Responsibility: Address management and lookup

🔹 Config Server >>
Port: 8084 >>
Responsibility: Centralized external configuration >>
Source: Git repository or local configuration files

🔹 Eureka Server >>
Port: 8761 >>
Responsibility: Service registration and discovery

🔹 API Gateway >>
Port: 8083 >>
Responsibility: Routes client requests to services >>
Resilience: Circuit breaker implementation for fault tolerance

------------------------------------------------

Contributing:
Contributions are welcome! Please fork the repository and create a pull request with your changes.

