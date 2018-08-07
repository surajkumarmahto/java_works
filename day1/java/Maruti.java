package day1.java;

public class Maruti extends Car{
	
	
	  boolean isAbs;
      Maruti(int fuelCapacity , boolean isAbs){
    	 super(fuelCapacity); 
    	 this.isAbs=isAbs;
    	 System.out.println("Car Maruti is creating...");
      }
      
      public boolean isAbs() {
    	  
    	  return isAbs;
      }
      public void carWheels() {
    	  System.out.println("Maruti Radial Wheels");
      }

	@Override
	public void doors() {
		System.out.println("Maruti has doors 2+1 .....");
	}
     
}
