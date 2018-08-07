package day2.java;

class Rules{
	
}
public class ShoppingLogic  extends Rules implements Runnable{
	
	private String name;
	private int priority;
	private Thread thread;
	
	


//	public ShoppingLogic(String name , int priority) {
//		this.name=name;
//		this.priority=priority;
//		
//		
//		thread=new Thread(this);
//		thread.setPriority(priority);
//		thread.setName(name);
//		
//		thread.start();
//		// will create OS level thread and give a call to run
//		
//		
//	}

	public ShoppingLogic() {
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPriority() {
		return priority;
	}


	public void setPriority(int priority) {
		this.priority = priority;
	}


	public Thread getThread() {
		return thread;
	}


	public void setThread(Thread thread) {
		this.thread = thread;
	}


	@Override
	public void run() {


		for (int i = 0; i < 500; i++) {
			System.out.println("I value is " + i + " in thread " + Thread.currentThread().getName() + " with priority "
					+ Thread.currentThread().getPriority());

		}

		System.out.println("Thread " + Thread.currentThread().getName() +", exiting ");
		
	}




}
