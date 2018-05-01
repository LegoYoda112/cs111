
//Driver class for Sale and DiscountSale
public class StaticMethodsDemo{
	public static void main(String[] args){
		//Prints out what class sale is in
		Sale.announcement();
		//Prints out what class DiscountSale is in
		DiscountSale.announcement();
		
		System.out.println("That showed that you can override a static method definition.");
		
		//Creates new Sale and DiscountSale variables
		Sale s = new Sale();
		DiscountSale discount = new DiscountSale();
		
		//Prints out what classes they are in
		s.announcement();
		discount.announcement();
		
		System.out.println("No suprises so far, but wait");
		
		//Creates a discount2 variable that is of type Sale, but holds a DiscountSale object
		Sale discount2 = discount;
		System.out.println("discount2 is a DiscountSale object in a Sale variable.");
		System.out.println("Which definitoin of announcement() will it use?");
		
		//Prints out what class discount2 is in
		discount2.announcement();
		System.out.println("It used the Sale versoin of announcement()!");
	}
}