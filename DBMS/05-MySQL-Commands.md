# 📘 MySQL Database Management Notes

---

# 1. CREATE DATABASE

Used to create a new database.

## Syntax

```sql
CREATE DATABASE database_name;
```

## Example

```sql
CREATE DATABASE smart_expense_db;
```

## View All Databases

```sql
SHOW DATABASES;
```

## Select Database

```sql
USE smart_expense_db;
```

---

# 2. CREATE TABLE

Used to create a table inside a database.

## Syntax

```sql
CREATE TABLE table_name (
    column_name datatype,
    column_name datatype
);
```

## Example

```sql
CREATE TABLE students (
    student_id INT,
    name VARCHAR(100),
    branch VARCHAR(50),
    age INT
);
```

## Show Tables

```sql
SHOW TABLES;
```

## View Table Structure

```sql
DESC students;
```

---

# 3. INSERT

Used to add records into a table.

## Insert Single Row

```sql
INSERT INTO students
VALUES (101, 'Manish', 'CSE', 21);
```

---

## Insert Multiple Rows

```sql
INSERT INTO students
VALUES
(102, 'Rahul', 'ECE', 22),
(103, 'Aman', 'ME', 20);
```

---

## Insert Specific Columns

```sql
INSERT INTO students(student_id, name)
VALUES (104, 'Rohit');
```

---

## View Data

```sql
SELECT * FROM students;
```

---

# 4. UPDATE

Used to modify existing records.

## Syntax

```sql
UPDATE table_name
SET column_name = value
WHERE condition;
```

---

## Example

```sql
UPDATE students
SET branch = 'IT'
WHERE student_id = 102;
```

---

## Update Multiple Columns

```sql
UPDATE students
SET age = 23,
    branch = 'CSE'
WHERE student_id = 102;
```

---

## Important

Without WHERE:

```sql
UPDATE students
SET age = 25;
```

All rows will be updated.

---

# Safe Update Mode Error (1175)

## Error

```text
Error Code: 1175
You are using safe update mode...
```

## Cause

Trying to UPDATE or DELETE without using a key column in WHERE clause.

Example:

```sql
UPDATE students
SET age = 25
WHERE name = 'Manish';
```

If `name` is not a key column, MySQL may block it.

---

## Correct Approach

```sql
UPDATE students
SET age = 25
WHERE student_id = 101;
```

Where `student_id` is a PRIMARY KEY.

---

## Disable Temporarily

```sql
SET SQL_SAFE_UPDATES = 0;
```

Enable again:

```sql
SET SQL_SAFE_UPDATES = 1;
```

---

# 5. DELETE

Used to remove rows from a table.

## Syntax

```sql
DELETE FROM table_name
WHERE condition;
```

---

## Example

```sql
DELETE FROM students
WHERE student_id = 103;
```

---

## Delete All Rows

```sql
DELETE FROM students;
```

Removes all records but keeps table structure.

---

# DELETE vs DROP vs TRUNCATE

| Command | Removes Data | Removes Structure |
|----------|-------------|------------------|
| DELETE | ✅ | ❌ |
| TRUNCATE | ✅ | ❌ |
| DROP | ✅ | ✅ |

---

# 6. ALTER TABLE

Used to modify table structure.

---

## Add Column

```sql
ALTER TABLE students
ADD email VARCHAR(100);
```

---

## Add Multiple Columns

```sql
ALTER TABLE students
ADD city VARCHAR(50),
ADD phone VARCHAR(15);
```

---

## Modify Datatype

```sql
ALTER TABLE students
MODIFY name VARCHAR(200);
```

---

## Rename Column

```sql
ALTER TABLE students
RENAME COLUMN name TO student_name;
```

---

## Drop Column

```sql
ALTER TABLE students
DROP COLUMN phone;
```

---

## Rename Table

```sql
ALTER TABLE students
RENAME TO student_details;
```

---

# 7. SQL Operators

Operators perform operations on data.

---

# Arithmetic Operators

| Operator | Meaning |
|----------|---------|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Modulus |

---

# Comparison Operators

