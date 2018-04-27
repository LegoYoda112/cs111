/*------------------------------------------------------------------------------------------------------------

* Program Name: HourlyEmployee.java

* Programmer Name: Thomas Godden

* Description: A class that extends the Employee class to provide functionality for Hourly employees

* Date: 4/26/2018

---------------------------------------------------------------------------------------------------------------*/


public class HourlyEmployee extends Employee{
	
	//Wage rate and hours varialbes
	private double wageRate;
	private double hours;
	
	
	//No arg constructor
	public HourlyEmployee(){
		super();
		wageRate = 0;
		hours = 0;
	}
	
	
	//Full constructor, results in an error if the wage or hours are less then zero
	public HourlyEmployee(String theName, Date theDate, double theWageRate, double theHours){
		super(theName, theDate);
		if((theWageRate >=0) && theHours >=0){
			wageRate = theWageRate;
			hours = theHours;
		}else{
			System.out.println("Fatal Error: creating an illegal hourly employee");
			System.exit(0);
		}
	}
	
	//Duplicating constructor
	public HourlyEmployee(HourlyEmployee originalObject){
		super(originalObject);
		
		wageRate = originalObject.wageRate;
		hours = originalObject.hours;
	}
	
	//Returns the wageRate
	public double getRate(){
		
		return wageRate;
	}
	
	//Returns the hours
	public double getHours(){
		return hours;
	}
	
	//Returns the net pay
	public double getPay(){
		return wageRate*hours;
	}
	
	//Sets the hours, results in an error if less then zero
	public void setHours(double hoursWorked){
		if(hoursWorked >= 0 ){
			hours = hoursWorked;
		}else{
			System.out.println("Fatal Error: negative hours worked");
			System.exit(0);
		}
	}
	
	//Sets the pay rate, results in error if is less then zero
	public void setRate(double newWageRate){
		if(newWageRate >= 0 ){
			wageRate = newWageRate;
		}else{
			System.out.println("Fatal Error: negative wage rate");
			System.exit(0);
		}
	}
	
	//Returns the string representatoin of the HourlyEmployee
	public String toString(){
		return (getName() + " " + getHireDate().toString() + "\n$" + wageRate + " per hour for " + hours + " hours");
	}
	
	//Returns a boolean reperesenting if the HourlyEmployee equals the passed HourlyEmployee "other"
	public boolean equals(HourlyEmployee other){
		return (getName().equals(other.getName()) && getHireDate().equals(other.getHireDate()) && wageRate == other.wageRate && hours == other.hours);
	}
}