package laboratory4_3;

public class SavingsAccount extends BankAccount {
    @Override
    void deposit(double amount) {
        System.out.println("Depositing " + amount + " into savings account.");
    }
    @Override
    void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " from savings account.");
    }
}
