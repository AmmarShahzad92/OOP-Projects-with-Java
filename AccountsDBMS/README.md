# Accounts DBMS

This project is a simple command-line Database Management System for bank accounts, implemented in Java. It demonstrates basic Object-Oriented Programming (OOP) principles.

The system allows a user to log in to a preset bank account and perform basic operations like withdrawing and depositing money from either a savings or a current account.

## Folder Structure

The workspace contains the following folders:

- `src`: Contains the Java source files.
  - `AccountsDBMS.java`: The main class and entry point of the application.
  - `BankAccount.java`: An abstract base class for bank accounts.
  - `SavingsAccount.java`: A subclass of `BankAccount` representing a savings account.
  - `CurrentAccount.java`: A subclass of `BankAccount` representing a current account.
- `lib`: This folder is for maintaining dependencies, though this project currently has none.

Compiled `.class` files will be generated in the `bin` folder by default by VS Code's Java extension.

## How to Run

1.  Make sure you have a Java Development Kit (JDK) installed.
2.  Open the `AccountsDBMS` folder in Visual Studio Code.
3.  Navigate to `src/AccountsDBMS.java`.
4.  Click the "Run" button that appears above the `main` method, or press `F5` to run the application.

You will be prompted to enter account details in the terminal. Use the following preset credentials:

-   **Account Title:** `Ammar Shahzad`
-   **Account Number:** `743454`
-   **PIN:** `4599`
