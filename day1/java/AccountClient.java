package day1.java;

public class AccountClient {
      public static void main(String args[]) {
    	  Account account;
    	  account = new Account();
    	  
    	  Name name = new Name();
    	  
    	  name.setfName("Pratham");
    	  name.setlName("Kumar");
    	  
    	  account.setAccountNo(101);
    	  account.setName(name);
    	  account.setIncome(3600);
    	  
    	  
    	  System.out.println(account);
    	  
    	  Name nam[] = new Name[4];
    	  nam[0] = new Name();
    	  nam[0].setfName("Vineet");
    	  nam[0].setlName("Pandey");
    	  
    	  Account acc[] = new Account[4];
    	  acc[0] = new Account();
    	  acc[0].setAccountNo(102);
    	  acc[0].setIncome(50000);
    	  acc[0].setName(nam[0]);
    	  
    	  System.out.println(acc[0]);
    	  
      }
}
