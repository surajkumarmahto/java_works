package day1.java;

public class TT extends FourWheelers{
	private int fuelCapacity;
	TT(int fuelCapacity){
		   this.fuelCapacity = fuelCapacity;
		   System.out.println("TT is creating .....");
	   }
	
	public int getFuelCapacity() {
		   return fuelCapacity;
	   }
	
	
	public void doors() {
		   System.out.println("TT has only one door");
		   
	   }
	
}
