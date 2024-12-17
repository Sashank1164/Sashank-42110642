package Bank;

import java.util.ArrayList;
import java.util.Scanner;
public class SBI {
	private String name;
	private Long accno;
	private double balance=5;
	private double amount;
	private double damount;
	private ArrayList<String> TransactionHistory;
	Scanner sc = new Scanner(System.in);
	SBI(String z,Long y)
	{
		this.name = z;
		this.accno = y;
		this.TransactionHistory = new ArrayList<>();
		this.TransactionHistory.add("Account created with intial amount: Rs. "+balance);
	}
	void sbi()
	{
	System.out.println("Account Holder name : "+name);
	System.out.println("Account Number : "+accno);
	System.out.println("Avl Balance: "+balance+" Rs.");
	System.out.println(" ");
	}
	
	void ba()
	{
		System.out.print("\nEnter the amount to withdraw: ");
		amount = sc.nextDouble();
		if(amount>0 && amount<=balance)
		{
			balance = balance-amount;
			System.out.println("Rs."+amount+" is withdrawn from your SBI account.");
			System.out.println("Avl Balance is : "+balance+" Rs.");
			TransactionHistory.add("Withdrawn: Rs. "+amount);
		}else if(amount>balance)
		{
			System.out.println("Unsufficient Balance...Marri emduku ra nek");
		}
	}
	
	void deposit()
	{	
		System.out.print("\nEnter the amount to deposit: ");
		damount = sc.nextDouble();
		if(damount>0)
		{
			balance = balance+damount;
			System.out.println("Rs."+damount+" has been deposited to your Bamk Account");
			System.out.println("Avl Balance is : "+balance+" Rs.");
			TransactionHistory.add("Deposited: Rs. "+damount);
		}else
		{
			System.out.println("Invalid deposit amount.");
		}
	}
	
	void viewTH()
	{
		System.out.println("\nTransaction History: ");
		for(String transaction : TransactionHistory)
		{
			System.out.println(transaction);
		}
	}
	
	void exit()
	{
		System.out.println("\nExiting..!!");
	}
}
