package day2.java;

public class Employee {
	
	private int empId;
    private String empName;
    private double income;
	
    
    static int counter = 100;
    public Employee(String empName, double income) {
		super();
		this.empId = counter++;
		this.empName = empName;
		this.income = income;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", income=" + income + "]";
	}

	
}
