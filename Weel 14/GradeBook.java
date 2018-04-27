/*------------------------------------------------------------------------------------------------------------

* Program Name: GradeBook.java

* Programmer Name: Thomas Godden

* Description: A class that contains gradebook methods

* Date: 4/26/2018

---------------------------------------------------------------------------------------------------------------*/

import java.util.Scanner;

public class GradeBook{
	
	//Number of students and quizzes
	private int numberOfStudents;
	private int numberOfQuizzes;
	
	//Grade array
	private int[][] grade;
	
	//Student average and quiz average array
	private double[] studentAverage;
	private double[] quizAverage;
	
	//Constructor that accepts a list of grades, returns an error if it is empty
	public GradeBook(int[][] a){
		if(a.length == 0 || a[0].length == 0){
			System.out.println("Empty grade records. Aborting.");
			System.exit(0);
		}
		numberOfStudents = a.length;
		numberOfQuizzes = a[0].length;
		fillGrade(a);
		fillStudentAverage();
		fillQuizAverage();
	}
	
	//Duplicating constructor
	public GradeBook(GradeBook book){
		numberOfStudents = book.numberOfStudents;
		numberOfQuizzes = book.numberOfQuizzes;
		fillGrade(book.grade);
		fillStudentAverage();
		fillQuizAverage();
	}
	
	//No arg constructor
	public GradeBook(){
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompts the user for the number of students and quizzes
		System.out.println("Enter number of students:");
		numberOfStudents = keyboard.nextInt();
		System.out.println("Enter number of quizzes:");
		numberOfQuizzes = keyboard.nextInt();
		
		//Creates the grade array
		grade = new int[numberOfStudents][numberOfQuizzes];
		
		//Populates the grade array
		for(int studentNumber = 1; studentNumber <= numberOfStudents; studentNumber++)
			for(int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
				System.out.println("Enter score for student number " + studentNumber);
				System.out.println("on quiz number " + quizNumber);
				grade[studentNumber - 1][quizNumber -1] = keyboard.nextInt();
			}
		//Calculates the student and quiz average
		fillStudentAverage();
		fillQuizAverage();
	}
	
	//Fills the grade array given an array of grades
	private void fillGrade(int[][] a){
		grade = new int[numberOfStudents][numberOfQuizzes];
		for(int studentNumber = 1; studentNumber<=numberOfStudents; studentNumber++)
			for(int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
				grade[studentNumber-1][quizNumber-1] = a[studentNumber-1][quizNumber-1];
			}
	}
	
	//Calculates the student averages
	private void fillStudentAverage(){
		studentAverage = new double[numberOfStudents];
		
		
		for(int studentNumber = 1; studentNumber<=numberOfStudents; studentNumber++){
			double sum = 0;
			//Sums the grades for the quiz
			for(int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
				sum = sum + grade[studentNumber-1][quizNumber-1];
			}
			
			//Calculates the average
			studentAverage[studentNumber-1] = sum/numberOfQuizzes;
		}
	}
	
	//Calculates the quiz averages
	private void fillQuizAverage(){
		quizAverage = new double[numberOfQuizzes];
		
		for(int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
			double sum = 0;
			//Sums the grades for the students
			for(int studentNumber = 1; studentNumber<=numberOfStudents; studentNumber++){
				sum = sum + grade[studentNumber-1][quizNumber - 1];
			}
			//Calculates the average
			quizAverage[quizNumber-1] = sum/numberOfStudents;
		}
	}
	
	
	//Prints out the gradebook
	public void display(){
		for(int studentNumber = 1; studentNumber<=numberOfStudents; studentNumber++){
			//Prints out the student number
			System.out.print("Student " + studentNumber + " Quizzes: ");
			//Prints out the individual grades
			for(int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
				System.out.print(grade[studentNumber-1][quizNumber-1]+" ");
			}
			//Prints out the student average
			System.out.println("Ave = " + studentAverage[studentNumber -1]);
		}
		
		System.out.println("Quiz averages");
		
		//Prints out the quizNumber
		for(int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
			System.out.print("Quiz " + quizNumber + " Ave = " + quizAverage[quizNumber-1] + " ");
		}
		
		System.out.println();
	}
}