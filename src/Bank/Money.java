package Bank;

public class Money {
	private int DailyIncome;
	private int MonthlyIncome; //= DailyIncome*30;
	
	public Money(int DailyIncome)
	{
		this.DailyIncome = DailyIncome;
	}
   // private int MonthlyIncome = DailyIncome*30;
	
	void displayy()
	{
		System.out.println("Income: ");
		System.out.println("DailyIncome: "+DailyIncome+" Rs");
		MonthlyIncome = DailyIncome*30;
		System.out.println("MonthlyIncome: "+MonthlyIncome+" Rs");
	}

}
