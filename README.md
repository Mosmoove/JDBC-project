# 📦 JDBC Class Library Project

## 📌 Overview

This project is a **Java-based JDBC class library** that simplifies interaction with a MySQL database.
It provides a clean abstraction layer over raw JDBC code and supports full **CRUD operations** through a structured and reusable design.

---

## 🚀 Features

* 🔌 Connect to MySQL database using JDBC
* ➕ Create (Insert new users)
* 📖 Read (Fetch all users)
* ✏️ Update existing users
* ❌ Delete users
* 🖥️ Interactive CLI-based user interface

---

## 🏗️ Project Structure

```
jdbc-project/
├── DBConnection.java   // Handles database connection
├── UserDAO.java        // Contains CRUD operations
├── Main.java           // CLI interface (entry point)
├── mysql-connector-j-9.6.0.jar
```

---

## ⚙️ Requirements

* Java 17+
* MySQL Server
* MySQL Connector/J (JDBC driver)

---

## 🛠️ Setup Instructions

### 1. Clone the Repository

```
git clone https://github.com/YOUR_USERNAME/YOUR_REPO.git
cd jdbc-project
```

### 2. Setup Database

Open MySQL and run:

```sql
CREATE DATABASE testdb;

USE testdb;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);
```

---

### 3. Configure Database Credentials

Update your credentials inside:

```java
DBConnection.java
```

```java
private static final String URL = "jdbc:mysql://localhost:3306/testdb";
private static final String USER = "root";
private static final String PASSWORD = "YOUR_PASSWORD";
```

---

## ▶️ How to Run

### Compile:

```
javac -cp .:mysql-connector-j-9.6.0.jar *.java
```

### Run:

```
java -cp .:mysql-connector-j-9.6.0.jar Main
```

---

## 🧪 Usage

Once running, you’ll see:

```
=== USER MENU ===
1. Add User
2. View Users
3. Update User
4. Delete User
5. Exit
```

Follow the prompts to interact with the database.

---

## 🧠 Design Highlights

* **Separation of Concerns**

  * `DBConnection` → handles connection logic
  * `UserDAO` → handles database operations
  * `Main` → handles user interaction

* **Prepared Statements**

  * Prevent SQL injection
  * Improve performance

---

## 🤖 AI Usage

AI was used to:

* Debug JDBC connection issues
* Structure the project into reusable components
* Improve code clarity and documentation

---

## 📈 Future Improvements

* GUI interface (Java Swing or web-based)
* Logging system
* Input validation and error handling
* Support for additional entities

---

## 👨‍💻 Author

Mohamed Awad

---

## 📜 License

This project is for educational purposes.
