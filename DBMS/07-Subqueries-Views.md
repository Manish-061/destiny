# 📘 SQL Subqueries & Views (MySQL)

---

# 1. SQL Subqueries

## What is a Subquery?

A Subquery is a query written inside another SQL query.

```text
Outer Query
    ↓
Uses Result of
    ↓
Inner Query (Subquery)
```

---

## Basic Syntax

```sql
SELECT column_name
FROM table_name
WHERE column_name operator (
    SELECT column_name
    FROM another_table
);
```

---

## Why Use Subqueries?

Suppose you want to find students whose age is greater than the average age of all students.

Without subquery:

```sql
SELECT AVG(age)
FROM students;
```

Result:

```text
21
```

Then:

```sql
SELECT *
FROM students
WHERE age > 21;
```

With subquery:

```sql
SELECT *
FROM students
WHERE age > (
    SELECT AVG(age)
    FROM students
);
```

---

# Types of Subqueries

1. Single Row Subquery
2. Multiple Row Subquery
3. Multiple Column Subquery
4. Correlated Subquery
5. Nested Subquery

---

# 1. Single Row Subquery

Returns exactly one row.

## Example

```sql
SELECT *
FROM students
WHERE age > (
    SELECT AVG(age)
    FROM students
);
```

---

# 2. Multiple Row Subquery

Returns multiple rows.

Used with:
- IN
- ANY
- ALL

---

## Example

```sql
SELECT *
FROM students
WHERE dept_id IN (
    SELECT dept_id
    FROM departments
);
```

---

# ANY Operator

Condition must satisfy at least one returned value.

```sql
SELECT *
FROM students
WHERE age > ANY (
    SELECT age
    FROM students
    WHERE branch = 'CSE'
);
```

---

# ALL Operator

Condition must satisfy all returned values.

```sql
SELECT *
FROM students
WHERE age > ALL (
    SELECT age
    FROM students
    WHERE branch = 'CSE'
);
```

---

# 3. Multiple Column Subquery

Returns multiple columns.

```sql
SELECT *
FROM students
WHERE (branch, age) IN (
    SELECT branch, age
    FROM toppers
);
```

---

# 4. Correlated Subquery

A subquery that depends on the outer query.

The inner query executes once for every row processed by the outer query.

---

## Example

Find students older than the average age of their branch.

```sql
SELECT *
FROM students s1
WHERE age > (
    SELECT AVG(age)
    FROM students s2
    WHERE s1.branch = s2.branch
);
```

---

## Important

Correlated subqueries are usually slower than joins because they execute repeatedly.

---

# 5. Nested Subquery

Subquery inside another subquery.

```sql
SELECT *
FROM students
WHERE dept_id IN (
    SELECT dept_id
    FROM departments
    WHERE manager_id IN (
        SELECT emp_id
        FROM employees
        WHERE salary > 100000
    )
);
```

---

# Subquery in SELECT

```sql
SELECT name,
       (
           SELECT AVG(age)
           FROM students
       ) AS average_age
FROM students;
```

---

# Subquery in FROM

Acts as a temporary table.

```sql
SELECT *
FROM (
    SELECT branch,
           COUNT(*) AS total_students
    FROM students
    GROUP BY branch
) AS branch_summary;
```

---

# EXISTS

Returns TRUE if subquery returns at least one row.

```sql
SELECT *
FROM departments d
WHERE EXISTS (
    SELECT *
    FROM students s
    WHERE s.dept_id = d.dept_id
);
```

---

# NOT EXISTS

Returns TRUE if subquery returns no rows.

```sql
SELECT *
FROM departments d
WHERE NOT EXISTS (
    SELECT *
    FROM students s
    WHERE s.dept_id = d.dept_id
);
```

---

# Subquery vs JOIN

## JOIN

```sql
SELECT s.name,
       d.department
FROM students s
JOIN departments d
ON s.dept_id = d.dept_id;
```

Used for combining related tables.

