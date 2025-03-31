package laboratory1_2;

public class BankAccount 
{
	private int accountNumber;
	private double balance;
	
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	int setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
		return accountNumber;
	}
	
	double setBalance(double balance) {
		this.balance = balance;
		return balance;
	}
	
	int getAccountNumber() {
		System.out.print("Account Number: ");
		return accountNumber;
	}
	
	double getBalance() {
		System.out.print("Balance: ");
		return balance;
	}
}
