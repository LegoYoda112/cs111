/*------------------------------------------------------------------------------------------------------------

* Program Name: Utility.java

* Programmer Name: Thomas Godden

* Description: Contains a find max method

* Date: 4/23/2018

---------------------------------------------------------------------------------------------------------------*/


public class UtilityClass{
	public static int max(int... arg){
		//If no arguments are passed, show an error
		if(arg.length == 0){
			System.out.println("Fatal Error: maximum of zero values.");
			System.exit(0);
		}
		//Set the largest to the first element
		int largest = arg[0];
		//Loops through the array and if it finds a larger element, sets the larges to equal that
		for(int i = 1; i < arg.length; i++)
			if(arg[i]> largest)
				largest = arg[i];
		return largest;
	}
}