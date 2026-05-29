# Grocery Store Management System

This is a command-line based Grocery Store Management System implemented in Java. The project is a demonstration of Object-Oriented Programming principles, featuring a menu-driven interface to manage various aspects of a grocery store.

## Features

-   **Item Management:** Add, edit, delete, and view grocery items.
-   **Employee Management:** Manage employee records, including adding, editing, deleting, and viewing employee information.
-   **Customer Management:** Handle customer data with options to add, edit, delete, and view customer details.
-   **Order Management:** Process customer orders, including adding, editing, deleting, and viewing orders.

## Folder Structure

- `src`: Contains all the Java source files for the project.
  - `Main.java`: The main class that runs the application and displays the main menu.
  - `Item.java`: Represents a grocery item with properties like ID, name, price, and stock.
  - `Employee.java`: A subclass of `Person` that represents an employee.
  - `Customer.java`: A subclass of `Person` that represents a customer.
  - `Order.java`: Represents a customer's order, containing details about the items ordered.
  - `Person.java`: A base class for `Employee` and `Customer`.
  - `Address.java`: Represents an address.
  - `Date.java`: Represents a date.
  - `OrderProcessing.java`: Interface for order processing.
  - `Sales.java`: Interface for sales.
- `lib`: This folder is for dependencies, though this project has none.

The compiled `.class` files will be generated in the `bin` folder.

## How to Run

1.  Make sure you have a JDK installed.
2.  Open the `GroceryStoreMS` folder in VS Code.
3.  Go to `src/Main.java`.
4.  Click the "Run" button above the `main` method or press `F5`.
5.  The program will start in the terminal, presenting a main menu with options to manage items, employees, customers, and orders. The system is pre-populated with some sample data.
