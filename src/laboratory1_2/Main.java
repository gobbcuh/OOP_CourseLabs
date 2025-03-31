package laboratory1_2;

public class Main {
	public static void main(String[] args) 
	{
		 BankAccount user = new BankAccount(0, 0);
		 
		 user.setAccountNumber(994176);
		 user.setBalance(999000);
		 
		 System.out.println(user.getAccountNumber());
		 System.out.println(user.getBalance());
	}

}
