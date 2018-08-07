package day2.assignment;

public class Projector implements Device{

	
	private boolean state; 
	
	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	@Override
	public void on() {
		this.setState(true);
		
	}

	@Override
	public void off() {
		this.setState(false);
		
	}

	
	
}
