package day1.java;

public class Ford extends Car{

	Ford(int fuelCapacity) {
		super(fuelCapacity);
		System.out.println("Car Ford is creating .....");
		// TODO Auto-generated constructor stub
	}
	
	public void musicPlayer() {
		System.out.println("Ford Car comes with music player....");
	}

	@Override
	public void doors() {
		System.out.println("Ford has 2+2 doors .....");
	}

}
