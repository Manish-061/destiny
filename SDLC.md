# 1. SDLC (Software Development Life Cycle)

## What is SDLC?

SDLC is a structured process used to design, develop, test, deploy, and maintain software applications.

Its primary goal is to deliver high-quality software that satisfies business requirements while minimizing cost, risk, and development time.

## SDLC Phases

```text
Requirements Gathering
        ↓
Planning
        ↓
Design
        ↓
Development
        ↓
Testing
        ↓
Deployment
        ↓
Maintenance
```

### 1. Requirements Gathering
- Understand client/business requirements.
- Gather functional and non-functional requirements.
- Create SRS (Software Requirement Specification).

### 2. Planning
- Estimate resources.
- Define project timeline.
- Identify risks.

### 3. Design
- Design application architecture.
- Design database schema.
- Design APIs and UI.

### 4. Development
- Developers write application code.

### 5. Testing
- Verify application functionality.
- Detect and fix bugs.

Types:
- Unit Testing
- Integration Testing
- System Testing
- UAT (User Acceptance Testing)

### 6. Deployment
- Release application to production.

### 7. Maintenance
- Bug fixes.
- Feature enhancements.
- Performance improvements.

---

## Common SDLC Models

### Waterfall Model

```text
Requirements
    ↓
Design
    ↓
Development
    ↓
Testing
    ↓
Deployment
```

Characteristics:
- Sequential process.
- Difficult to accommodate changes.

### Agile Model

```text
Sprint 1
Sprint 2
Sprint 3
...
```

Characteristics:
- Iterative development.
- Frequent releases.
- Continuous feedback.

### Spiral Model

Characteristics:
- Risk-driven model.
- Suitable for large and complex projects. 

---

# 2. PLC (Product Life Cycle)

## What is PLC?

PLC describes the complete lifecycle of a product in the market, from creation to retirement.

---

## PLC Stages

```text
Development
      ↓
Introduction
      ↓
Growth
      ↓
Maturity
      ↓
Decline
```



## SDLC vs PLC

| SDLC | PLC |
|--------|--------|
| Software development process | Product lifecycle |
| Focus on building software | Focus on product success |
| Ends after maintenance | Ends after product retirement |
| Used by developers | Used by product/business teams |

---

# 3. Agile

## What is Agile?

Agile is a software development methodology that focuses on:

- Iterative development
- Customer collaboration
- Frequent software delivery
- Adaptability to changing requirements

---

## Waterfall vs Agile

### Waterfall

```text
Requirements
 ↓
Design
 ↓
Development
 ↓
Testing
 ↓
Deployment
```

### Agile

```text
Plan
 ↓
Develop
 ↓
Test
 ↓
Release
 ↓
Feedback
 ↓
Repeat
```

---

## Agile Principles

- Deliver working software frequently.
- Welcome changing requirements.
- Collaborate closely with customers.
- Focus on working software.
- Continuously improve processes.

---

## Benefits

- Faster delivery
- Better customer satisfaction
- Improved flexibility
- Continuous feedback

---

# 4. Scrum

## What is Scrum?

Scrum is the most popular Agile framework used to implement Agile principles.

```text
Agile = Philosophy
Scrum = Framework
```

---

## Scrum Workflow

```text
Product Backlog
       ↓
Sprint Planning
       ↓
Sprint
       ↓
Daily Scrum
       ↓
Sprint Review
       ↓
Sprint Retrospective
       ↓
Next Sprint
```

---

## Scrum Roles

### Product Owner

Responsibilities:
- Define product vision.
- Prioritize requirements.
- Manage Product Backlog.

### Scrum Master

Responsibilities:
- Facilitate Scrum processes.
- Remove blockers.
- Support the team.

### Development Team

Includes:
- Developers
- QA Engineers
- DevOps Engineers

---

## Scrum Artifacts

### Product Backlog

Master list of all features and requirements.

### Sprint Backlog

Tasks selected for the current sprint.

### Increment

Working software produced at the end of a sprint.

---

## Scrum Events

### Sprint Planning

Determines:
- What will be built?
- How will it be built?

### Daily Scrum

15-minute standup meeting.

