package chapter1;

import java.util.Scanner;

public class P29 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the side length of the equilateral triangle: ");
	        double a = sc.nextDouble();

	        double area = (Math.sqrt(3) / 4) * a * a;

	        System.out.printf("Area of the equilateral triangle is: %.2f\n", area);

	        sc.close();
	    }
	}