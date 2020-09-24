public class Account
{
	private double balance;
	private String name; 
	private int acctNum;
	
   	//Constructor -- initializes balance, owner, and account number	
   public Account(double initBal, String owner, int number)
	{
	  this.balance = initBal;
      this.name = owner;
      this.acctNum = number; 
	}
	// --------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	// --------------------------------------------
	public void withdraw(double amount)
	{
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}
	// --------------------------------------------
	// Adds deposit amount to balance.
	// --------------------------------------------
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	// --------------------------------------------
	// Returns balance.
	// --------------------------------------------
	public double getBalance()
	{
		return this.balance;
	}
	// --------------------------------------------
	// Returns a string containing the name, account number, and balance.
	// --------------------------------------------
	public String toString()
	{
		return "Name : "+this.name + ", Account Number :" + this.acctNum +", Account Balance :"+ this.balance;
	}
	// --------------------------------------------
	// Deducts $10 service fee //
	// --------------------------------------------
	public void chargeFee()
	{
		this.balance -= 10;
	}
	// --------------------------------------------
	// Changes the name on the account
	// --------------------------------------------
	public void changeName(String newName)
	{
		this.name = newName;
	}
}