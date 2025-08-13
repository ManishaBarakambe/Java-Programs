package chapter1;

import java.util.Scanner;

public class P32 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter base of the parallelogram: ");
	        double base = sc.nextDouble();
	        System.out.print("Enter side of the parallelogram: ");
	        double side = sc.nextDouble();
	        double perimeter = 2 * (base + side);
	        System.out.printf("Perimeter of the parallelogram: %.2f\n", perimeter);
	        sc.close();
	    }
	}