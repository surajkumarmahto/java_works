package day1.java;

public class CarClient {
	
	public static void doMyJob(Car c) {
		
		System.out.println("************Car Details goes here*************");
		
		c.doors();
        System.out.println("Fuel Capacity: " + c.getFuelCapacity());
        if(c instanceof Ford) {
        	((Ford)c).musicPlayer();
        }
        if(c instanceof Maruti) {
        	System.out.println("Maruti has ABS : "  + ((Maruti)c).isAbs());
        	((Maruti)c).carWheels();
        }
        System.out.println("-------------------------------------");
	}
	
	
	
	
	
	
	
	 public static void main(String args[]) {
		 
		 Car [] cars = new Car [5];
		 
		 cars[0] = new Ford(40);
		 cars[1] = new Maruti(45, false);
		 
		 cars[2] = new Ford(46);
		 cars[3] = new Maruti(34, false);
		 
		 cars[4] = new Ford(56);
		 
		 for(Car temp : cars) {
			 doMyJob(temp);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	    
         
	 }

}





	


