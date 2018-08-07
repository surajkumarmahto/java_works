package day2.java;

public class AnimalBL {
	
	public void display(IAnimal animal)
	{
		System.out.println("--------------------------");
		animal.talk();
        animal.walk();
        animal.shout();
	
	
	if(animal instanceof Human){
		
		if(((Human)animal).isHaveSpecialEyes()){
			((Human)animal).eyeColor();
		}
		else {
			((Human)animal).specialEyes();
		}
        
	}
	if(animal instanceof Tiger) {
		((Tiger)animal).killAndEat();
	}

	}
}