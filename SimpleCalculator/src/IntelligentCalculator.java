import java.util.Scanner;

public class IntelligentCalculator 
{
    public static void main(String[] args)
    {
        CalculatorFunctions calc = new CalculatorFunctions();
        Scanner in = new Scanner(System.in);
        int option = 1;
        while (option != 0)
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 0 to exit");
            System.out.println("Enter your option: ");
            option = in.nextInt();
            if (option == 0)
            {
                System.out.println("Exiting Program......");
                break;
            }
            System.out.println("Enter two numbers");
            int a = in.nextInt();
            int b = in.nextInt();
            switch (option)
            {
                case 1:
                    System.out.println("sum of " + a + "and" + b + " = " + calc.add(a, b));
                    break;
                case 2:               
                    System.out.println("difference of " + a + "and" + b + " = " + calc.subtract(a, b));
                    break; 
                case 3:              
                    System.out.println("product of " + a + "and" + b + " = " + calc.multiply(a, b));
                    break;
                case 4: 
                    System.out.println("division of " + a + "and" + b + " = " + calc.divide(a, b));
                    break;
                default:    
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
