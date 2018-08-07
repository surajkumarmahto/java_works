package day2.java;

public class Human extends Eyes implements IAnimal{
	
	public Human(boolean haveSpecialEyes) {
		this.haveSpecialEyes= haveSpecialEyes;
	}
	
    private boolean haveSpecialEyes;
	
	
	public boolean isHaveSpecialEyes() {
		return haveSpecialEyes;
	}


	public void setHaveSpecialEyes(boolean haveSpecialEyes) {
		this.haveSpecialEyes = haveSpecialEyes;
	}


	public void talk() {
		System.out.println("Human Talks with Accent...");
	
		
	}

	
	public void walk() {
		System.out.println("Human walks with Two Legs....");
		
		
	}

	
	public void shout() {
		System.out.println("Human Shouts .... ");
		
	}
	

}
