class CurrentAccount extends BankAccount {
    private final double serviceChargeRate = 0.06;
    private final int transactionFee = 50;

    public CurrentAccount(String accountTitle, int accountNo, int pin, double balance) {
        super(accountTitle, accountNo, pin, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        double serviceCharge = amount * serviceChargeRate + transactionFee;
        balance -= (amount + serviceCharge);
        System.out.println("Withdrawn: " + amount + ", Service charge: " + serviceCharge);
    }
}