---

## Subquery

```sql
SELECT *
FROM students
WHERE dept_id IN (
    SELECT dept_id
    FROM departments
);
```

Used when one query depends on another query's result.

---

# Quick Revision

| Type | Returns |
|--------|---------|
| Single Row | One row |
| Multiple Row | Multiple rows |
| Multiple Column | Multiple columns |
| Correlated | Depends on outer query |
| Nested | Multiple levels |

---

# 2. SQL Views

## What is a View?

A View is a virtual table created from one or more tables.

It does not store data itself.

It stores only the SQL query.

---

## Why Use Views?

- Simplify complex queries
- Hide sensitive data
- Improve readability
- Restrict user access

---

## Example Table

### Students

| student_id | name | age | salary |
|------------|------|-----|---------|
| 101 | Manish | 21 | 50000 |
| 102 | Rahul | 22 | 60000 |

---

# Create a View

## Syntax

```sql
CREATE VIEW view_name AS
SELECT columns
FROM table_name;
```

---

## Example

```sql
CREATE VIEW student_view AS
SELECT student_id,
       name,
       age
FROM students;
```

---

# Use a View

```sql
SELECT *
FROM student_view;
```

Output:

| student_id | name | age |
|------------|------|-----|
| 101 | Manish | 21 |
| 102 | Rahul | 22 |

---

# View from Multiple Tables

```sql
CREATE VIEW student_department_view AS
SELECT s.student_id,
       s.name,
       d.department
FROM students s
INNER JOIN departments d
ON s.dept_id = d.dept_id;
```

---

# View Benefits

## Security

Hide sensitive columns.

```sql
CREATE VIEW employee_public_view AS
SELECT emp_id,
       name
FROM employees;
```

Salary column remains hidden.

---

## Simplicity

Instead of writing complex joins repeatedly:

```sql
SELECT *
FROM student_department_view;
```

---

# Update a View

```sql
CREATE OR REPLACE VIEW student_view AS
SELECT student_id,
       name,
       age,
       branch
FROM students;
```

---

# Show Views

```sql
SHOW FULL TABLES
WHERE Table_type = 'VIEW';
```

---

# View Definition

```sql
SHOW CREATE VIEW student_view;
```

---

# Delete a View

```sql
DROP VIEW student_view;
```

---

# View vs Table

| Feature | Table | View |
|----------|--------|--------|
| Stores Data | ✅ | ❌ |
| Physical Storage | ✅ | ❌ |
| Virtual Table | ❌ | ✅ |
| Can Query Data | ✅ | ✅ |

---

# Real World Example

Suppose the Employee table contains:

```text
emp_id
name
salary
pan_number
```

HR should see everything.

Employees should only see:

```text
emp_id
name
```

Create a view:

```sql
CREATE VIEW employee_view AS
SELECT emp_id,
       name
FROM employees;
```

Now users can access:

```sql
SELECT *
FROM employee_view;
```

without exposing sensitive information.

---

# Interview Questions

## What is a View?

A virtual table created from the result of a SQL query.

---

## Does a View Store Data?

No.

A view stores only the query definition.

---

## Why Use Views?

- Security
- Simplicity
- Reusability
- Abstraction

---

# Quick Revision

| Concept | Purpose |
|----------|----------|
| Subquery | Query inside another query |
| EXISTS | Checks row existence |
| Correlated Subquery | Depends on outer query |
| View | Virtual table |
| CREATE VIEW | Creates a view |
| DROP VIEW | Deletes a view |
| CREATE OR REPLACE VIEW | Updates a view |

---

# Conclusion

Subqueries help solve complex filtering and comparison problems by using the result of one query inside another.

Views help simplify complex queries, improve security, and provide an abstraction layer over database tables.

Most commonly used in real-world backend applications:

- IN Subqueries
- EXISTS / NOT EXISTS
- Correlated Subqueries
- CREATE VIEW
- Views built on JOINs
