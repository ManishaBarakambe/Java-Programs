package chapter1;
import java.util.Scanner;
public class P37 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter length of the prism: ");
	        double length = sc.nextDouble();

	        System.out.print("Enter width of the prism: ");
	        double width = sc.nextDouble();

	        System.out.print("Enter height of the prism: ");
	        double height = sc.nextDouble();

	        double volume = length * width * height;
	        System.out.printf("Volume of the prism is: %.2f\n", volume);

	        sc.close();
	    }
	}
	