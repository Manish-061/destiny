SHOW DATABASES;

CREATE DATABASE smart_expense_db; -- Create Database

USE smart_expense_db; -- Will use or can say perform all sort of operation from here on smart_expense_db

-- Create Tables
-- User Table
CREATE TABLE users (
	user_id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    city VARCHAR(50)
);

--  Categories Table
CREATE TABLE categories (
	category_id INT PRIMARY KEY,
    category_name VARCHAR(50)
);

-- Expenses Table
CREATE TABLE expenses (
	expense_id INT PRIMARY KEY,
    user_id INT,
    category_id INT,
    amount DECIMAL(10,2),
    expense_date DATE
); 

-- Inserting sample data
-- Users
INSERT INTO users VALUES ( 1, 'Manish', 'manish@gmail.com', 'Ranchi');  
INSERT INTO users VALUES ( 2, 'Rahul', 'rahul@gmail.com', 'Patna');

INSERT INTO users VALUES 
(3, 'Aman', 'aman@gmail.com', 'Delhi'),
(4, 'Priya', 'priya@gmail.com', 'Ranchi'),
(5, 'Neha', 'neha@gmail.com', 'Mumbai');

-- Inserting into categories
INSERT INTO categories VALUES 
(1, 'Food'),
(2, 'Travel'),
(3, 'Shopping'),
(4, 'Bills');

-- Inserting into expenses
INSERT INTO expenses VALUES
(101, 1, 1, 500.00, '2025-06-01'),
(102, 1, 2, 1200.00, '2025-06-02'),
(103, 2, 1, 300.00, '2025-06-01'),
(104, 3, 3, 2500.00, '2025-06-03'),
(105, 4, 4, 1800.00, '2025-06-02'),
(106, 5, 2, 900.00, '2025-06-04'),
(107, 2, 3, 1500.00, '2025-06-05'),
(108, 1, 1, 700.00, '2025-06-06'); 


-- Practicing SQL Queries
-- Show all users 
SELECT * FROM users;  
-- Show only name and city
SELECT name, city FROM users; 

-- All Expenses
SELECT * FROM expenses; 

-- All Categories
SELECT * FROM categories;

-- UNIQUE cities from user table
SELECT DISTINCT city from users;

--  Show all expenses ordered by amount in ascending order
SELECT * FROM expenses 
ORDER BY amount; -- Ascending is by default, hoever we can use ASC to define explicitly

-- Show all expenses ordered by amount in descending order.
SELECT * FROM expenses 
ORDER BY amount DESC;

-- Show the latest 3 expenses
SELECT * FROM expenses
ORDER BY expense_date DESC LIMIT 3; 

-- Show first 2 users
SELECT * FROM users
ORDER BY user_id LIMIT 2; 

-- Show all expenses whose amount is greater than 100
SELECT * FROM expenses 
WHERE amount > 1000;

-- Show all the users who lives in Ranchi
SELECT name FROM users
WHERE city = 'Ranchi';

-- Show all expenses greater than 500 and less than 2000
SELECT * FROM expenses 
WHERE amount > 500 AND amount < 2000;

--  Show all users who live in Ranchi or Delhi
SELECT * FROM users 
WHERE city = 'Ranchi' OR city = 'Delhi';   -- MySQL expects a complete condition on both sides of OR.
-- Or IN can be used to check inside the list of cities.

-- Show all users who do NOT live in Ranchi.
SELECT * FROM users
WHERE NOT city = 'Ranchi'; 

-- All expenses between 500 and 1500
SELECT * FROM expenses 
WHERE amount BETWEEN 500 AND 1500; 

-- Show all users from Ranchi, Mumbai
SELECT * FROM users
WHERE city IN ('Ranchi', 'Mumbai'); 

-- SHOW All users whose name start with 'M'
SELECT * FROM users 
WHERE name LIKE 'M%';

-- Names ending with 'a'
SELECT * FROM users
WHERE name LIKE '%a';

-- Inserting Test user with null email
INSERT INTO users VALUES
(6, 'TestUser', NULL, 'Kolkata');

-- show users with null email
SELECT * FROM users 
WHERE email IS NULL;

-- show users with not null email
SELECT * FROM users 
WHERE email IS NOT NULL;
