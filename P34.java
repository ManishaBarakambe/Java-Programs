package chapter1;
import java.util.Scanner;
public class P34 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter side length of the square: ");
	        double side = sc.nextDouble();
	        double perimeter = 4 * side;
	        System.out.printf("Perimeter of the square: %.2f\n", perimeter);
	        sc.close();
	    }
	}