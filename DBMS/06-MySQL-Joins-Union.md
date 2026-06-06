# 📘 SQL Joins & Union (MySQL)

---

# 1. Joins in SQL

## What is a Join?

A JOIN is used to combine data from two or more tables based on a related column.

### Why Joins?

In relational databases, data is stored in separate tables to avoid redundancy.

To retrieve related data from multiple tables, we use JOINs.

---

## Example Tables

### Students

| student_id | name | dept_id |
|------------|------|----------|
| 101 | Manish | D1 |
| 102 | Rahul | D2 |
| 103 | Aman | D1 |

### Departments

| dept_id | department |
|----------|------------|
| D1 | CSE |
| D2 | ECE |
| D3 | ME |

---

# Types of Joins

1. INNER JOIN
2. LEFT JOIN
3. RIGHT JOIN
4. FULL OUTER JOIN
5. CROSS JOIN
6. SELF JOIN

---

# 1. INNER JOIN

Returns only matching records from both tables.

## Syntax

```sql
SELECT columns
FROM table1
INNER JOIN table2
ON table1.column = table2.column;
```

## Example

```sql
SELECT s.student_id,
       s.name,
       d.department
FROM students s
INNER JOIN departments d
ON s.dept_id = d.dept_id;
```

## Result

| student_id | name | department |
|------------|------|------------|
| 101 | Manish | CSE |
| 102 | Rahul | ECE |
| 103 | Aman | CSE |

### Key Point

Only matching records are returned.

---

# 2. LEFT JOIN

Returns:
- All records from LEFT table
- Matching records from RIGHT table

If no match exists, NULL is returned.

## Syntax

```sql
SELECT *
FROM table1
LEFT JOIN table2
ON condition;
```

## Example

```sql
SELECT s.name,
       d.department
FROM students s
LEFT JOIN departments d
ON s.dept_id = d.dept_id;
```

## Result

| name | department |
|------|------------|
| Manish | CSE |
| Rahul | ECE |
| Aman | CSE |

If a department does not exist:

| name | department |
|------|------------|
| Rohit | NULL |

### Key Point

All rows from LEFT table are returned.

---

# 3. RIGHT JOIN

Returns:
- All records from RIGHT table
- Matching records from LEFT table

If no match exists, NULL is returned.

## Example

```sql
SELECT s.name,
       d.department
FROM students s
RIGHT JOIN departments d
ON s.dept_id = d.dept_id;
```

## Result

| name | department |
|------|------------|
| Manish | CSE |
| Rahul | ECE |
| NULL | ME |

### Key Point

All rows from RIGHT table are returned.

---

# 4. FULL OUTER JOIN

Returns:
- All rows from LEFT table
- All rows from RIGHT table

Matching rows are merged.

---

## Note

MySQL does not directly support:

```sql
FULL OUTER JOIN
```

It can be simulated using:

```sql
SELECT *
FROM students s
LEFT JOIN departments d
ON s.dept_id = d.dept_id

UNION

SELECT *
FROM students s
RIGHT JOIN departments d
ON s.dept_id = d.dept_id;
```

---

# 5. CROSS JOIN

Returns Cartesian Product.

Every row of first table is combined with every row of second table.

---

## Example

### Students

| name |
|------|
| Manish |
| Rahul |

### Courses

| course |
|--------|
| Java |
| SQL |

```sql
SELECT *
FROM students
CROSS JOIN courses;
```

## Result

| name | course |
|------|--------|
| Manish | Java |
| Manish | SQL |
| Rahul | Java |
| Rahul | SQL |

### Formula

```text
Rows = m × n
```

---

# 6. SELF JOIN

A table joins with itself.

---

## Example

### Employees

| emp_id | name | manager_id |
|---------|------|------------|
| 1 | Raj | NULL |
| 2 | Amit | 1 |
| 3 | Rohit | 1 |

```sql
SELECT e.name AS Employee,
       m.name AS Manager
FROM employees e
LEFT JOIN employees m
ON e.manager_id = m.emp_id;
```

## Result

| Employee | Manager |
|-----------|----------|
| Raj | NULL |
| Amit | Raj |
| Rohit | Raj |

---

# INNER JOIN vs LEFT JOIN

