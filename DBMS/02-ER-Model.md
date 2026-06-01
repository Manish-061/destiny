# 📘 ER Model & EER Model

These notes cover ER Modeling, Relationships, Constraints, and Extended ER concepts.

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