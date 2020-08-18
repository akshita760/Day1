package p3;

public class Account {

	private int accountid;
	private String accountHolderName;
	private int accountsBalance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountsBalance() {
		return accountsBalance;
	}

	public void setAccountsBalance(int accountsBalance) {
		this.accountsBalance = accountsBalance;
	}

	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", accountHolderName=" + accountHolderName + ", accountsBalance="
				+ accountsBalance + "]";
	}
	
	public void deposit(int amount)
	{
		accountsBalance+= amount;
		System.out.println(" Deposit in Account class New Balance "+accountsBalance);
	}
	
	
	
}//end class
