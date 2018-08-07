package day2.java;

public class Account {
     int balance;
     
     public Account(int balance ) {
    	 this.balance = balance;
    	 
     }
     
     public synchronized void withdraw(int amount) {
    	 if ( amount < balance) {
    		 try {
    			 Thread.sleep(1000);
    			 balance= balance-amount;
    			 System.out.println("You have withdrawn amount " + amount + ", Remaining Balance = " + balance);
    			 
    		 }
    		 catch (InterruptedException e){
    			 e.printStackTrace();
    			 
    		 }
    		 
    		 
    	 }else {
    		 System.out.println("Sorry " + Thread.currentThread().getName() + " you don't have balance");
    		 
    	 }
     }
}
