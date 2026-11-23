public class BankAccountTest {

    public static void main(String[] args) {

        // Create a checking account
        CheckingAccount account = new CheckingAccount();

        // Set account information
        account.setFirstName("John");
        account.setLastName("Doe");
        account.setAccountID(12345);
        account.setInterestRate(2.5);

        // Deposit money
        account.deposit(500.0);

        System.out.println("Initial Account:");
        account.displayAccount();

        // Normal withdrawal
        account.processWithdrawal(200.0);

        System.out.println("\nAfter Withdrawal:");
        account.displayAccount();

        // Overdraft withdrawal
        account.processWithdrawal(400.0);

        System.out.println("\nAfter Overdraft:");
        account.displayAccount();
    }
}
