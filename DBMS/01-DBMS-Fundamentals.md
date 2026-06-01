# 📘 DBMS Fundamentals

These notes cover the core concepts of Database Management Systems (DBMS).

---

# 1. Data vs Information

## Data
Raw facts and figures without context.

### Example
```text
Manish, 23, 50000
```



## Information
Processed and meaningful data.

### Example
```text
Name = Manish
Age = 23
Salary = 50000
```

---

# 2. Database

A Database is an organized collection of data that allows:
- Easy storage
- Retrieval
- Management
- Updating of data

### Example
Banking system, E-commerce system, Social media apps.

---

# 3. DBMS (Database Management System)

Software used to manage databases efficiently.

### Examples
- MySQL
- PostgreSQL
- Oracle
- SQL Server



## Functions of DBMS

- Data Storage
- Data Retrieval
- Concurrency Control
- Security
- Backup & Recovery
- Transaction Management

---

# 4. Types of Databases



## Relational Database

- Stores data in tables
- Fixed schema
- Uses SQL
- Strong consistency

### Examples
- MySQL
- PostgreSQL



## NoSQL Database

- Flexible schema
- High scalability
- Handles unstructured data

### Examples
- MongoDB
- Cassandra



## In-Memory Database

- Stores data in RAM
- Extremely fast
- Used for caching

### Example
- Redis

---

# 5. Three Schema Architecture

Provides abstraction in DBMS.



## 1. Physical Level

Describes how data is stored internally.

### Includes
- File organization
- Indexing
- Storage structure



## 2. Logical Level

Describes:
- Tables
- Attributes
- Relationships

Most backend developers work at this level.



## 3. View Level

User-specific representation of data.

### Example
Admin sees all data, customer sees limited data.



# Data Independence

## Physical Data Independence
Changes in physical storage should not affect logical schema.



## Logical Data Independence
Changes in logical schema should not affect user views.

---

# 6. Schema vs Instance

| Schema | Instance |
|---|---|
| Structure of database | Actual data |
| Static | Dynamic |
| Rarely changes | Changes frequently |

---

# 7. DBA (Database Administrator)

Person responsible for managing and maintaining databases.



## Responsibilities

- Performance tuning
- Backup & recovery
- Security management
- Monitoring
- User authorization
- Database maintenance

---

# 8. DBMS Architecture



# 1-Tier Architecture

Application and database on same machine.

### Example
Local software using local database.



# 2-Tier Architecture

Client directly communicates with database.

```text
Client ↔ Database
```



# 3-Tier Architecture

Most common architecture.

```text
Frontend → Backend → Database
```

### Advantages
- Better security
- Scalability
- Maintainability

---

# 9. Data Model

Defines:
- Structure of data
- Relationships
- Constraints



## Types of Data Models

### Conceptual Model
High-level design.



### Logical Model
Defines tables and relationships.



### Physical Model
Defines actual storage details.
