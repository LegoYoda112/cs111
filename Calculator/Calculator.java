/*------------------------------------------------------------------------------------------------------------

* Program Name: CalculatorPartTwo.java

* Programmer Name: Thomas Godden

* Description: To gain some practice using loops and switch structures

* Date: 3/12/2018

---------------------------------------------------------------------------------------------------------------*/

//import the Scanner class
import java.util.Scanner;

//Define the CalculatorPartTwo class
public class Calculator
{
	//Define the main method
	public static void main(String args[]){
		
		//Initialize variables
		double num1, num2;
		char selection;
		Scanner keyboard = new Scanner(System.in);
		
		do{
			//Display the title and the list of options
			System.out.println("____ Calculator program _____");
			System.out.println("A: Add \nB: Subtract \nC: Multiply \nD: Divide \nX: Exit");
			
			//Prompt the user for a selection
			System.out.println("Please make a selectoin");
			//Set selection to be the next user inputted character
			selection = keyboard.next().toUpperCase().charAt(0);
			
			//Runs the calculatoin code if selectoin is A,B,C or D
			if((selection == 'A')||(selection == 'B')||(selection == 'C')||(selection == 'D')){
				
				//Promput the user for the first number
				System.out.println("Please enter the first number");
				//Set num1 equal to the next user inputted double
				num1 = keyboard.nextDouble();
				
				//Promput the user for the first number
				System.out.println("Please enter the second number");
				//Set num2 equal to the next user inputted double
				num2 = keyboard.nextDouble();
			
				//Display the calculated result of num1 and num2 depending on the selectoin and exits if the user enters 'X'
				switch (selection)
				{
					case 'A': System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
							break;
					case 'B': System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
							break;
					case 'C': System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
							break;
					case 'D': System.out.println(num1 + " ÷ " + num2 + " = " + (num1/num2));
							break;
				}
				
			}else if ((selection == 'X')){
				break;	//If it selectoin is X, exit the loop
			}else{
				System.out.println(selection + " is an invalid entry, try again"); //If its anything else, let the user know it was an invalid entry.
			}
		}while(true);
	}
}