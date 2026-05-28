import java.util.Scanner;   // Import Scanner class

public class AccountsDBMS 
{   // AccountsDBMS Main class
    public static void main(String[] args) 
    {   // Main method
        Scanner scanner = new Scanner(System.in);

        // Preset account details
        String presetTitle = "Ammar Shahzad";
        int presetAccountNo = 743454;
        int presetPin = 4599;
        double initialBalance = 50000;

        // Initialize accounts
        SavingsAccount savingsAccount = new SavingsAccount(presetTitle, presetAccountNo, presetPin, initialBalance);
        CurrentAccount currentAccount = new CurrentAccount(presetTitle, presetAccountNo, presetPin, initialBalance);

        // Login validation
        int attempts = 0;
        boolean isLoggedIn = false;

        while (attempts < 3) 
        {   // While loop for login validation
            System.out.println("Enter Account Title:");
            String title = scanner.nextLine();
            System.out.println("Enter Account Number:");
            int accNo = scanner.nextInt();
            System.out.println("Enter PIN:");
            int pin = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (savingsAccount.validateLogin(title, accNo, pin) || currentAccount.validateLogin(title, accNo, pin)) 
            {   // If condition for login validation
                isLoggedIn = true;
                break;
            }   // End of if condition
            else 
            {   // Else condition for login validation
                attempts++;
                System.out.println("Incorrect credentials. Attempt " + attempts + " of 3.");
            }   // End of else condition
        }   // End of while loop

        if (!isLoggedIn) 
        {   // If condition for login validation
            System.out.println("Account blocked. Contact bank service center.");
            return;
        }   // End of if condition

        // Infinite loop for menu
        int option = 1;
        double amount = 0.0;
        double interestAmount = 0.0;

        while (true) 
        {   // While loop for menu
            System.out.println("\n===== Bank Account System Menu =====");
            System.out.println("1. Deposit to Savings Account");
            System.out.println("2. Deposit to Current Account");
            System.out.println("3. Withdraw from Savings Account");
            System.out.println("4. Withdraw from Current Account");
            System.out.println("5. View Savings Account Interest");
            System.out.println("6. View Savings Account Balance");
            System.out.println("7. View Current Account Balance");
            System.out.println("0. Exit");
            System.out.print("Enter your option: ");
            
            option = scanner.nextInt();

            if (option == 0)
            {   // If condition for exit
                System.out.println("Exiting the system. Thank you!");
                scanner.close();
                System.exit(0);
            }   // End of if condition

            switch (option) 
            {   // Switch case for menu
                case 1:
                    // Deposit to Savings Account
                    System.out.print("Enter amount to deposit to Savings Account: ");
                    amount = scanner.nextDouble();
                    savingsAccount.deposit(amount);
                    System.out.println("Updated Savings Account Balance: " + savingsAccount.getBalance());
                    break;

                case 2:
                    // Deposit to Current Account
                    System.out.print("Enter amount to deposit to Current Account: ");
                    amount = scanner.nextDouble();
                    currentAccount.deposit(amount);
                    System.out.println("Updated Current Account Balance: " + currentAccount.getBalance());
                    break;

                case 3:
                    // Withdraw from Savings Account
                    System.out.print("Enter amount to withdraw from Savings Account: ");
                    amount = scanner.nextDouble();
                    savingsAccount.withdraw(amount);
                    System.out.println("Updated Savings Account Balance: " + savingsAccount.getBalance());
                    break;

                case 4:
                    // Withdraw from Current Account
                    System.out.print("Enter amount to withdraw from Current Account: ");
                    amount = scanner.nextDouble();
                    currentAccount.withdraw(amount);
                    System.out.println("Updated Current Account Balance: " + currentAccount.getBalance());
                    break;

                case 5:
                    // View Savings Account Interest
                    interestAmount = savingsAccount.calculateInterest();
                    System.out.println("Interest earned in Savings Account: " + interestAmount);
                    break;

                case 6:
                    // View Savings Account Balance
                    System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
                    break;

                case 7:
                    // View Current Account Balance
                    System.out.println("Current Account Balance: " + currentAccount.getBalance());
                    break;

                default:
                    // Invalid option
                    System.out.println("Invalid option. Please try again.");
            }   // End of switch case
        }   // End of while loop
    }   // End of main method
}   // End of AccountsDBMS Main class