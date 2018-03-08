import java.util.Scanner;
 
 
 public class CableCompany
 	{
 		public static void main(String[] args)
 		{
 			Scanner kb = new Scanner(System.in);
 			
 			double processing_fee, service_fee, premium_channels_price, total;
 			int account_number, numberOf_premium_channels, numberOf_basic_connectoins;
 			
 			System.out.println("Welcome to the Cable Company Billing program!");
 			System.out.println("Please enter your account number: ");
 			account_number = kb.nextInt();
 			
 			System.out.println("Are you a residential customer or business customer?\npress R for residential, or B for business");
 			char customer_type = kb.next().charAt(0);
 			
 			if ((customer_type == 'R') || (customer_type == 'r'))
 				{
 					processing_fee = 4.50;
 					service_fee = 20.50;
 					
 					System.out.println("Please enter how many premium channels you'd like to order: ");
 					numberOf_premium_channels = kb.nextInt();
 					premium_channels_price = 7.50*numberOf_premium_channels;
 					total = premium_channels_price + processing_fee + service_fee;
 					
 					System.out.printf("Your total bill for today is: $%.2f\n", total);
 				}
 			
 				else
 				
 				
 				processing_fee = 15;
				service_fee = 75;
				premium_channels_price = 50;
			
				System.out.println("Please enter the number of basic connections");
				numberOf_basic_connectoins = kb.nextInt();
				
				System.out.println("Please enter the number of premium channels");
				numberOf_premium_channels = kb.nextInt();
			
					if(numberOf_basic_connectoins<=10)
						{
					total = processing_fee + service_fee + premium_channels_price*numberOf_premium_channels;
						}
						
						else{
							total = processing_fee + service_fee + 5*(numberOf_basic_connectoins-10) + premium_channels_price*numberOf_premium_channels;
								}


 				System.out.printf("Your bill total is $%.2f", total);
		
 		}
 	}
 
 
 
