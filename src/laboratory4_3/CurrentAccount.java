package laboratory4_3;

public class CurrentAccount extends BankAccount {
    @Override
    void deposit(double amount) {
        System.out.println("Depositing " + amount + " into current account.");        
    }
    @Override
    void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " from current account.");
    }
}
