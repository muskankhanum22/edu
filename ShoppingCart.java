package operators;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The product name :");
		String Product1 = sc.next();
		System.out.println("the price :");
		double Price = sc.nextDouble();
		System.out.println("the Quantity is :");
		int Quantity = sc.nextInt();
		double total = Quantity * Price;
		System.out.println("the total ammout is :" + total);
		double Discount = 0.10 * total;
		double DiscountAmout = total - Discount;
		System.out.println("the Discount is :" +DiscountAmout );
		double tax = DiscountAmout - 0.07*DiscountAmout;
		System.out.println("the Amount of tax deduction is :" +tax);
		double Gst=DiscountAmout*0.18*DiscountAmout;
		System.out.println("the Gst Amount is :" +Gst);
}
}
