/*------------------------------------------------------------------------------------------------------------

* Program Name: EqualsAndToStringDemo.java

* Programmer Name: Thomas Godden

* Description: To demonstrate the methods we wrote in DateFourthTry

* Date: 3/29/2018

---------------------------------------------------------------------------------------------------------------*/


//Defines the EqualsAndToStringDemo
public class EqualsAndToStringDemo
{
	//Main method
	public static void main(String[] args){
		//Instanciates DateFourthTry and declares the date1 and date2 variables
		DateFourthTry date1 = new DateFourthTry(), date2 = new DateFourthTry();
		
		//Sets date1 and date2 to month = 6, day = 17 and year = 1882
		date1.setDate(6,17,1882);
		date2.setDate(6,17,1882);
		
		//If date1 equals date2, then display that it does, if not display that it does not
		if(date1.equals(date2))
			System.out.println(date1+ " equals " + date2);
		else
			System.out.println(date1+ " does not equal " + date2);
		
		//Set date1 to month = 7. day = 28 and year = 1750
		date1.setDate(7,28,1750);
		
		//If date1 comes before date2, then display that it does, if not then display that it doesn't
		if(date1.precedes(date2))
			System.out.println(date1 + " comes before " + date2);
		else
			System.out.println(date2 + " comes before or is equal to " + date1);
	}
}