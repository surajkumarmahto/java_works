package day1.java;

public class Jeep extends FourWheelers{
	
	private int fuelCapacity;
	Jeep(int fuelCapacity){
		   this.fuelCapacity = fuelCapacity;
		   System.out.println("Jeep is creating .....");
	   }
	
	public int getFuelCapacity() {
		   return fuelCapacity;
	   }
	
	public void doors() {
		   System.out.println("All Jeep comes with 2+1 doors");
		   
	   }
}
