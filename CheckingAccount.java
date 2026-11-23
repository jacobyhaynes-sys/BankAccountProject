public class CheckingAccount extends BankAccount {

    // Additional field
    private double interestRate;

    // Constructor
    public CheckingAccount() {
        super();
        interestRate = 0.0;
    }

    // Interest rate setter
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Interest rate getter
    public double getInterestRate() {
        return interestRate;
    }

    // Process withdrawal with overdraft fee
    public void processWithdrawal(double amount) {

        if (amount > getBalance()) {
            withdrawal(amount);
            withdrawal(30.0);

            System.out.println(
                "Overdraft fee of $30.00 assessed."
            );
        } else {
            withdrawal(amount);
        }
    }

    // Display all account information
    public void displayAccount() {
        accountSummary();
        System.out.println(
            "Interest Rate: " + interestRate + "%"
        );
    }
}
