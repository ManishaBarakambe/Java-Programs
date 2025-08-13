package chapter1;
import java.util.Scanner;
public class P42 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the radius of the cylinder: ");
	        double radius = sc.nextDouble();

	        System.out.print("Enter the height of the cylinder: ");
	        double height = sc.nextDouble();

	        double surfaceArea = 2 * Math.PI * radius * (height + radius);

	        System.out.printf("Total surface area of the cylinder is: %.2f\n", surfaceArea);

	        sc.close();
	    }
	}