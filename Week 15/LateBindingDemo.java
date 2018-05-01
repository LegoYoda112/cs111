/*------------------------------------------------------------------------------------------------------------

* Program Name: LateBindingDemo.java

* Programmer Name: Thomas Godden

* Description: A demonstratoin of polymorphism

* Date: 5/1/2018

---------------------------------------------------------------------------------------------------------------*/


//Driver class for Sale and DiscountSale
public class LateBindingDemo{
	public static void main(String[] args){
		//Creates a new sale object
		Sale simple = new Sale("floor mat", 10.00);
		
		//Creates a new discountSale object
		DiscountSale discount = new DiscountSale("floor mat", 11.00, 10);
		
		//Prints both of them out
		System.out.println(simple);
		System.out.println(discount);
		
		//If discount is less then simple, then tell the user, if it isn't then tell the user that they are not
		if(discount.lessThan(simple)){
			System.out.println("Discounted item is cheaper.");
		}else{
			System.out.println("Discount item is not cheaper");
		}
		
		//Creates another sale object
		Sale regularPrice = new Sale ("cup holder", 9.90);
		
		//Creates another discountSale object
		DiscountSale specialPrice = new DiscountSale("cup holder", 11.00, 10);
		
		//Prints them both out
		System.out.println(regularPrice);
		System.out.println(specialPrice);
		
		//If they equal, print it, if they are not, print that they don't
		if (specialPrice.equalDeals(regularPrice)){
			System.out.println("Deals are equal.");
		}else{
			System.out.println("Deals are not equal.");
		}
	}
}