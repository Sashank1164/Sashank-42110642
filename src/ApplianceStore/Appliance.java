package ApplianceStore;

public class Appliance {
	String brand,model;
	Appliance(String brand,String model)
	{
		this.brand=brand;
		this.model=model;
	}
	void display()
	{
		System.out.println("Appliance Details: ");
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		
	}

}
