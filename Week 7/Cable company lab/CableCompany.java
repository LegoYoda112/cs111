import java.util.Scanner;

public class CableCompany{
	
	public static void main(String args[]){
		int accountNumber, numberOf_basic_connectoins, numberOf_premium_channels;
		double processing_fee, service_fee, premium_channels_price, total = 0;
		char customerType;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your account number");
		accountNumber = kb.nextInt();
		
		System.out.println("Please enter your customer type r or b");
		customerType = kb.next().charAt(0);
		
		System.out.println(accountNumber + " " + customerType);
		
		if(customerType == 'r'|| customerType == 'R'){
			
			
		}else{
			processing_fee = 15;
			service_fee = 75;
			premium_channels_price = 50;
			
			System.out.println("Please enter the number of basic connections");
			numberOf_basic_connectoins = kb.nextInt();
			System.out.println("Please enter the number of premium channels");
			numberOf_premium_channels = kb.nextInt();
			
			if(numberOf_basic_connectoins<=10){
				total = processing_fee + service_fee + premium_channels_price*numberOf_premium_channels;
			}else{
				total = processing_fee + service_fee + 5*(numberOf_basic_connectoins-10) + premium_channels_price*numberOf_premium_channels;
			}
		}
		System.out.printf("Your bill total is $%.2f", total);
	}
		
}