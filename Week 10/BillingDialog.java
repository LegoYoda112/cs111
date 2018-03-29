//Defines the BillingDialog class
public class BillingDialog
{
	//Main method
	public static void main(String[] args){
		//Displays a welcome message
		System.out.println("Welcome to the law offices of");
		System.out.println("Dewey, Cheatham, and Howe.");
		//Instantiates a new Bill object
		Bill yourBill = new Bill();
		//Calls the input time worked, update fee and output bill methods
		yourBill.inputTimeWorked();
		yourBill.updateFee();
		yourBill.outputBill();
		//Displayes a thank you message
		System.out.println("We have placed a lien on your house.");
		System.out.println("It has been our pleasure to work with you.");
	}
}