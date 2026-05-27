# 📘 DBMS Notes – Complete Revision

## Table of Contents

| [1. Data vs Information](#1-data-vs-information) | [Data](#data) | [Information](#information) | [2. Database](#2-database) |
| [3. DBMS](#3-dbms-database-management-system) | [Functions of DBMS](#functions-of-dbms) | [4. Types of Databases](#4-types-of-databases) | [Relational Database](#relational-database) |
| [NoSQL Database](#nosql-database) | [In-Memory Database](#in-memory-database) | [5. Three Schema Arch.](#5-three-schema-architecture) | [1. Physical Level](#1-physical-level) |
| [2. Logical Level](#2-logical-level) | [3. View Level](#3-view-level) | [Data Independence](#data-independence) | [Physical Data Ind.](#physical-data-independence) |
| [Logical Data Ind.](#logical-data-independence) | [6. Schema vs Instance](#6-schema-vs-instance) | [7. DBA](#7-dba-database-administrator) | [8. DBMS Architecture](#8-dbms-architecture) |
| [1-Tier Architecture](#1-tier-architecture) | [2-Tier Architecture](#2-tier-architecture) | [3-Tier Architecture](#3-tier-architecture) | [9. Data Model](#9-data-model) |
| [Types of Data Models](#types-of-data-models) | [Conceptual Model](#conceptual-model) | [Logical Model](#logical-model) | [Physical Model](#physical-model) |
| [10. ER Model](#10-er-model-entity-relationship-model) | [Components of ER Model](#components-of-er-model) | [Entity](#entity) | [Attribute](#attribute) |
| [Relationship](#relationship) | [11. Types of Attributes](#11-types-of-attributes) | [Simple Attribute](#simple-attribute) | [Composite Attribute](#composite-attribute) |
| [Single-Valued Attribute](#single-valued-attribute) | [Multi-Valued Attribute](#multi-valued-attribute) | [Derived Attribute](#derived-attribute) | [Stored Attribute](#stored-attribute) |
| [Key Attribute](#key-attribute) | [12. Relationships](#12-relationships) | [Types of Relationships](#types-of-relationships) | [One-to-One (1:1)](#one-to-one-11) |
| [One-to-Many (1:M)](#one-to-many-1m) | [Many-to-Many (M:N)](#many-to-many-mn) | [Degree of Relationship](#degree-of-relationship) | [Unary](#unary) |
| [Binary](#binary) | [Ternary](#ternary) | [Participation Constraints](#participation-constraints) | [Total Participation](#total-participation) |
| [Partial Participation](#partial-participation) | [13. ER Notations](#13-er-notations) | [14. Extended ER (EER)](#14-extended-er-eer) | [Specialization](#specialization-top-down) |
| [Generalization](#generalization-bottom-up) | [15. Attribute Inheritance](#15-attribute-inheritance) | [Participation Inher.](#participation-inheritance) | [16. Aggregation](#16-aggregation) |
| [Relational Model in DBMS](#relational-model-in-dbms) | [1. Relation / Table](#1-relation--table) | [2. Tuple](#2-tuple) | [3. Attribute](#3-attribute) |
| [4. Domain](#4-domain) | [5. Degree](#5-degree) | [6. Cardinality](#6-cardinality) | [7. Relational Keys](#7-relational-keys) |
| [7.1 Super Key](#71-super-key) | [7.2 Candidate Key](#72-candidate-key) | [7.3 Primary Key](#73-primary-key) | [7.4 Alternate Key](#74-alternate-key) |
| [7.5 Foreign Key](#75-foreign-key) | [7.6 Composite Key](#76-composite-key) | [8. Integrity Constraints](#8-integrity-constraints) | [8.1 Entity Integrity](#81-entity-integrity) |
| [8.2 Referential Integrity](#82-referential-integrity) | [8.3 Domain Constraints](#83-domain-constraints) | [Important Properties](#important-properties-of-relational-model) | [Real World Example](#real-world-example) |
| [Quick Summary](#quick-summary) | [Conclusion](#conclusion) | | |

---

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

---

# 10. ER Model (Entity Relationship Model)

High-level data model representing:
- Entities
- Attributes
- Relationships

Used for database design.



# Components of ER Model



## Entity

Real-world object.

### Examples
- Student
- Employee
- Product



## Attribute

Property of an entity.

### Example
Student:
- ID
- Name
- Age



## Relationship

Association between entities.

### Example
Student enrolls in Course.

---

# 11. Types of Attributes



## Simple Attribute

Cannot be divided further.

### Example
Age



## Composite Attribute

Can be divided into subparts.

### Example
Name:
- First Name
- Last Name



## Single-Valued Attribute

Only one value.

### Example
Roll Number



## Multi-Valued Attribute

Multiple values possible.

### Example
Phone Numbers



## Derived Attribute

Calculated from other attributes.

### Example
Age derived from DOB.



## Stored Attribute

Physically stored in database.

### Example
Date of Birth



## Key Attribute

Uniquely identifies entity.

### Example
Student_ID

---

# 12. Relationships

Represents association between entities.



# Types of Relationships



## One-to-One (1:1)

One entity related to one entity.

### Example
Person ↔ Passport



## One-to-Many (1:M)

One entity related to many entities.

### Example
Department → Employees



## Many-to-Many (M:N)

Many entities related to many entities.

### Example
Students ↔ Courses

Requires junction table.



# Degree of Relationship



## Unary
Entity related to itself.

### Example
Employee manages Employee



## Binary
Two entities participate.

### Example
Student takes Course



## Ternary
Three entities participate.



# Participation Constraints



## Total Participation

Every entity must participate.



## Partial Participation

Participation is optional.

---

# 13. ER Notations

| Component | Symbol |
|---|---|
| Entity | Rectangle |
| Weak Entity | Double Rectangle |
| Attribute | Oval |
| Key Attribute | Underlined Oval |
| Multi-valued Attribute | Double Oval |
| Derived Attribute | Dashed Oval |
| Relationship | Diamond |
| Weak Relationship | Double Diamond |

---

# 14. Extended ER (EER)

Adds advanced modeling concepts.



# Specialization (Top-Down)

One entity divided into sub-entities.

### Example
```text
Person
 ├── Student
 ├── Employee
```

### Features
- Subclasses inherit parent attributes
- Represents "is-a" relationship



# Generalization (Bottom-Up)

Combines multiple entities into one generalized entity.

### Example
```text
Car + Bike + Bus → Vehicle
```

### Purpose
- Reduce redundancy
- Improve design

---

# 15. Attribute Inheritance

Child entities inherit attributes of parent entity.



## Example

```text
Person(id, name)

Student inherits:
- id
- name
```



# Participation Inheritance

If parent participates in a relationship,
child entities also participate.

---

# 16. Aggregation

Aggregation treats a relationship as an entity.

Used when:
- Relationship itself participates in another relationship.



## Example

```text
Employee works_on Project
Manager supervises this work
```

Here:
- "works_on" relationship becomes an entity.

---

# Quick Summary Table

| Topic | Key Idea |
|---|---|
| DBMS | Manages databases |
| ER Model | Designs database structure |
| Entity | Real-world object |
| Attribute | Property of entity |
| Relationship | Connection between entities |
| Specialization | Parent → Child |
| Generalization | Child → Parent |
| Aggregation | Relationship as entity |

---

# Conclusion

These concepts form the foundation of:
- Database Design
- SQL
- Backend Engineering
- System Design

Strong DBMS fundamentals are critical for building:
- Scalable systems
- Reliable APIs
- Efficient databases


# Relational Model in DBMS

The Relational Model organizes data in the form of tables (relations).  
It is the most widely used data model in modern databases.

---

# 1. Relation / Table

A relation is a table consisting of rows and columns.

## Example: Student Table

| Student_ID | Name   | Branch | Age |
|------------|--------|--------|-----|
| 101        | Manish | CSE    | 21  |
| 102        | Rahul  | ECE    | 22  |

- Relation Name → `Student`
- Columns → Attributes
- Rows → Tuples

---

# 2. Tuple

A tuple is a single row in a relation.

## Example

| 101 | Manish | CSE | 21 |

This complete row is one tuple.

A tuple represents a single record/entity.

---

# 3. Attribute

Attributes are the columns of a table.

## Example

In Student table:
- Student_ID
- Name
- Branch
- Age

Each attribute stores a specific type of information.

---

# 4. Domain

A domain is the set of permitted values for an attribute.

## Example

- Age → Integer values
- Branch → {CSE, ECE, ME}

Domain helps maintain valid data.

---

# 5. Degree

Degree = Total number of attributes (columns) in a relation.

## Example

| Student_ID | Name | Branch | Age |

Degree = 4

---

# 6. Cardinality

Cardinality = Total number of tuples (rows) in a relation.

## Example

If Student table contains 500 rows:

Cardinality = 500

---

# 7. Relational Keys

Keys are attributes used to uniquely identify tuples and establish relationships between tables.

---

# 7.1 Super Key

A Super Key is any set of attributes that can uniquely identify a tuple.

## Example

| Student_ID | Email |
|------------|-------|

Possible Super Keys:
- Student_ID
- Email
- Student_ID + Email

---

# 7.2 Candidate Key

A minimal Super Key.

It contains no unnecessary attributes.

## Example

- Student_ID
- Email

Both can uniquely identify students.

---

# 7.3 Primary Key

The Candidate Key selected to uniquely identify tuples.

## Properties
- Unique
- NOT NULL
- Stable

## Example

```sql
Student_ID
```

---

# 7.4 Alternate Key

Candidate Keys not selected as Primary Key.

## Example

If:
- Student_ID → Primary Key
- Email → Candidate Key

Then:
- Email = Alternate Key

---

# 7.5 Foreign Key

An attribute in one table that refers to the Primary Key of another table.

Used to create relationships between tables.



## Example

### Department Table

| Dept_ID | Department |
|----------|------------|
| D1       | CSE        |
| D2       | ECE        |

### Student Table

| Student_ID | Name   | Dept_ID |
|------------|--------|----------|
| 101        | Manish | D1       |

Here:
- `Dept_ID` in Student table = Foreign Key
- `Dept_ID` in Department table = Primary Key

---

# 7.6 Composite Key

A Primary Key formed using multiple attributes.

## Example

| Student_ID | Course_ID |
|------------|------------|

Together both columns uniquely identify a record.

---

# 8. Integrity Constraints

Integrity Constraints ensure consistency and correctness of data.

---

# 8.1 Entity Integrity

Rules:
- Every table must have a Primary Key
- Primary Key cannot be NULL

## Wrong Example

| Student_ID | Name |
|------------|------|
| NULL       | Manish |

---

# 8.2 Referential Integrity

Foreign Key value must either:
- Match an existing Primary Key value
- OR be NULL



## Wrong Example

### Department Table

| Dept_ID |
|----------|
| D1       |

### Student Table

| Dept_ID |
|----------|
| D9       |

`D9` does not exist in Department table.

This violates Referential Integrity.

---

# 8.3 Domain Constraints

Attribute values must belong to valid domain/type.

## Example

- Age cannot be negative
- Salary cannot contain text
- Email should follow valid format



# Important Properties of Relational Model

- Table name must be unique
- Attribute names must be unique
- Values must be atomic
- Duplicate rows are not allowed
- Order of rows and columns does not matter



# Real World Example

## E-Commerce Database

### Users Table
| User_ID | Name |
|----------|------|

### Products Table
| Product_ID | Price |
|-------------|------|

### Orders Table
| Order_ID | User_ID |
|-----------|---------|

### Order_Items Table
| Order_ID | Product_ID |
|-----------|------------|

This structure follows the Relational Model.



# Quick Summary

| Concept | Meaning |
|----------|---------|
| Relation | Table |
| Tuple | Row |
| Attribute | Column |
| Domain | Allowed values |
| Degree | Number of columns |
| Cardinality | Number of rows |
| Primary Key | Unique identifier |
| Foreign Key | Creates relationship |
| Composite Key | Multiple columns as PK |

---

# Conclusion

The Relational Model is the foundation of modern relational databases.

It provides:
- Structured data storage
- Data consistency
- Relationships between tables
- Efficient querying using SQL

Popular RDBMS:
- MySQL
- PostgreSQL
- Oracle
- SQL Server
