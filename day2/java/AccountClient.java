package day2.java;

public class AccountClient implements Runnable{
      Account account;
      String name;
      int amount;
      
      AccountClient(String name, int amount , Account account){ 
    	  this.account=account;
    	  this.name=name;
    	  this.amount=amount;
    	  new Thread(this, name).start();
    	  
      }
      
      public void run() {
    	  
    	  synchronized (account) {
    		  account.withdraw(amount);
		}
    	  
      }
      
      public static void main(String[] args) {
		Account account = new Account(1000);
		
		new AccountClient("Naveen", 500 , account);
		new AccountClient("Vinod", 750 , account);
		
	}
}
