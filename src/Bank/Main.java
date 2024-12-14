package Bank;

public class Main {
	public static void main(String[]args)
	{
		BankAccount acc = new BankAccount("Sashank",1164);
		//BankAccount acc = new BankAccount("Sashank",1164);
		Money m = new Money(15000);
		acc.display();
		m.displayy();
	}

}
