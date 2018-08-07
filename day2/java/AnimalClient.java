package day2.java;

public class AnimalClient {

	public static void main(String[] args) {
		IAnimal[] animals = new IAnimal[5];
		
		AnimalBL bl = new  AnimalBL();
		animals[0] = new Human(true);
		animals[1] = new Tiger();
		animals[2] = new Human(false);
		animals[3] = new Tiger();
		animals[4] = new Human(true);
		
		
		
		for (IAnimal temp : animals) {
			
			bl.display(temp);
		}
		

	}

}
