package day1.java;

public class FourWheelersClient {

public static void doMyJob(FourWheelers f) {
		
		System.out.println("************Four Wheelers Details goes here*************");
		
		f.wheels();
        if(f instanceof Jeep) {
        	System.out.println("Fuel Capacity of Jeep : " + ((Jeep)f).getFuelCapacity());
        	
        }
        if(f instanceof TT) {
        	System.out.println("Fuel Capacity of TT : " + ((TT)f).getFuelCapacity());
        	
        }
        System.out.println("-------------------------------------");
	}

    public static void main(String args[]) {
	 
	 FourWheelers [] fw = new FourWheelers [4];
	 
	 fw[0] = new Jeep(40);
	 fw[1] = new Jeep(45);
	 fw[2] = new TT(36);
	 fw[3] = new TT(48);
	 
	 
	 for(FourWheelers temp : fw) {
		 doMyJob(temp);
	 }
	
}
}
