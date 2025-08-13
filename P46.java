package chapter1;
import java.util.Scanner;
public class P46 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the original price of the product: ₹");
	        double originalPrice = sc.nextDouble();

	        System.out.print("Enter the discount percentage: ");
	        double discountPercent = sc.nextDouble();

	        double discountAmount = (discountPercent / 100) * originalPrice;
	        double finalPrice = originalPrice - discountAmount;

	     
	        System.out.printf("Discount Amount: ₹%.2f\n", discountAmount);
	        System.out.printf("Final Price after discount: ₹%.2f\n", finalPrice);

	        sc.close();
	    }
	}