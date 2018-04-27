/*------------------------------------------------------------------------------------------------------------

* Program Name: Employee.java

* Programmer Name: Thomas Godden

* Description: A class that contains employee methods

* Date: 4/26/2018

---------------------------------------------------------------------------------------------------------------*/

public class Employee{
	
	//Name and hire date variables
	private String name;
	private Date hireDate;
	
	
	//No arg constructor
	public Employee(){
		name = "No name";
		hireDate = new Date("January", 1, 1000);
	}
	
	
	//Full constructor
	public Employee(String theName, Date theDate){
		if(theName == null || theDate == null){
			System.out.println("Fatal Error creating employee");
			System.exit(0);
		}
		
		name = theName;
		hireDate = new Date(theDate);
	}
	
	
	//Duplicatig constructor
	public Employee(Employee originalObject){
		name = originalObject.name;
		hireDate = new Date(originalObject.hireDate);
	}
	
	
	//Returns the name
	public String getName(){
		return name;
	}
	
	
	//Returns the hire date
	public Date getHireDate(){
		return new Date(hireDate);
	}
	
	//Sets the name, results in error if newName is empty
	public void setName(String newName){
		if(newName == null){
			System.out.println("Fatal Error setting employee name.");
			System.exit(0);
		}else{
			name = newName;
		}
	}
	
	//Sets the hire date, results in error if newDate is empty
	public void setHireDate(Date newDate){
		if(newDate == null){
			System.out.println("Fatal Error setting employee hire date.");
			System.exit(0);
		}else{
			hireDate = new Date(newDate);
		}
	}
	
	//Returns the employe info in string form
	public String toString(){
		return (name + " " + hireDate.toString());
	}
	
	//Returns a boolean relative to whether the Employee equals otherEmployee
	public boolean equals(Employee otherEmployee){
		return (name.equals(otherEmployee.name) && hireDate.equals(otherEmployee.hireDate));
	}
}