/*------------------------------------------------------------------------------------------------------------

* Program Name: ArrayOfScores2.java

* Programmer Name: Thomas Godden

* Description:Gets 5 scores and displays the highest and the difference from the highest

* Date: 4/14/2018

---------------------------------------------------------------------------------------------------------------*/

//Imports the scanner
import java.util.Scanner;

public class ArrayOfScores2{
	
	//Main method
	public static void main(String[] args){
		//Defines and initnailzes the Scanner keyboard
		Scanner keyboard = new Scanner(System.in);
		//Defines an array of doubles with length 5 scalled score
		double[] score = new double[5];
		//Defines index and max
		int index;
		double max;
		
		//Prompts the user for 5 scores
		System.out.println("Enter " + score.length + " scores:");
		//Sets the first score to the next inputed double
		score[0] = keyboard.nextDouble();
		//Sets max to the first score
		max = score[0];
		
		//Loops through the array
		for (index = 1; index<score.length; index++){
			//Sets the next score equal to the next inputed double
			score[index] = keyboard.nextDouble();
			//If the current score is greater then the max, set the max equal to the current score
			if(score[index] > max)
				max = score[index];
		}
		
		//Display highest score and the list of scores with how much they differ from the max
		System.out.println("The highest score is " + max);
		System.out.println("The scores are:");
		for(index = 0; index<score.length; index++)
			System.out.println(score[index] + " differs from max by " + (max - score[index]));
	}
}