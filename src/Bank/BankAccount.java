package Bank;

public class BankAccount {
	private String name;
	private int accno;
	
	public BankAccount(String name,int accno)
	{
		this.name=name;
		this.accno = accno;
	}
	
	void display()
	{
		System.out.println("Account Details: ");
		System.out.println("Holder Name: "+name);
		System.out.println("Acc No: "+accno);
	}
}
