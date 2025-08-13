package chapter1;
import java.util.Scanner;
public class P41 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the side length of the cube: ");
	        double side = sc.nextDouble();

	        double lateralSurfaceArea = 4 * side * side;

	        System.out.printf("Lateral surface area of the cube is: %.2f\n", lateralSurfaceArea);

	        sc.close();
	    }
	}