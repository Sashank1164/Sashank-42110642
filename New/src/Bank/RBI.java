package Bank;

import java.util.Scanner;
public class RBI {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
			System.out.println("Welcome!! To SBI Bank.");
			System.out.print("\nEnter Account Holder name: ");
			String z  =sc.nextLine();
			System.out.print("Enter Acc No: ");
			Long y = sc.nextLong(9);
			System.out.println("\nLogged Successfully!!");
			SBI si = new SBI(z,y);
			System.out.println("\nMenu");
			System.out.println("1.My Account ");
			System.out.println("2.Withdraw Amount");
			System.out.println("3.Deposit Amount");
			System.out.println("4.Transaction History");
			System.out.println("5.Exit");
			do {
			System.out.print("\nKindly enter your choice: ");
			choice =sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				si.sbi();
				System.out.println("\nThank you for being a SBI family member!!");
				break;
				
			case 2:
				si.ba();
				System.out.println("\nThankyou have a great day!!");
				break;
			case 3:
				si.deposit();
				System.out.println("\nThankyou have a great day!!");
				break;
			case 4:
				si.viewTH();
				break;
			case 5:
				si.exit();
				System.out.println("\nThankyou for using SBI banking");
				break;
				
			default:
				System.out.println("Invalid chice");
			}//break;
		}while(choice!=5);
		System.out.println(" ");
		sc.close();
	}
}
