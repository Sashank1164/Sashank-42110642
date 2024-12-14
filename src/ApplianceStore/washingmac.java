package ApplianceStore;

public class washingmac extends Appliance {
	float LC,spinspeed;
	washingmac(String brand,String model,float LC,float spinspeed)
	{
		super(brand,model);
		this.LC=LC;
		this.spinspeed=spinspeed;
		
	}
	void dispwashmac()
	{
		display();
		System.out.println("Load Capacity: "+LC);
		System.out.println("Spinspeed: "+spinspeed);
		enecom();
	}
	void enecom()
	{
		double EC=1.5*LC;
		System.out.println("Energy Consumption: "+EC +" Units");
	}

}
