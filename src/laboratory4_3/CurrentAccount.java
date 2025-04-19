package laboratory4_3;

public class CurrentAccount extends BankAccount {
    private double balance = 0;

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing " + amount + " into current account. Balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawing " + amount + " from current account. Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in current account.");
        }
    }
}
