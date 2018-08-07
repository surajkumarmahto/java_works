package day2.java;

// if the class has main method then that class is implicitly threaded

public class ThreadClient01 {
	public static void main(String[] args) {
		
		System.out.println("The Thread name is main is:" + Thread.currentThread().getName());
	
	
	BusinessLogic bl = new BusinessLogic();
	BusinessLogic bl2 = new BusinessLogic();
	
	
	bl.setName("laptop");
	bl2.setName("Monitor");
	
	bl.setPriority(Thread.NORM_PRIORITY);
	bl2.setPriority(bl.getPriority()+1);
	// this statement will create OS level thread invoke run
	bl.start();
	bl2.start();
	
    for (int i=0;i< 500;i++) {
	    	System.out.println("I value" + i + " in thread" + Thread.currentThread().getName());
	    }
	    
	System.out.println("Thread :" + Thread.currentThread().getName() + " exiting!!");
	
    

}
}
