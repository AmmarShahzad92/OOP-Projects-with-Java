# Polynomial Adder

This is a Java project that demonstrates the addition of two polynomials. The program is structured to handle polynomials as arrays of terms, where each term has a coefficient and an exponent.

## Folder Structure

- `src`: Contains the Java source files.
  - `PolynomialAddition.java`: This class contains the logic for adding two polynomials. It takes two polynomial arrays and produces a resulting polynomial array.
  - `polynomial.java`: This class defines the structure of a single term in a polynomial, consisting of a coefficient and an exponent.

## How to Use

This project provides the backend logic for polynomial addition but does not include a main method to run directly. To use this project, you would need to create a main class that does the following:

1.  Creates instances of the `polynomial` class to represent the terms of two polynomials.
2.  Populates two arrays of `polynomial` objects.
3.  Creates an instance of the `PolynomialAddition` class.
4.  Calls the `AdditionOfPolynomial` method to perform the addition.
5.  Prints the resulting polynomial.

### Example Usage (in a separate main class):

```java
public class Main {
    public static void main(String[] args) {
        // Create and populate polynomial 1
        polynomial[] p1 = new polynomial[2];
        p1[0] = new polynomial(2, 3); // 3x^2
        p1[1] = new polynomial(0, 5); // 5

        // Create and populate polynomial 2
        polynomial[] p2 = new polynomial[2];
        p2[0] = new polynomial(2, 4); // 4x^2
        p2[1] = new polynomial(1, 2); // 2x

        // Create PolynomialAddition object and add polynomials
        PolynomialAddition adder = new PolynomialAddition();
        // You would need to adapt the PolynomialAddition class to take the arrays
        // or have a method to set them.

        // The current structure of PolynomialAddition is a bit complex for direct use,
        // it would need to be refactored for easier instantiation and use.
    }
}
```