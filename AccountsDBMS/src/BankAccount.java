abstract class BankAccount 
{
    private String accountTitle;
    private int accountNo;
    private int pin;
    protected double balance;

    public BankAccount(String accountTitle, int accountNo, int pin, double balance) 
    {
        this.accountTitle = accountTitle;
        this.accountNo = accountNo;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validateLogin(String title, int number, int pin) 
    {
        return this.accountTitle.equals(title) && this.accountNo == number && this.pin == pin;
    }

    public abstract void withdraw(double amount);

    public void deposit(double amount) 
    {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public double getBalance() 
    {
        return balance;
    }
}
