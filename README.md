# Employee Management System

## Overview

The Employee Management System is a Java-based console application developed using JDBC and Oracle Database. It allows users to perform basic CRUD (Create, Read, Update, Delete) operations on employee records stored in an Oracle database.

## Features

* Add a new employee
* Update employee details
* Delete an employee
* Fetch a single employee by Employee ID
* Fetch and display all employees
* JDBC connectivity with Oracle XE
* Layered Architecture (Bean, DAO, Service, Utility)

## Technologies Used

* Java
* JDBC (Java Database Connectivity)
* Oracle XE Database
* Eclipse IDE

## Project Structure

```text
src/
│
├── in.kce.bean
│   └── Employee.java
│
├── in.kce.dao
│   └── EmployeeDAO.java
│
├── in.kce.service
│   └── EmployeeService.java
│
├── in.kce.util
│   └── DBUtil.java
│
└── in.kce.main
    └── TestEmployee.java
```

## Database Configuration

### Create Table

```sql
CREATE TABLE employee2 (
    empId NUMBER PRIMARY KEY,
    empName VARCHAR2(50),
    designation VARCHAR2(50)
);
```

### JDBC Connection

```java
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "system";
String pass = "your_password";
```

Update the username and password according to your Oracle XE configuration.

## Functionalities

### 1. Store Employee

Adds a new employee record to the database.

Example:

```text
Employee ID : 101
Employee Name : Sastiga
Designation : Manager
```

### 2. Update Employee

Updates the employee name based on Employee ID.

Example:

```text
Employee ID : 101
New Name : Harsh
```

### 3. Delete Employee

Deletes an employee record using Employee ID.

Example:

```text
Employee ID : 101
```

### 4. Fetch Employee

Retrieves details of a specific employee using Employee ID.

Example Output:

```text
ID : 101
Name : Harsh
Designation : Manager
```

### 5. Fetch All Employees

Displays all employee records available in the database.

Example Output:

```text
ID : 101
Name : Harsh
Designation : Manager

ID : 102
Name : Priya
Designation : Developer
```

## Architecture

### Employee Bean

Stores employee details:

* empId
* empName
* designation

### EmployeeDAO

Responsible for database operations:

* saveEmployee()
* updateEmployee()
* deleteEmployee()
* getEmployee()
* getAllEmployees()

### EmployeeService

Acts as a service layer between the user interface and DAO layer.

### DBUtil

Manages database connectivity.

### TestEmployee

Provides a menu-driven console interface for user interaction.

## Learning Outcomes

* Understanding JDBC connectivity
* Working with Oracle Database
* Implementing CRUD operations
* Using PreparedStatement
* Layered application development
* Exception handling in Java

## Future Enhancements

* Employee Search by Name
* Employee Salary Management
* Login Authentication
* GUI using Java Swing/JavaFX
* Web-based Employee Management System
* Report Generation




