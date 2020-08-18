package p3;

public class MainClass {

	public static void main(String[] args) {
		
		MainClass obj = new MainClass();
		
		Account account1 = new Account();
		account1.setAccountid(101);
		account1.setAccountHolderName("Mike");
		account1.setAccountsBalance(2000);
		
		CurrentAccount account2 = new CurrentAccount();
		account2.setAccountid(1012);
		account2.setAccountHolderName("Ramesh");
		account2.setAccountsBalance(15000);
		account2.setOrgName("My Company");
		
		
		
		obj.depositOperation(account1,500);
		obj.depositOperation(account2,1000);
		
		
	}
	//                     account , 2nd -> CurrentAccount , 3rd -> DematAccount
	public void depositOperation(Account account,int amount)
	{
		account.deposit(amount);
	}
	
	
	
}
