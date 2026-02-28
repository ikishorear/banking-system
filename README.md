# Banking Management System

## Project Overview

This project is a **console-based Banking Management System** built using Java.  
The purpose of this system is to simulate basic banking operations while helping the developer deeply understand:

- Object Oriented Programming (OOP)
- Exception Handling
- File Handling (Data Persistence)

The system allows customers to create accounts, perform transactions, and manage their banking activities through a menu-driven console interface.

---

## Project Objectives

The system is designed as a learning-focused application that ensures:

- Strong use of **core OOP principles**
- Real-world use of **custom exception handling**
- Practical implementation of **file-based data storage**

The application should behave like a simplified banking system that retains data even after the program exits.

---

## Customer Management

The system must allow:

- Creating new customers
- Storing customer details
- Retrieving customer information when needed

Each customer will be uniquely identifiable and linked to their bank account(s).

---

## Account Management

Customers should be able to open bank accounts of different types:

### Savings Account
- Must maintain a minimum balance
- Cannot withdraw beyond allowed limits

### Current Account
- May allow overdraft up to a defined limit

Each account must:

- Be linked to a customer
- Have a unique account number
- Be secured using a PIN
- Maintain balance and status

---

## Authentication

Users must be able to securely access their accounts using:

- Account Number
- PIN

Only authenticated users can perform banking operations.

---

## Banking Operations

Once logged in, users should be able to:

- Deposit money
- Withdraw money
- Transfer funds to another account
- Check account balance
- View recent transaction history
- Change PIN
- Close account

All operations must follow business rules specific to the account type.

---

## Transactions

Every banking operation involving money must generate a transaction record.

Transactions should include:

- Type (Deposit / Withdraw / Transfer)
- Amount
- Timestamp
- Source and Destination Accounts
- Status of operation

---

## Administrative Functions

The system should also support administrative capabilities such as:

- Viewing all customers
- Viewing all accounts
- Searching for accounts
- Generating reports

---

## Exception Handling

The system must be capable of handling:

- Invalid user inputs
- Insufficient balance scenarios
- Unauthorized access attempts
- Invalid transfers
- Operations on closed accounts
- File read/write failures
- Corrupted stored data

The application should fail gracefully and provide meaningful feedback to the user.

---

## Data Persistence

All system data must be stored using file handling techniques.

The system must:

- Load saved data when the application starts
- Save updates after operations
- Maintain records for:
  - Customers
  - Accounts
  - Transactions

Data should remain available across program executions.

---

## Console Interface

The system should be fully menu-driven and provide:

- A main menu
- User operation menus
- Administrative menus

Navigation should be simple and structured.




