/*------------------------------------------------------------------------------------------------------------

* Program Name: Array5A.java

* Programmer Name: Thomas Godden

* Description: Sets and then outputs 4 elements of an array

* Date: 4/19/2018

---------------------------------------------------------------------------------------------------------------*/

public class Array5B{
	public static void main(String[] args){
		//Creates a salary array with four elements
		double[] salary = {5.25, 6.55, 10.25, 16.85};
		
		//Prints out the values in the array one by one
		System.out.println("Salaries one by one are");
		for(int i = 0; i<salary.length; i++)
			System.out.println(salary[i]);
	}
}