| Feature | INNER JOIN | LEFT JOIN |
|----------|-----------|-----------|
| Matching rows | ✅ | ✅ |
| Non-matching left rows | ❌ | ✅ |
| NULL possible | ❌ | ✅ |

---

# Quick Revision

| Join | Returns |
|--------|---------|
| INNER JOIN | Matching rows only |
| LEFT JOIN | All left + matching right |
| RIGHT JOIN | All right + matching left |
| FULL OUTER JOIN | All rows from both tables |
| CROSS JOIN | Cartesian product |
| SELF JOIN | Table joins with itself |

---

# 2. UNION

## What is UNION?

UNION combines the result of two or more SELECT queries into a single result set.

---

## Syntax

```sql
SELECT column_list
FROM table1

UNION

SELECT column_list
FROM table2;
```

---

## Example

### CSE Students

| name |
|------|
| Manish |
| Rahul |

### ECE Students

| name |
|------|
| Aman |
| Priya |

```sql
SELECT name
FROM cse_students

UNION

SELECT name
FROM ece_students;
```

## Result

| name |
|------|
| Manish |
| Rahul |
| Aman |
| Priya |

---

# UNION Rules

## Rule 1

Both queries must return the same number of columns.

### Correct

```sql
SELECT name
FROM students

UNION

SELECT name
FROM teachers;
```

### Wrong

```sql
SELECT id, name
FROM students

UNION

SELECT name
FROM teachers;
```

---

## Rule 2

Data types must be compatible.

### Correct

```sql
SELECT student_id
FROM students

UNION

SELECT teacher_id
FROM teachers;
```

---

# UNION and Duplicates

UNION automatically removes duplicates.

---

## Example

### Table A

| name |
|------|
| Manish |
| Rahul |

### Table B

| name |
|------|
| Rahul |
| Aman |

```sql
SELECT name FROM tableA

UNION

SELECT name FROM tableB;
```

## Result

| name |
|------|
| Manish |
| Rahul |
| Aman |

---

# UNION ALL

UNION ALL keeps duplicates.

```sql
SELECT name FROM tableA

UNION ALL

SELECT name FROM tableB;
```

## Result

| name |
|------|
| Manish |
| Rahul |
| Rahul |
| Aman |

---

# UNION vs UNION ALL

| Feature | UNION | UNION ALL |
|----------|--------|------------|
| Combines Results | ✅ | ✅ |
| Removes Duplicates | ✅ | ❌ |
| Faster | ❌ | ✅ |

---

# ORDER BY with UNION

```sql
SELECT name
FROM students

UNION

SELECT name
FROM teachers

ORDER BY name;
```

### Key Point

ORDER BY is applied to the final combined result.

---

# Multiple UNIONs

```sql
SELECT name
FROM cse_students

UNION

SELECT name
FROM ece_students

UNION

SELECT name
FROM it_students;
```

---

# Real World Example

### Current Students

| name |
|------|
| Manish |
| Rahul |

### Alumni

| name |
|------|
| Aman |
| Priya |

```sql
SELECT name
FROM current_students

UNION

SELECT name
FROM alumni;
```

Returns all people in a single result.

---

# Interview Questions

## Difference Between UNION and UNION ALL?

### UNION
- Removes duplicates
- Slightly slower

### UNION ALL
- Keeps duplicates
- Faster

---

## Can UNION Combine Tables with Different Column Names?

### Yes

Column names can differ.

Requirements:
- Same number of columns
- Compatible data types

---

# Quick Revision

| Operation | Purpose |
|------------|---------|
| INNER JOIN | Matching rows only |
| LEFT JOIN | All rows from left table |
| RIGHT JOIN | All rows from right table |
| CROSS JOIN | Cartesian product |
| SELF JOIN | Table with itself |
| UNION | Combine results, remove duplicates |
| UNION ALL | Combine results, keep duplicates |

---

# Conclusion

Joins are used to retrieve related data from multiple tables.

UNION is used to combine results from multiple SELECT queries.

In real-world backend applications, the most commonly used operations are:

- INNER JOIN
- LEFT JOIN
- UNION
- UNION ALL

Understanding these concepts is essential for writing efficient SQL queries and designing relational database applications.
