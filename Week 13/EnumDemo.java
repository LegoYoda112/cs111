/*------------------------------------------------------------------------------------------------------------

* Program Name: EnumDemo.java

* Programmer Name: Thomas Godden

* Description: To demonstrate the use of an enum

* Date: 4/23/2018

---------------------------------------------------------------------------------------------------------------*/


public class EnumDemo{
	//Creates a workday enum
	enum WorkDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
	
	public static void main(String[] args){
		//the startDay is monday
		WorkDay startDay = WorkDay.MONDAY;
		//the endDay is friday
		WorkDay endDay = WorkDay.FRIDAY;
		//Prints out the start day and end day
		System.out.println("Work starts on " + startDay);
		System.out.println("Work ends no " + endDay);
	}
}