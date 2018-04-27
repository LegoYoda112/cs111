/*------------------------------------------------------------------------------------------------------------

* Program Name: VariableParameterDemo.java

* Programmer Name: Thomas Godden

* Description: A selectoin sort class

* Date: 4/23/2018

---------------------------------------------------------------------------------------------------------------*/

import java.util.Scanner;

public class VariableParameterDemo{
	public static void main(String[] args){
		//Prompts the user for three scores and assigns them
		System.out.println("Enter scores for Tom, Dick and Harriet:");
		Scanner keyboard = new Scanner(System.in);
		int tomsScore = keyboard.nextInt();
		int dicksScore = keyboard.nextInt();
		int harrietsScore = keyboard.nextInt();
		
		//Finds the max score and outputs it
		int highestScore = UtilityClass.max(tomsScore, dicksScore, harrietsScore);
		System.out.println("Highest score = " + highestScore);
	}
}