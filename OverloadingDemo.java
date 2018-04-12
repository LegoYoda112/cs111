/*------------------------------------------------------------------------------------------------------------

* Program Name: OverloadingDemo.java

* Programmer Name: Thomas Godden

* Description: To test the overloaded methods in DateSixthTry

* Date: 4/9/2018

---------------------------------------------------------------------------------------------------------------*/


public class OverloadingDemo{
	public static void main(String[] args){
		
		//Initializes 3 date variables
		DateSixthTry date1 = new DateSixthTry(), date2 = new DateSixthTry(), date3 = new DateSixthTry();
		
		//Assignes each of them using a different assign method
		date1.setDate(1,2,2008);
		date2.setDate("February", 2, 2008);
		date3.setDate(2008);
		
		//Prints them out
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}
}