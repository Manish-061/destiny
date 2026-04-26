# 📘 DBMS Interview Notes (Quick Revision)

---

#  1. Data vs Information

* **Data** → Raw facts (unprocessed)
* **Information** → Processed, meaningful data

✅ Example:

* Data: `Manish, 23, 50000`
* Information: Name=Manish, Age=23, Salary=50000

---

#  2. Database

**Definition:**
Structured collection of data for efficient storage, retrieval, and management.

---

#  3. DBMS

**Definition:**
Software that manages databases and provides controlled access.

### Key Functions:

* Data storage & retrieval
* Concurrency control
* Security
* Transaction management (ACID)
* Backup & recovery

---

#  4. Types of Databases

### Relational

* Table-based
* Fixed schema
* Strong consistency

### NoSQL

* Schema-less
* High scalability
* Eventual consistency

### In-Memory

* Stored in RAM
* Very fast
* Used for caching

---

#  5. Three Schema Architecture

### Levels:

1. Physical → storage details
2. Logical → schema (tables, relations)
3. View → user-specific view

### Key Concept:

* **Data Independence**

  * Physical independence
  * Logical independence

---

#  6. Schema vs Instance

| Schema    | Instance |
| --------- | -------- |
| Structure | Data     |
| Static    | Dynamic  |

---

#  7. DBA

**Role:** Manages and maintains database system

### Responsibilities:

* Performance tuning
* Security
* Backup & recovery
* Monitoring

---

#  8. DBMS Architecture

### 1-Tier

* All in one system

### 2-Tier

* Client ↔ DB directly

### 3-Tier (Most used)

* Client → Backend → Database

---

#  9. Data Model

**Definition:**
Defines structure, relationships, and constraints of data.

### Types:

* Conceptual
* Logical
* Physical

---

#  10. ER Model

**Definition:**
Represents real-world entities and relationships.

### Components:

* Entity
* Attribute
* Relationship

---

#  11. Types of Attributes

* Simple
* Composite
* Single-valued
* Multi-valued
* Derived
* Stored
* Key

---

#  12. Relationships

### Types:

* 1:1
* 1:M
* M:N (requires junction table)

---

### Additional Concepts:

* Degree: Unary, Binary, Ternary
* Participation: Total, Partial

---

#  13. ER Notations

* Entity → Rectangle
* Attribute → Oval
* Relationship → Diamond
* Key → Underlined
* Multi-valued → Double Oval
* Derived → Dashed Oval

---

#  14. Extended ER (EER)

### Specialization (Top-Down)

* One entity → subtypes

### Generalization (Bottom-Up)

* Multiple entities → one entity

---

#  15. Attribute Inheritance

* Child inherits attributes from parent

---

#  16. Aggregation

* Relationship treated as entity


---
