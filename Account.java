public class Account
{
	private double balance;
	private String name; 
	private int acctNum;
	
   public Account(double initBal, String owner, int number)
	{
	  this.balance = initBal;
      this.name = owner;
      this.acctNum = number; 
	}
	
	public void withdraw(double amount)
	{
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}
	
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	
	public double getBalance()
	{
		return this.balance;
	}

	public String toString()
	{
		return "Name : "+this.name + ", Account Number :" + this.acctNum +", Account Balance :"+ this.balance;
	}

	// Deducts $10 service fee //
	public void chargeFee()
	{
		this.balance -= 10;
	}
	
	// Changes the name on the account
	public void changeName(String newName)
	{
		this.name = newName;
	}
}
