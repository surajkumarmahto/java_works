package day1.java;

public class Account {
	
	
	  //constructors
	  Account(){
		  super();
	  }
	
	
      private int accountNo;
      private Name name;
      private double income;
      
      
      //methods or behaviour in oops
      
    


	void display() {
    	  System.out.println("Account No." + this.accountNo);
    	  System.out.println("First Name : " + this.getName().getfName());
    	  System.out.println("Last Name : " + this.getName().getlName());
    	  System.out.println("Income : " + this.income);
    	  
      }
	
	
    @Override
	public String toString() {
			// TODO Auto-generated method stub
			return this.accountNo + " , " + this.name + " , " + this.income;
	}

	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}



	public Name getName() {
		return name;
	}


	public void setName(Name name) {
		this.name = name;
	}


	public double getIncome() {
		return income;
	}


	public void setIncome(double income) {
		if(income < 5000) {
			System.out.println("Sorry Income is too less!");
			this.income = 5000;
		}else
		{
			this.income=income;
		}
		
		this.income = income;
	}
	
	
      

}
