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