Questions:
1. What did I do yesterday?
2. What will I do today?
3. Any blockers?

### Sprint Review

Demonstration of completed work.

### Sprint Retrospective

Discussion of:
- What went well?
- What can be improved?

---

# 5. Framework

## What is a Framework?

A framework is a reusable software structure that provides predefined architecture, tools, and rules for building applications.

---

## Why Frameworks Exist

They solve common development problems:

- Routing
- Dependency Injection
- Security
- Database Access
- Configuration Management

---

## Framework vs Library

### Library

You call the library.

Example:

```java
ArrayList<String> list = new ArrayList<>();
```

### Framework

The framework calls your code.

Example:

```java
@RestController
public class UserController {

    @GetMapping("/users")
    public String getUsers() {
        return "Users";
    }
}
```

Spring calls `getUsers()` when a request arrives.

---

## Inversion of Control (IoC)

The framework controls the execution flow instead of the developer.

This concept is called:

```text
Inversion of Control (IoC)
```

---

## Examples

### Java
- Spring Framework
- Spring Boot
- Hibernate

### Python
- Django
- FastAPI

### JavaScript
- Angular
- Next.js

---

# 6. Build Tool

## What is a Build Tool?

A build tool automates:

- Dependency management
- Compilation
- Testing
- Packaging
- Deployment

---

## Common Java Build Tools

### Maven
Most widely used in enterprise projects.

### Gradle
Modern and faster build tool.

### Ant
Older build tool.

---

## Responsibilities of Build Tools

### Dependency Management

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

---

### Compilation

```bash
mvn compile
```

---

### Testing

```bash
mvn test
```

---

### Packaging

```bash
mvn package
```

Generates:

```text
target/app.jar
```

---

## Maven Lifecycle

```text
Validate
   ↓
Compile
   ↓
Test
   ↓
Package
   ↓
Verify
   ↓
Install
   ↓
Deploy
```

---

## Maven Project Structure

```text
project
│
├── src
│   ├── main
│   └── test
│
├── pom.xml
│
└── target
```

---

## pom.xml

POM = Project Object Model

Contains:
- Project metadata
- Dependencies
- Plugins
- Build configuration

---

## Maven vs Gradle

| Maven | Gradle |
|---------|---------|
| XML Configuration | DSL Configuration |
| Easier for beginners | More flexible |
| Slower builds | Faster builds |

---

# 7. Creating a Spring Boot Project

## Method 1: Spring Initializr

Visit:

https://start.spring.io

Select:

```text
Project: Maven
Language: Java
Packaging: Jar
Java Version: 17/21
```

Add dependencies:

```text
Spring Web
Spring Data JPA
MySQL Driver
Lombok
```

Generate project and import into IDE.

---
# 8. Layered Architecture in Spring Boot

## What is Layered Architecture?

Layered Architecture separates application responsibilities into independent layers.

Benefits:

- Maintainability
- Scalability
- Readability
- Testability

---

## Architecture Diagram

```text
┌─────────────────────┐
│      Client         │
│ (Browser/Postman)   │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│   Controller Layer  │
│     API Layer       │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│    Service Layer    │
│  Business Logic     │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Repository Layer    │
│ Data Access Layer   │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│      Database       │
│  MySQL/PostgreSQL   │
└─────────────────────┘
```

---

## Controller Layer

Responsibilities:
- Receive HTTP requests.
- Return HTTP responses.
- Delegate work to Service layer.

---

## Service Layer

Responsibilities:
- Business logic.
- Validation.
- Data processing.
- Application rules.

---

## Repository Layer

Responsibilities:
- Database communication.
- CRUD operations.

Example:

```java
@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {
}
```

---

## Entity Layer

Represents database tables.

Example:

```java
@Entity
@Table(name = "users")
public class User {
    private Long id;
    private String name;
}
```

---

## Request Flow

```text
Client
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
Database
```

Response:

```text
Database
   ↑
Repository
   ↑
Service
   ↑
Controller
   ↑
Client
```

---

## Dependency Injection Flow

```text
UserController
       │
       ▼
UserService
       │
       ▼
UserRepository
```

Managed by Spring's IoC Container.

---