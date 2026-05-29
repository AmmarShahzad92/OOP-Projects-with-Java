# Student DBMS

This project is a simple command-line Student Database Management System (DBMS) implemented in Java. It serves as a practical example of Object-Oriented Programming (OOP) principles, including classes, objects, and relationships.

The system provides a menu-driven interface to manage student, teacher, course, and marks data. It allows for adding, viewing, updating, and deleting records, as well as calculating a student's GPA.

## Folder Structure

The workspace is organized as follows:

- `src`: This directory contains all the Java source files.
  - `StudentDBMS.java`: The main class that drives the application, handling user input and menu navigation.
  - `Persons.java`: A base class for entities like students and teachers.
  - `Students.java`: A subclass of `Persons` representing student data.
  - `Teachers.java`: A subclass of `Persons` representing teacher data.
  - `Address.java`: A class to store address information for persons.
  - `Course.java`: Represents a course with details like course code, name, and credit hours.
  - `CourseMarks.java`: Manages the marks obtained by a student in a specific course.
  - `Department.java`: A class for department-related information.
  - `Employees.java`: A class for employee data.
- `lib`: This folder is intended for external libraries or dependencies, although this project does not currently use any.

Compiled `.class` files are generated in the `bin` folder by default when the project is built in VS Code.

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed on your system.
2.  Open the `StudentDBMS` folder in Visual Studio Code.
3.  Locate the `StudentDBMS.java` file in the `src` directory.
4.  You can run the application by clicking the "Run" button that appears above the `main` method or by pressing `F5`.

The application will start in the terminal, presenting a menu of options to interact with the system. The program initially populates some sample data for demonstration purposes.
