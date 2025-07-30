package Encapsulation;


// Using the BankAccount Class:
public class Main {
    public static void main(String[] args) {
        // Create a new bank account with initial balance
      BankAccount account = new BankAccount("123456789", 500.0);

      // Display account information
      account.displayAccountInfo();
      System.out.println(account.getAccountNumber());
      System.out.println(account.getBalance());
      
      // Deposit money
      account.deposit(150.0);
      account.displayAccountInfo();

      // Withdraw money
      account.withdraw(100.0);
      account.displayAccountInfo();

// Try to set an invalid balance directly (will not compile)
// account.balance = -100; // Error: balance has private access in BankAccount

// Try to set an invalid balance using setter
account.setBalance(-100); // Prints: Balance cannot be negative.

// Try to deposit a negative amount
account.deposit(-50); //Prints: Deposit amount must be positive.

        // Try to withdraw more than the balance
account.withdraw(1000); // Prints: Invalid withdraw amount.
    }
}
