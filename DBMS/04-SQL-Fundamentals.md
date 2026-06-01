# 📘 SQL Fundamentals

---

# 1. What is SQL?

**SQL (Structured Query Language)** is a standard language used to communicate with relational databases.

It is used to:
- Create databases
- Create tables
- Insert data
- Retrieve data
- Update data
- Delete data
- Manage permissions
- Control transactions

> SQL is a language, not a database.

---

## Example

```sql
SELECT * FROM students;
```

This query retrieves all records from the `students` table.

---

# 2. Why SQL?

Before SQL, managing large amounts of data was difficult.

SQL provides a standard way to:
- Store data efficiently
- Retrieve data quickly
- Maintain consistency
- Manage relationships between tables
- Support multiple users simultaneously

---

## Real-World Examples

### Banking Systems
- Customer accounts
- Transactions
- Loan management

### E-Commerce Platforms
- Users
- Products
- Orders
- Payments

### Social Media Applications
- Users
- Posts
- Comments
- Followers

---

# 3. SQL Command Categories

SQL commands are divided into five major categories.

---

# 3.1 DDL (Data Definition Language)

Used to define and modify database structure.

### Commands

- CREATE
- ALTER
- DROP
- TRUNCATE
- RENAME

---

## CREATE

Creates database objects.

```sql
CREATE DATABASE college;
```

```sql
CREATE TABLE students (
    id INT,
    name VARCHAR(50)
);
```

---

## ALTER

Modifies table structure.

```sql
ALTER TABLE students
ADD age INT;
```

---

## DROP

Deletes an entire object permanently.

```sql
DROP TABLE students;
```

---

## TRUNCATE

Removes all rows from a table.

```sql
TRUNCATE TABLE students;
```

---

## RENAME

Changes object name.

```sql
ALTER TABLE students
RENAME TO student_details;
```

---

# 3.2 DML (Data Manipulation Language)

Used to manipulate data inside tables.

### Commands

- INSERT
- UPDATE
- DELETE
- REPLACE

---

## INSERT

Adds new records.

```sql
INSERT INTO students
VALUES (1, 'Manish');
```

---

## UPDATE

Modifies existing records.

```sql
UPDATE students
SET name = 'Rahul'
WHERE id = 1;
```

---

## DELETE

Removes records.

```sql
DELETE FROM students
WHERE id = 1;
```

---

## REPLACE

Updates existing row or inserts a new one.

```sql
REPLACE INTO students(id, name)
VALUES(1, 'Manish');
```

---

# 3.3 DQL (Data Query Language)

Used to retrieve data.

### Command

- SELECT

---

## SELECT

```sql
SELECT * FROM students;
```

Retrieve all records from a table.

---

# 3.4 DCL (Data Control Language)

Used to manage permissions and access.

### Commands

- GRANT
- REVOKE

---

## GRANT

Provides privileges.

```sql
GRANT SELECT ON students TO user1;
```

---

## REVOKE

Removes privileges.

```sql
REVOKE SELECT ON students FROM user1;
```

---

# 3.5 TCL (Transaction Control Language)

Used to manage transactions.

### Commands

- START TRANSACTION
- COMMIT
- ROLLBACK
- SAVEPOINT

---

## START TRANSACTION

```sql
START TRANSACTION;
```

---

## COMMIT

Permanently saves changes.

```sql
COMMIT;
```

---

## ROLLBACK

Reverts changes.

```sql
ROLLBACK;
```

---

## SAVEPOINT

Creates a checkpoint.

```sql
SAVEPOINT sp1;
```

---

# 4. SQL Data Types

Data types define what kind of values can be stored in a column.

---

# 4.1 Numeric Data Types

Used for numbers.

| Data Type | Description |
|------------|-------------|
| TINYINT | Small integers |
| SMALLINT | Small range integers |
| INT | Standard integers |
| BIGINT | Large integers |
| FLOAT | Approximate decimal values |
| DOUBLE | High precision decimal values |
| DECIMAL | Exact decimal values |

---

## Example

```sql
age INT
salary DECIMAL(10,2)
```

---

# 4.2 String Data Types

Used for storing text.

| Data Type | Description |
|------------|-------------|
| CHAR | Fixed-length string |
| VARCHAR | Variable-length string |
| TEXT | Large text data |

---

## Example

```sql
name VARCHAR(100)
```

---

### CHAR vs VARCHAR

#### CHAR

Always reserves fixed memory.

```sql
CHAR(10)
```

Stores exactly 10 characters.

---

#### VARCHAR

Stores only required memory.

```sql
VARCHAR(10)
```

More efficient for varying text lengths.

---

# 4.3 Date and Time Data Types

Used to store temporal values.

| Data Type | Description |
|------------|-------------|
| DATE | YYYY-MM-DD |
| TIME | HH:MM:SS |
| DATETIME | Date and time |
| TIMESTAMP | Date and time with timestamp support |

---

## Example

```sql
created_at TIMESTAMP
```

---

# 4.4 Boolean Data Type

Stores true/false values.

```sql
is_active BOOLEAN
```

Usually stored as:

```text
1 = TRUE
0 = FALSE
```

---

# 4.5 ENUM Data Type

Allows predefined values.

```sql
gender ENUM('Male', 'Female', 'Other')
```

Only specified values are allowed.

---

# 4.6 SET Data Type

Allows multiple predefined values.

```sql
skills SET('Java', 'Python', 'SQL')
```

A user can have multiple selected values.

---

# Quick Summary

| Category | Purpose |
|-----------|----------|
| DDL | Define structure |
| DML | Manipulate data |
| DQL | Retrieve data |
| DCL | Control access |
| TCL | Manage transactions |

---

# Conclusion

SQL is the standard language for working with relational databases.

By learning:
- SQL fundamentals
- Command categories
- Data types

you build the foundation required for:
- Database Design
- Data Management
- Backend Development
- System Design
- Advanced SQL Queries
