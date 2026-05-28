import java.util.Scanner;

public class MatrixCalculator {
        public static void main(String[] args) 
    {   // start of main method

        // Creating scanner and matrix class objects
        Scanner scanner = new Scanner(System.in);
        Matrix matrixCalculator = new Matrix();


        // Declaring matrices
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int choice;

        // Input for matrix1
        System.out.println("Enter elements for Matrix 1 (3x3):");
        for (int i = 0; i < 3; i++) 
        {   // start of outer for loop
            for (int j = 0; j < 3; j++) 
            {   // start of inner for loop
                System.out.printf("Matrix 1[%d][%d]: ", i, j);
                matrix1[i][j] = scanner.nextInt();
            }   // end of inner for loop
        }   // end of outer for loop

        // Input for matrix2
        System.out.println("Enter elements for Matrix 2 (3x3):");
        for (int i = 0; i < 3; i++) 
        {   // start of outer for loop
            for (int j = 0; j < 3; j++) 
            {  // start of inner for loop
                System.out.printf("Matrix 2[%d][%d]: ", i, j);
                matrix2[i][j] = scanner.nextInt();
            }  // end of inner for loop
        }   // end of outer for loop


        // Setting matrices in the matrixCalculator object
        matrixCalculator.setMatrix1(matrix1);
        matrixCalculator.setMatrix2(matrix2);

        while (true)
        {   // start of while loop
            System.out.println("\nMatrix Calculator Menu:");
            System.out.println("1. Add Matrices");
            System.out.println("2. Multiply Matrices");
            System.out.println("3. Check if Matrix 1 is Symmetric");
            System.out.println("4. Check if Matrix 1 is Identity");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {   // start of switch
                case 1: // Matrix Addition
                    int[][] additionResult = matrixCalculator.addMatrices();
                    System.out.println("Result of Matrix Addition:");
                    printMatrix(additionResult);
                    break;

                case 2: // Matrix Multiplication
                    int[][] multiplicationResult = matrixCalculator.multiplyMatrices();
                    if (multiplicationResult != null) 
                    {   // start of if
                        System.out.println("Result of Matrix Multiplication:");
                        printMatrix(multiplicationResult);
                    }   // end of if
                    else 
                    {   // start of else
                        System.out.println("Matrix multiplication is not possible with the given matrices.");
                    }   // end of else
                    break;

                case 3: // Symmetric Matrix check
                    boolean isSymmetric = matrixCalculator.isSymmetricMatrix(matrix1);
                    if (isSymmetric) 
                    {   // start of if
                        System.out.println("Matrix 1 is symmetric.");
                    }   // end of if
                    else 
                    {   // start of else
                        System.out.println("Matrix 1 is not symmetric.");
                    }   // end of else
                    break;

                case 4: // Identity Matrix check
                    boolean isIdentity = matrixCalculator.isIdentityMatrix(matrix1);
                    if (isIdentity) 
                    {   // start of if
                        System.out.println("Matrix 1 is an identity matrix.");
                    }   // end of if 
                    else 
                    {   // start of else
                        System.out.println("Matrix 1 is not an identity matrix.");
                    }   // end of else
                    break;

                case 0: // Exit
                    System.out.println("Exiting... Thank you for using the Matrix Calculator!");
                    break;

                default:    // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }   // end of switch
        }  // end of while loop
    }   // end of main method
    // Helper method to print matrices

    public static void printMatrix(int[][] matrix) 
    {   // start of printMatrix
        for (int i = 0; i < matrix.length; i++) 
        {   // start of outer for loop
            for (int j = 0; j < matrix[0].length; j++) 
            {   // start of inner for loop
                System.out.print(matrix[i][j] + " ");
            }   // end of inner for loop
            System.out.println();
        }   // end of outer for loop
    }   // end of printMatrix
}   // end of Main class
