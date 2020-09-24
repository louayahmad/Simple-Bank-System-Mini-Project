public class ManageAccount
{
	public static void main(String[] args)
	{
		Account acct1, acct2;

		acct1 = new Account(1000, "Sally", 1111);
		
		acct2 = new Account(500,"Joe",1112);
		
		acct2.deposit(100);
		
		System.out.println(acct2.getBalance());
	
		acct1.withdraw(50);
		
		System.out.println(acct1.getBalance());
		
		acct1.chargeFee();
        acct2.chargeFee();
		
		acct2.changeName("Joseph");
		
		System.out.println(acct1.toString());
        System.out.println(acct2.toString());

	}
}