| Operator | Meaning |
|----------|---------|
| = | Equal |
| != / <> | Not Equal |
| > | Greater Than |
| < | Less Than |
| >= | Greater Than Equal |
| <= | Less Than Equal |

---

## Example

```sql
SELECT *
FROM students
WHERE age > 20;
```

---

# Logical Operators

| Operator | Meaning |
|----------|---------|
| AND | Both conditions true |
| OR | Any condition true |
| NOT | Reverse condition |

---

## Example

```sql
SELECT *
FROM students
WHERE age > 20
AND branch = 'CSE';
```

---

# BETWEEN

```sql
SELECT *
FROM students
WHERE age BETWEEN 20 AND 25;
```

---

# IN

```sql
SELECT *
FROM students
WHERE branch IN ('CSE', 'ECE');
```

---

# LIKE

## Starts with M

```sql
SELECT *
FROM students
WHERE name LIKE 'M%';
```

---

## Ends with h

```sql
SELECT *
FROM students
WHERE name LIKE '%h';
```

---

# IS NULL

```sql
SELECT *
FROM students
WHERE email IS NULL;
```

---

# IS NOT NULL

```sql
SELECT *
FROM students
WHERE email IS NOT NULL;
```

---

# 8. Aggregate Functions

Aggregate functions operate on multiple rows and return a single value.

---

# COUNT()

Counts rows.

```sql
SELECT COUNT(*)
FROM students;
```

---

# SUM()

Returns total.

```sql
SELECT SUM(age)
FROM students;
```

---

# AVG()

Returns average.

```sql
SELECT AVG(age)
FROM students;
```

---

# MIN()

Returns smallest value.

```sql
SELECT MIN(age)
FROM students;
```

---

# MAX()

Returns largest value.

```sql
SELECT MAX(age)
FROM students;
```

---

# Aggregate Function with WHERE

```sql
SELECT AVG(age)
FROM students
WHERE branch = 'CSE';
```

---

# 9. GROUP BY

Used to group rows having same values.

---

## Example

```sql
SELECT branch, COUNT(*)
FROM students
GROUP BY branch;
```

### Output

| branch | COUNT(*) |
|----------|----------|
| CSE | 2 |
| ECE | 1 |

---

# Average Age Per Branch

```sql
SELECT branch, AVG(age)
FROM students
GROUP BY branch;
```

---

# 10. HAVING

Filters groups created by GROUP BY.

---

## Example

```sql
SELECT branch, COUNT(*)
FROM students
GROUP BY branch
HAVING COUNT(*) > 1;
```

---

# WHERE vs HAVING

| WHERE | HAVING |
|---------|---------|
| Filters rows | Filters groups |
| Before GROUP BY | After GROUP BY |

---

# 11. LIMIT

Restricts number of rows returned.

---

## First 2 Rows

```sql
SELECT *
FROM students
LIMIT 2;
```

---

## Top 3 Oldest Students

```sql
SELECT *
FROM students
ORDER BY age DESC
LIMIT 3;
```

---

## Pagination

```sql
SELECT *
FROM students
LIMIT 2, 3;
```

Meaning:

```text
Skip first 2 rows
Return next 3 rows
```

---

# SQL Query Execution Order

```sql
SELECT branch, COUNT(*)
FROM students
WHERE age > 20
GROUP BY branch
HAVING COUNT(*) > 1
ORDER BY branch
LIMIT 2;
```

Execution Order:

```text
FROM
↓
WHERE
↓
GROUP BY
↓
HAVING
↓
SELECT
↓
ORDER BY
↓
LIMIT
```

---

# Quick Revision

## DML Commands

- INSERT
- UPDATE
- DELETE

## DDL Commands

- CREATE DATABASE
- CREATE TABLE
- ALTER TABLE

## Filtering

- WHERE
- BETWEEN
- IN
- LIKE
- IS NULL

## Aggregation

- COUNT()
- SUM()
- AVG()
- MIN()
- MAX()

## Grouping

- GROUP BY
- HAVING

## Result Limiting

- LIMIT
