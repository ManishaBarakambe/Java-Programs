package chapter1;
import java.util.Scanner;

public class P33 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter length of the rectangle: ");
	        double length = sc.nextDouble();
	        System.out.print("Enter width of the rectangle: ");
	        double width = sc.nextDouble();
	        double perimeter = 2 * (length + width);
	        System.out.printf("Perimeter of the rectangle: %.2f\n", perimeter);
	        sc.close();
	    }
	}