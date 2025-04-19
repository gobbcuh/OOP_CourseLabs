package laboratory4_3;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();

        savings.deposit(500);
        savings.withdraw(200);

        current.deposit(1000);
        current.withdraw(300);
    }
}
