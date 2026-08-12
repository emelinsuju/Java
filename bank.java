public class BankAccount {
    
    private String accountNumber;
    private String accountHolder;
    private double balance;

   
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited:  "+ amount);
            System.out.println("Updated Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
        System.out.println();
    }
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", "John Doe", 500.0);
        myAccount.displayDetails();
        myAccount.deposit(150.50);
        myAccount.displayDetails();
    }
}
