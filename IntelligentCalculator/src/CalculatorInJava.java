import java.util.Scanner;

public class CalculatorInJava { // start of class Calculator
    public static void main(String[] args) // start of main function
    {
        CalcOperations calc = new CalcOperations();
        Scanner in = new Scanner(System.in);
        int choice = 1;
        int num1 = 0; // initializing num1
        int num2 = 0; // initializing num2
        int position;

        while (choice != 0) // starting while loop
        {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. View History");
            System.out.println("6. Delete All History");
            System.out.println("7. Delete Specific History");
            System.out.println("0. Exit Program");
            System.out.println("Enter your Choice: ");
            choice = in.nextInt();

            if (choice >= 1 && choice <= 4)
            {
                System.out.print("Enter first number: ");
                num1 = in.nextInt();
                System.out.print("Enter second number: ");
                num2 = in.nextInt();
            }// condition to check for arithematic operation choice

            if (choice == 0)
            {
                break;
            }// exit condition

            switch (choice) { // start of switch
                case 1:
                    System.out.println("Sum: " + calc.additon(num1, num2));
                    break;
                case 2:
                    System.out.println("Difference: " + calc.subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("Product: " + calc.multiplication(num1, num2));
                    break;
                case 4:
                    System.out.println("Quotient: " + calc.division(num1, num2));
                    break;
                case 5:
                    calc.HistoryViewer();
                    break;
                case 6:
                    calc.deleteAllHistory();
                    break;
                case 7:
                    System.out.println("Enter the position");
                    position = in.nextInt();
                    calc.deleteSpecificHistory(position);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            } // end of switch cases
        } // end of while
    } // end of main()
} // end of class Calculator()
