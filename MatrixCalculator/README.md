# Matrix Calculator

This is a command-line Java application that performs various operations on 3x3 matrices. Users can input two matrices and then choose from a menu of operations to perform, such as addition, multiplication, and checking for specific matrix properties.

## Features

-   **Matrix Addition:** Adds two 3x3 matrices.
-   **Matrix Multiplication:** Multiplies two 3x3 matrices.
-   **Symmetric Matrix Check:** Checks if a matrix is symmetric.
-   **Identity Matrix Check:** Checks if a matrix is an identity matrix.

## Folder Structure

- `src`: Contains the Java source files.
  - `MatrixCalculator.java`: The main class that handles user input, menu display, and orchestrates the matrix operations.
  - `Matrix.java`: A class that encapsulates the properties and operations of matrices, including the logic for addition, multiplication, and property checks.
- `lib`: This folder is for dependencies, though this project has none.

The compiled `.class` files will be generated in the `bin` folder.

## How to Run

1.  Make sure you have a JDK installed.
2.  Open the `MatrixCalculator` folder in VS Code.
3.  Go to `src/MatrixCalculator.java`.
4.  Click the "Run" button above the `main` method or press `F5`.
5.  The program will prompt you to enter the elements for two 3x3 matrices. After that, a menu will be displayed with the available operations.
