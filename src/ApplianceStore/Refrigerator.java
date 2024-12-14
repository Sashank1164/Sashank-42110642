package ApplianceStore;

public class Refrigerator extends Appliance {
	float capacity,energyrating;
	Refrigerator(String brand,String model,float capacity,float energyrating)
	{
		super(brand,model);
		this.capacity=capacity;
		this.energyrating=energyrating;
		
	}
	void dispfridge()
	{
		display();
		System.out.println("Capacity: "+capacity);
		System.out.println("Energy Rating: "+energyrating);
		encom();
	}
	void encom()
	{
		double en = 1.5*energyrating;
		System.out.println("Energy Consumption: "+en);
	}

}
