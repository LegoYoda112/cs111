import java.util.Scanner;

public class GradeBook{
	
	private int numberOfStudents;
	private int numberOfQuizzes;
	
	private int[][] grade;
	
	private double[] studentAverage;
	private double[] quizAverage;
	
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
	
	public GradeBook(GradeBook book){
		numberOfStudents = book.numberOfStudents;
		numberOfQuizzes = book.numberOfQuizzes;
		fillGrade(book.grade);
		fillStudentAverage();
		fillQuizAverage();
	}
	
	public GradeBook(){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number of students:");
		numberOfStudents = keyboard.nextInt();
		
		System.out.println("Enter number of quizzes:");
		numberOfQuizzes = keyboard.nextInt();
		
		grade = new int[numberOfStudents][numberOfQuizzes];
		for(int studentNumber = 1; studentNumber <= numberOfStudents; studentNumber++)
			for(int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
				System.out.println("Enter score for student number " + studentNumber);
				System.out.println("on quiz number " + quizNumber);
				grade[studentNumber - 1][quizNumber -1] = keyboard.nextInt();
			}
		fillStudentAverage();
		fillQuizAverage();
	}
	
	private void fillGrade(int[][] a){
		grade = new int[numberOfStudents][numberOfQuizzes];
		for(int studentNumber = 1; studentNumber<=numberOfStudents; studentNumber++)
			for(int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
				grade[studentNumber-1][quizNumber-1] = a[studentNumber-1][quizNumber-1];
			}
	}
	
	private void fillStudentAverage(){
		studentAverage = new double[numberOfStudents];
		
		for(int studentNumber = 1; studentNumber<=numberOfStudents; studentNumber++){
			double sum = 0;
			for(int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
				sum = sum + grade[studentNumber-1][quizNumber-1];
			}
			
			studentAverage[studentNumber-1] = sum/numberOfQuizzes;
		}
	}
	
	private void fillQuizAverage(){
		quizAverage = new double[numberOfQuizzes];
		
		for(int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
			double sum = 0;
			for(int studentNumber = 1; studentNumber<=numberOfStudents; studentNumber++){
				sum = sum + grade[studentNumber-1][quizNumber - 1];
			}
			quizAverage[quizNumber-1] = sum/numberOfStudents;
		}
	}
	
	public void display(){
		for(int studentNumber = 1; studentNumber<=numberOfStudents; studentNumber++){
			System.out.print("Student " + studentNumber + " Quizzes: ");
			for(int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
				System.out.print(grade[studentNumber-1][quizNumber-1]+" ");
			}
			System.out.println("Ave = " + studentAverage[studentNumber -1]);
		}
		
		System.out.println("Quiz averages");
		
		for(int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++){
			System.out.print("Quiz " + quizNumber + " Ave = " + quizAverage[quizNumber-1] + " ");
		}
		
		System.out.println();
	}
}