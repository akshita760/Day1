package p3;

public class CurrentAccount extends Account {

	private String orgName;
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	
	@Override
	public String toString() {
		return "CurrentAccount [orgName=" + orgName + "]";
	}

	public void overdraft()
	{
		System.out.println(" Overfraft of Current Account called...");
	}

	@Override
	public void deposit(int amount) {
		
		
			int balance = super.getAccountsBalance();
			balance+=amount;
			balance++; // bank fee
			super.setAccountsBalance(balance);
			System.out.println(" Deposit in CurrentAccount class New Balance "+super.getAccountsBalance());
	
		
	}
	
	
}
