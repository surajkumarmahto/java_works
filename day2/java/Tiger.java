package day2.java;

public class Tiger implements IAnimal{

	@Override
	public void talk() {
		System.out.println("grrrr....... grrrr.......");
		
	}

	@Override
	public void walk() {
		System.out.println("Tigers walks with 2 legs & 2 limbs....");
		
	}

	@Override
	public void shout() {
		System.out.println("GRRRRRRRRRRRRRRRR...........");
		
	}
	
	public void killAndEat() {
		System.out.println("Tiger kills and eat ......");
	}

}
