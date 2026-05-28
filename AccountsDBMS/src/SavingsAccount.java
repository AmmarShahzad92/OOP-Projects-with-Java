class SavingsAccount extends BankAccount {
    private final double interestRate = 0.05;
    private final double minBalance = 20000;
    private final int penalty = 20;

    public SavingsAccount(String accountTitle, int accountNo, int pin, double balance) {
        super(accountTitle, accountNo, pin, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance < minBalance) {
            System.out.println("Balance is below the minimum required.");
            return;
        }
        if (amount > balance * 0.8) {
            System.out.println("Cannot withdraw more than 80% of balance.");
            return;
        }
        if (balance - amount < minBalance) {
            amount += amount * penalty / 100.0;
            System.out.println("Penalty applied.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
}
