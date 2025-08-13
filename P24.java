package chapter1;

import java.util.Scanner;

public class P24 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the base of the triangle: ");
	        double base = sc.nextDouble();

	        System.out.print("Enter the height of the triangle: ");
	        double height = sc.nextDouble();

	        double area = 0.5 * base * height;

	        System.out.printf("Area of the triangle is: %.2f\n", area);

	        sc.close();
	    }
	}