package chapter1;

import java.util.Scanner;

public class P30 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter radius of the circle: ");
	        double radius = sc.nextDouble();
	        double perimeter = 2 * Math.PI * radius;
	        System.out.printf("Perimeter of the circle: %.2f\n", perimeter);
	        sc.close();
	    }
	}