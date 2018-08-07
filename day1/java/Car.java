package day1.java;

public class Car extends FourWheelers{
   private int fuelCapacity;
   
   Car(int fuelCapacity){
	   this.fuelCapacity = fuelCapacity;
	   System.out.println("Car is creating .....");
   }
   public int getFuelCapacity() {
	   return fuelCapacity;
   }
   public void doors() {
	   System.out.println("All cars comes with 4+1 doors");
	   
   }
   
}
