package day2.assignment;

public class DeviceClient {
	
  
	
	
	public static void  getStatusLamp(Lamp temp) {
		
		System.out.println("Lamp status : " + temp.isState());
		
	}
    public static void  getStatusNightLamp(NightLamp temp) {
	
		
		System.out.println("Night Lamp status : " + temp.isState());
		
	}
    public static void  getStatusProjector(Projector temp) {
	
		
		System.out.println("Projector status : " + temp.isState());
		
	}
	
	public static void main(String[] args) {
		
		
		Device [] dev = new Device[3];
		
		dev[0] = new Lamp();
		dev[1] = new NightLamp();
		dev[2] = new Projector();
		
		dev[0].off();
		dev[1].on();
		dev[2].off();
		
		
		getStatusLamp((Lamp) dev[0]);
		getStatusNightLamp((NightLamp) dev[1]);
		getStatusProjector((Projector) dev[2]);
		

	}
}
