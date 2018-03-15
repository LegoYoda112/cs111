/*------------------------------------------------------------------------------------------------------------

* Program Name: DateThirdTryDemo.java

* Programmer Name: Thomas Godden

* Description: To use the DateThirdTry class we wrote

* Date: 3/15/2018

---------------------------------------------------------------------------------------------------------------*/

//Defines the DateThirdTryDemo class
public class DateThirdTryDemo {
	//Defines the main method
	public static void main(String[] args){
		//Instantiates DateThirdTry
		DateThirdTry date = new DateThirdTry();
		//Declares and initializes year
		int year = 1882;
		//Set the date in date using the setDateMethod
		date.setDate(6, 17, year);
		//Writes the date out by calling the writeOutput method
		date.writeOutput();
	}
}
