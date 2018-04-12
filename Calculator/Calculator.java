/*------------------------------------------------------------------------------------------------------------

* Program Name: Calculator.java

* Programmer Name: Thomas Godden

* Description: Contains methods that perform calculatoins on inputed doubles

* Date: 4/11/2018

---------------------------------------------------------------------------------------------------------------*/

//Define the Calculator class
public class Calculator
{
	//Returns the formatted result of adding two numbers
	public static String add(double num1, double num2){
		return (String)(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	//Returns the formatted result of subtracting two numbers
	public static String subtract(double num1, double num2){
		return (String)(num1 + " - " + num2 + " = " + (num1-num2));
	}
	
	//Returns the formatted result of multiplying two numbers
	public static String multiply(double num1, double num2){
		return (String)(num1 + " x " + num2 + " = " + (num1*num2));
	}
	
	//Returns the formatted result of dividing two numbers
	public static String divide(double num1, double num2){
		return (String)(num1 + " ÷ " + num2 + " = " + (num1/num2));
	}
}