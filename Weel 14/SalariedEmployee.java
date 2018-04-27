/*------------------------------------------------------------------------------------------------------------

* Program Name: SalariedEmployee.java

* Programmer Name: Thomas Godden

* Description: A class that extends the Employee class to provide functionality for Salaried employees

* Date: 4/26/2018

---------------------------------------------------------------------------------------------------------------*/

public class SalariedEmployee extends Employee{
	
	//Salary variable
	private double salary; //annual
	
	//No arg constructor
	public SalariedEmployee(){
		super();
		salary = 0;
	}
	
	//Full constructor
	public SalariedEmployee(String theName, Date theDate, double theSalary){
		super(theName, theDate);
		if(theSalary >=0){
			salary = theSalary;
		}else{
			System.out.println("Fatal Error: negative salary");
			System.exit(0);
		}
	}
	
	//Duplicate constructor
	public SalariedEmployee(SalariedEmployee originalObject){
		super(originalObject);
		salary = originalObject.salary;
	}
	
	//Returns the salary
	public double getSalary(){
		return salary;
	}
	
	
	//Returns the monthly pay
	public double getPay(){
		return salary/12;
	}
	
	//Set salary, results in an error if salary is less then 0
	public void setSalary(double newSalary){
		if(newSalary >=0){
			salary = newSalary;
		}else{
			System.out.println("Fatal Error: Negative salary.");
			System.exit(0);
		}
	}
	
	//Returns the string form of the SalariedEmployee
	public String toString(){
		return (getName() + " " + getHireDate().toString() + "\n$" + salary + " per year");
	}
	
	//Returns a boolean reperesenting if the SalariedEmployee equals the passed SalariedEmployee "other"
	public boolean equals(SalariedEmployee other){
		return (getName().equals(other.getName()) && getHireDate().equals(other.getHireDate()) && salary == other.salary);
	}
}