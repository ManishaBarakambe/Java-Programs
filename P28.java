package chapter1;

import java.util.Scanner;

public class P28 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the length of diagonal 1: ");
	        double d1 = sc.nextDouble();

	        System.out.print("Enter the length of diagonal 2: ");
	        double d2 = sc.nextDouble();

	        double area = 0.5 * d1 * d2;
	        System.out.printf("Area of the rhombus is: %.2f\n", area);

	        sc.close();
	    }
	}