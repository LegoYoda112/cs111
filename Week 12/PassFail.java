/*------------------------------------------------------------------------------------------------------------

* Program Name: PassFail.java

* Programmer Name: Thomas Godden

* Description: Tells how many students passed or failed a test depending on their scores

* Date: 4/14/2018

---------------------------------------------------------------------------------------------------------------*/

//Imports scanner
import java.util.Scanner;

//Defines the PassFail class
public class PassFail{
	
	//A constant to hold the number of students being inputted
	public static final int NUM_OF_STUDENTS = 15;
	
	public static void main(String[] args){
		//An array to hold the scores
		int[] scores = new int[NUM_OF_STUDENTS];
		//Variables to hold how many students passed or failed the exam
		int passed = 0;
		int failed = 0;
		//Console input scanner
		Scanner scan = new Scanner(System.in);
		
		//Loop repeats once per student
		for(int i = 0; i<scores.length; i++){
			//Promps the user for the students score
			System.out.print("Enter student #" + (i+1) + "'s score: ");
			//Sets the inputted score into inputScore
			int inputScore = (int) scan.nextDouble();
			//Checks if input score is between 0 and 100
			while(inputScore < 0 || inputScore > 100){
				//If not then tell the user and repeat
				System.out.print("Invalid entry, please try again: ");
				inputScore = (int) scan.nextDouble();
			}
			//If the score passed, incremement passed, if it failed incremenet failed
			if(inputScore > 64){
				passed++;
			}else{
				failed++;
			}
			//Put the score into input scores
			scores[i] = inputScore;
		}
		//New lines!
		System.out.println();
		//Tells the user that out of the given students, how many passed and how many failed
		System.out.println("Out of " + NUM_OF_STUDENTS + " students,");
		System.out.println(passed + " students passed the exam and");
		System.out.println(failed + " students failed the exam.");
	}
}