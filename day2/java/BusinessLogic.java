package day2.java;

public class BusinessLogic extends Thread{

	// you should not call run method directly doing so will make your application single threaded application 
	// rather call start from the client , which in turn call OS to create the user level thread 
	// then invokes the method internally
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for (int i=0;i< 500;i++) {
	    	System.out.println("I value" + i + " in thread" + Thread.currentThread().getName());
	        try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	
	    
	    System.out.println("Thread :" + Thread.currentThread().getName() + " exiting!!");
	}
    
}
