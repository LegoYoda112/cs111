/*------------------------------------------------------------------------------------------------------------

* Program Name: ConstructorsDemo.java

* Programmer Name: Thomas Godden

* Description: To test the constructors methods in DateSixthTry

* Date: 4/9/2018

---------------------------------------------------------------------------------------------------------------*/

public class ConstructorsDemo{
	public static void main(String[] args){
		//Creates four date objects
		Date date1 = new Date("December", 16,1770),
			date2 = new Date(1,27,1756),
			date3 = new Date(1882),
			date4 = new Date();
		
		//Prints out the 4 date objects
		System.out.println("Whose birthday is " + date1 + "?");
		System.out.println("Whose birthday is " + date2 + "?");
		System.out.println("Whose birthday is " + date3 + "?");
		System.out.println("The defualt date is " + date4);
	}

}