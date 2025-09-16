# JDBC Program – Insert and Fetch Data from MySQL

This Java program demonstrates how to connect to a MySQL database using **JDBC**, insert user-provided data, and fetch all records from the table.

---

## 📌 Features
- Connects to MySQL database using JDBC.
- Takes **ID** and **Name** from user input.
- Inserts data into `sqldata` table.
- Fetches and displays all records from the table.
- Closes connection properly after execution.

---

## 🛠️ Requirements
- **Java JDK 8+**
- **MySQL Server** running on `localhost` (port `3308` in this example).
- **MySQL Connector/J** (JDBC Driver) added to your project classpath.
- A database named `springdb` with a table `sqldata`.

---

## 🗄️ Database Setup

Run the following SQL commands in MySQL before executing the program:

```sql
CREATE DATABASE springdb;

USE springdb;

CREATE TABLE sqldata (
  id INT PRIMARY KEY,
  name VARCHAR(100)
);
