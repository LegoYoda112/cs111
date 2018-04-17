/*------------------------------------------------------------------------------------------------------------

* Program Name: GolfScores.java

* Programmer Name: Thomas Godden

* Description: Gets up to 10 golf scores and displayes their difference from the average score

* Date: 4/14/2018

---------------------------------------------------------------------------------------------------------------*/

//imports scanner
import java.util.Scanner;

public class GolfScoresVersion1{
	//The max number of scores that can be inputted
	public static final int MAX_NUMBER_SCORES = 10;
	
	//Main method
	public static void main(String[] args){
		//Array to hold the scores
		PartiallyFilledArray score = new PartiallyFilledArray(MAX_NUMBER_SCORES);
		//integer to hold the number of scores used out of the max
		
		//Prompts the user for the scores
		System.out.println("This program reads gold scores and shows");
		System.out.println("how much each differes from the average");
		System.out.println("Enter golf scores");
		//Fills the array and assigns numberUsed
		fillArray(score);
		//Displays the difference
		showDifference(score);
	}
	
	//Fills the scores array and returns the number of spots used
	public static void fillArray(PartiallyFilledArray a){
		//Prompts the user for a list of scores
		System.out.println("Enter up to " + a.getMaxCapacity() + " nonnegative numbers.");
		
		System.out.println("Mark the end of the list with a negative number.");
		Scanner keyboard = new Scanner(System.in);
		
		double next;
		
		
		//Assigns values untill it hits a negative score and then ends
		next = keyboard.nextDouble();
		while((next >=0) && (!a.full())){
			a.add(next);
			next = keyboard.nextDouble();
		}
		
		//If there is still more scores, let the user know that some were cutoff
		if(next >= 0)
			System.out.println("Could only read in" + a.getMaxCapacity() + " input values.");
		
		//Returns how many spots were used
		
	}
	
	//Computes the average of the given array and number of items used within that array
	public static double computeAverage(PartiallyFilledArray a, int numberUsed){
		double total = 0;
		//Calculates total
		for (int index = 0; index < a.getNumberOfElements(); index++)
			total = total + a.getElement(index);
		//If the number of used is not 0, then calculate the average
		if(numberUsed>0){
			return (total/a.getNumberOfElements());
		}else{
			//If not then then ouput an error and return a 0
			System.out.println("ERROR: Trying to average 0 numbers.");
			System.out.println("computeAverage returns 0.");
			return 0;
		}
	}
	
	
	//Ouputs the difference between the average of the given array and the items in that array
	public static void showDifference(PartiallyFilledArray a, int numberUsed){
		
		//Gets the average and displayes it
		double average = computeAverage(a, numberUsed);
		System.out.println("Average of the " + a.getNumberOfElements() + " Scores = " + average);
		
		//Loops through the array and outputs the difference between the average
		System.out.println("The scores are:");
		for (int index = 0; index<a.getNumberOfElements(); index++)
			System.out.println(a.getElement(index) + " differes from average by " + (a.getElement(index) - average));
	}
}